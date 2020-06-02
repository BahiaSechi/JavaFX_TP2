package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Address :
 * ENSICAEN
 * 6 Boulevard Maréchal Juin
 * F-14050 Caen Cedex
 *
 * Note :
 * This file is owned by an ENSICAEN student.  No portion of this
 * document may be reproduced, copied  or revised without written
 * permission of the authors.
 *
 * @author BURON Manfred <manfred.buron@ecole.ensicaen.fr>
 * @author Bahia SECHI <bahia.sechi@ecole.ensicaen.fr>
 * @version 1.0
 */

public class Controller implements Initializable {

    @FXML
    private TextArea textHtml;

    @FXML
    private WebView viewHtml;

    @FXML
    private TextField caracteres, lignes;

    @FXML
    WebEngine engine;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        caracteres.setText("0");
        lignes.setText("0");
    }

    public void updateView() {
        engine = viewHtml.getEngine();
        engine.loadContent(textHtml.getText());
    }

    public void about(ActionEvent actionEvent) {
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("About");
        about.setContentText("This project is part of the programming course (ENSICAEN - Engineering School). \n" +
                "Authors : BURON Manfred & SECHI Bahia \n" +
                "Date : June 2020");
        about.show();
    }

    public void cut(ActionEvent actionEvent) { }

    public void copy(ActionEvent actionEvent) { }

    public void paste(ActionEvent actionEvent) { }

    public void newFile(ActionEvent actionEvent) { }

    public void openFile(ActionEvent actionEvent) { }

    public void saveFile(ActionEvent actionEvent) { }

    public void saveFileAs(ActionEvent actionEvent) { }

    public void closeFile(ActionEvent actionEvent) { }

    public void quit(ActionEvent actionEvent) {
        ((Stage)(((javafx.scene.control.Button)actionEvent.getSource()).getScene().getWindow())).close();
    }



}
