package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void myMinFunction(double num1,double num2){
        double dResult;
        dResult= num1-num2;
        lblUitkomst.setText(String.valueOf(dResult));
    }

    public void btnMin(MouseEvent mouseEvent) {
        Double Dnum1, Dnum2;
        try {
            Dnum1 = Double.parseDouble(txtGetal1.getText());
            Dnum2 = Double.parseDouble(txtGetal2.getText());
            myMinFunction(Dnum1, Dnum2);
            JOptionPane.showMessageDialog(null, "just for testing purposes");
        } catch (NumberFormatException exc1) {
            JOptionPane.showMessageDialog(null,"gelieve enkel cijfers te gebruiken");
        }
    }
}
