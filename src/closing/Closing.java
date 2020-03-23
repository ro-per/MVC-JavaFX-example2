package closing;

import helloworld.MyEventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import multipleWindows.ConfirmBox;

public class Closing extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Button btn = new Button();
        btn.setText("Close!");

        btn.setOnAction(event -> closeProgramClean());

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgramClean();
        });


        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);


        window.setTitle("Closing - the good way!");
        window.setScene(scene);
        window.show();
    }

    private void closeProgramClean() {
        boolean answer = ConfirmBox.show("Close window", "Sure you want to exit?");
        if (answer) {
            System.out.println("Cleaning up, and closing ...");
            window.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}