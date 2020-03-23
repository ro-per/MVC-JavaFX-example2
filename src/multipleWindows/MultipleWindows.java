package multipleWindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleWindows extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {


        Button button=new Button("Click me!");
        button.setOnAction(event -> {
            boolean result = ConfirmBox.show("Title","message");
            System.out.println("The users answer was: "+result);
        });

        VBox root = new VBox(button);
        Scene scene = new Scene(root,200,150);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
