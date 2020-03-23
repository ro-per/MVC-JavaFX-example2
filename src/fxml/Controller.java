package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button ourButton;
    @FXML
    Slider ourSlider;
    @FXML
    TextField ourTextField;

    private Model model =  new Model();


    @FXML
    private void processButtonClick(ActionEvent event){
        System.out.println("Processing button click!");
        //model performs a calculation
        double result = model.doCalculation(ourSlider.getValue());
        ourSlider.setValue(result);
        ourTextField.setText(String.valueOf(result));
    }
}
