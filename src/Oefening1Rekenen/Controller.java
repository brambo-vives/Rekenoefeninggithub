package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void btnPlus(MouseEvent mouseEvent) {
        plus();

    }


   public void  plus() {
        try {
            double Getaluitkomst;
            Getaluitkomst = Double.valueOf(txtGetal1.getText()) + Double.valueOf(txtGetal2.getText());
            lblUitkomst.setText(String.valueOf(Getaluitkomst));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "gelieve een getal op te geven");
        }
    }


}

