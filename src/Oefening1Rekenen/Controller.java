package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void btnPlus(MouseEvent mouseEvent) {
        plus();

    }


    double plus() {
        double Getaluitkomst;
        Getaluitkomst = Double.valueOf(txtGetal1.getText()) + Double.valueOf(txtGetal2.getText());
        lblUitkomst.setText(String.valueOf(Getaluitkomst));
        return Getaluitkomst;
    }

}

