package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void myMinFunction(double num1,double num2){
        double dResult;
        dResult= num1-num2;
        lblUitkomst.setText(String.valueOf(dResult));
        System.out.println("test");
    }
}
