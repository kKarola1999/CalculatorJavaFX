package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class JavaFXController {
    float data = 0f;
    int operation = -1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea taDisplay;

    @FXML
    private Button btnC;

    @FXML
    private Button btnZ;

    @FXML
    private Button btnP;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btn0;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqual;


    @FXML
    void onButtonClick(ActionEvent event) {

        if (event.getSource() == btn0) {

            taDisplay.setText(taDisplay.getText() + "0");


        } else if (event.getSource() == btnC) {
            taDisplay.setText("");
        } else if (event.getSource() == btnPlus) {
            data = Float.parseFloat(taDisplay.getText());
            operation = 1; //Addition
            taDisplay.setText("");

        } else if (event.getSource() == btnDot) {
            taDisplay.setText(taDisplay.getText() + ".");
            try {
                data = Float.parseFloat(taDisplay.getText());

            } catch (NumberFormatException e) {
                taDisplay.setText(taDisplay.getText());
            }

        } else if (event.getSource() == btnMinus) {
            data = Float.parseFloat(taDisplay.getText());
            operation = 2; //Substraction
            taDisplay.setText("");
        } else if (event.getSource() == btnMulti) {
            data = Float.parseFloat(taDisplay.getText());
            operation = 3; //Mul
            taDisplay.setText("");
            data = Float.parseFloat(taDisplay.getText());
        } else if (event.getSource() == btnDivision) {
            data = Float.parseFloat(taDisplay.getText());
            operation = 4; //Division
            taDisplay.setText("");
        } else if (event.getSource() == btnZ) {
            data = Float.parseFloat(taDisplay.getText());
            taDisplay.setText(String.valueOf(-data));

        } else if (event.getSource() == btnP) {
            data = Float.parseFloat(taDisplay.getText());
            taDisplay.setText(String.valueOf(data / 100));
        } else if (event.getSource() == btnEqual) {
            Float secondOperand = Float.parseFloat(taDisplay.getText());
            switch (operation) {
                case 1: //Addition
                    Float ans = secondOperand + data;
                    taDisplay.setText(String.valueOf(ans));
                    break;
                case 2: //Subtraction
                    ans = data - secondOperand;
                    taDisplay.setText(String.valueOf(ans));
                    break;
                case 3: //Mul
                    ans = data * secondOperand;
                    taDisplay.setText(String.valueOf(ans));
                    break;
                case 4: //Div
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        taDisplay.setText("Error");
                    }
                    taDisplay.setText(String.valueOf(ans));
                    break;


            }
        }
    }

    @FXML
    void onNumberClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        String label = button.getText();
        String text = taDisplay.getText();
        text = text + label;
        taDisplay.setText(text);

    }


    @FXML
    void initialize() {
        assert taDisplay != null : "fx:id=\"taDisplay\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnZ != null : "fx:id=\"btnZ\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnP != null : "fx:id=\"btnP\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDivision != null : "fx:id=\"btnDivision\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnMulti != null : "fx:id=\"btnMulti\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnMinus != null : "fx:id=\"btnMinus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnPlus != null : "fx:id=\"btnPlus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnEqual != null : "fx:id=\"btnEqual\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}





