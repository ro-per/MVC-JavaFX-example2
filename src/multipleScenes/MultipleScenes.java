package multipleScenes;

import helloworld.MyEventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenes  extends Application {
    Stage window;
    Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        // SCENE 1
        Label label1 = new Label("Welcome to scene 1");
        Button btn1 = new Button();
        btn1.setText("Go to scene 2");
        btn1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20); //vertical layout with spacing of 20 between the items
        layout1.getChildren().addAll(label1,btn1);
        scene1 = new Scene(layout1, 200, 200);
        // ---

        // SCENE 2
        Button btn2 = new Button();
        btn2.setText("Go back to scene 1");
        btn2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);
        // ---

        window.setTitle("Multiple scenes!");
        window.setScene(scene1);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
