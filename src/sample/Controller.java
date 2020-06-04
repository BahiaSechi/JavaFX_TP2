package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Clipboard;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

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
    private ImageView newFileImage, openFileImage, saveFileImage, saveFileAsImage;

    @FXML
    private ToggleButton test;

    @FXML
    private Label lignes, caracteres;

    @FXML
    private TextArea textHtml;

    @FXML
    private WebView viewHtml;

    @FXML
    WebEngine engine;

    @FXML
    TabPane tabs;
    private Stage primaryStage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void updateView() {
        engine = viewHtml.getEngine();
        engine.loadContent(textHtml.getText());

        String text = textHtml.getText();
        caracteres.setText(String.valueOf(text.length()));
        caracteres.setText(Integer.toString(textHtml.getText().length()));
        String tempcount = textHtml.getText();
        String[] linearray = tempcount.split("\n");
        lignes.setText(Integer.toString(linearray.length));
       // engine = viewHtml.getEngine();
       // engine.loadContent(textHtml.getText());
    }

    public void about(ActionEvent actionEvent) {
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setContentText("This project is part of the programming course (ENSICAEN - Engineering School). \n" +
                "Authors : BURON Manfred & SECHI Bahia \n" +
                "Date : June 2020");
        about.setTitle("About");
        about.show();
    }

    public void cut(ActionEvent actionEvent) { }

    public void copy(ActionEvent actionEvent) {
    // workingString = textHtml.getSelectedText();
    }

    public void paste(ActionEvent actionEvent) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        textHtml.setText(textHtml.getText() + clipboard.getString());
    }

    public void newFile(ActionEvent actionEvent) {
        /** closeFile();
        isFileNamed = false;
        isFileSaved = false;

        tabs.getTabs().get(0).setText("unnamed.html");
        tabs.getTabs().add(new Tab("unnamed.html"));
         */
    }

    public void openFile(ActionEvent actionEvent) {
       /** // Show files with HTML extension
        FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("HTML files (*.html)", "*.html");
        chooser.getExtensionFilters().add(extFilter);

        final Label fileLabel = new Label();

        // Show open file dialog
        File file = chooser.showOpenDialog(primaryStage);
        if (file != null) {
            fileLabel.setText(file.getPath());
        }

        VBox vBox = new VBox(30);
        vBox.setAlignment(Pos.BASELINE_CENTER);

        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        */
    }

    public void saveFile(ActionEvent actionEvent) { }

    public void saveFileAs(ActionEvent actionEvent) { }

    @FXML
    public void closeFile() { }

    public void quit(ActionEvent actionEvent) {
        Platform.exit();
    }



}
