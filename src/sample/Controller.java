package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Stimmungen tunes = new Stimmungen();
    Toene notes = new Toene();

    @FXML
    ComboBox<String> combS1, combS2, combS3, combS4, combS5, combS6;
    @FXML
    ComboBox<String> combStimmung;
    @FXML
    ComboBox<String> combGrundton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        combStimmung.getItems().addAll(tunes.getAllTunes());
        combGrundton.getItems().addAll(notes.getAllNotes());
        combS1.getItems().addAll(notes.getAllNotes());
        combS2.getItems().addAll(notes.getAllNotes());
        combS3.getItems().addAll(notes.getAllNotes());
        combS4.getItems().addAll(notes.getAllNotes());
        combS5.getItems().addAll(notes.getAllNotes());
        combS6.getItems().addAll(notes.getAllNotes());
    }

    @FXML
    private void combTuneAction(ActionEvent event) {
        String chosenTune = combStimmung.getValue();
        String [] allStrings = tunes.getSaitenBelegung(chosenTune);
        combS1.setValue(allStrings[0]);
        combS2.setValue(allStrings[1]);
        combS3.setValue(allStrings[2]);
        combS4.setValue(allStrings[3]);
        combS5.setValue(allStrings[4]);
        combS6.setValue(allStrings[5]);
    }


}
