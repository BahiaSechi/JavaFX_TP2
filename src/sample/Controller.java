package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

import java.awt.*;

public class Controller {

    @FXML
    private TextField caracteres, lignes;

    public void initialisation() {
        caracteres.setText("0");
        lignes.setText("0");
    }



}
