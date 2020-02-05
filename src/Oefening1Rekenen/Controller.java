package Oefening1Rekenen;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblUitkomst;
    public TextField txtGetal1;
    public TextField txtGetal2;

    public void Clicked_Rest(MouseEvent mouseEvent) {
        geefRest();
    }

    public void geefRest(){
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());;
        double rest = getal1 % getal2;
        lblUitkomst.setText(String.valueOf(rest));
    }
}
