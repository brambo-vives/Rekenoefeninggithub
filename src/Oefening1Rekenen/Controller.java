package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void clicked_Maal(MouseEvent mouseEvent) {
        FunctieMaal();
    }

    //Fucntie voor maal
    private void FunctieMaal() {
        double dGetal1 = Double.parseDouble(txtGetal1.getText());
        double dGetal2 = Double.parseDouble(txtGetal2.getText());

        double dMaal = dGetal1 * dGetal2;

        lblUitkomst.setText(String.valueOf(dMaal));
    }
}
