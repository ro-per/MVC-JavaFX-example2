package multipleWindows;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    private static boolean answer;

    public static boolean show(String title, String message){
        answer= false; //default answer

        Stage stage = new Stage();
        stage.setTitle(title);
        //stage.initModality(Modality.APPLICATION_MODAL);


        Label label = new Label(message);

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e ->{
            answer=true;
            stage.close();
        } );

        Button noButton = new Button("No");
        noButton.setOnAction(e ->{
            answer=false;
            stage.close();
        } );

        VBox root = new VBox();
        root.getChildren().addAll(label,yesButton,noButton);

        Scene scene = new Scene(root,200,150);
        stage.setScene(scene);
        stage.showAndWait();

        return answer;

    }
}
