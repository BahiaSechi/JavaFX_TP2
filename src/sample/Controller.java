package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.text.html.ImageView;
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

    boolean isFileSaved = false;
    boolean isFileNamed = false;
    String workingString;

    @FXML
    private Label lignes, caracteres;

    @FXML
    private TextArea textHtml;

    @FXML
    private WebView viewHtml;

    @FXML
    WebEngine engine;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void updateView() {
        caracteres.setText(Integer.toString(textHtml.getText().length()));
        String tempcount = textHtml.getText();
        String[] linearray = tempcount.split("\n");
        lignes.setText(Integer.toString(linearray.length));
       // engine = viewHtml.getEngine();
       // engine.loadContent(textHtml.getText());
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

    public void copy(ActionEvent actionEvent) {
    // workingString = textHtml.getSelectedText();
    }

    public void paste(ActionEvent actionEvent) {
     // textHtml.setText(workingString);
    }

    public void newFile(ActionEvent actionEvent) {
    }

    public void openFile(ActionEvent actionEvent) { }

    public void saveFile(ActionEvent actionEvent) { }

    public void saveFileAs(ActionEvent actionEvent) { }

    public void closeFile(ActionEvent actionEvent) { }

    public void quit(ActionEvent actionEvent) {
        Platform.exit();
    }



}
