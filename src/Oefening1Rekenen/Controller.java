package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void clicked_Maal(MouseEvent mouseEvent) {
        FunctieDelen();
    }

    //Fucntie voor delen
    private void FunctieDelen() {
        try
        {
            double dGetal1 = Double.parseDouble(txtGetal1.getText());
            double dGetal2 = Double.parseDouble(txtGetal2.getText());

            double dDelen = dGetal1 / dGetal2;

            lblUitkomst.setText(String.valueOf(dDelen));
        }
        catch (NumberFormatException nfex)
        {
            lblUitkomst.setText("Gelieve enkel cijfers te gebruiken");
        }
    }
}


