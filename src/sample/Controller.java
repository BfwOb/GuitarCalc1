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
        int[] allStrings = tunes.getSaitenBelegung(chosenTune);
        String getGrundton = combGrundton.getValue();
        if (getGrundton == null) {
            getGrundton = "E";
        }
        int valGrundton = notes.getVal(getGrundton);
        // Saite 1
        String s1 = notes.getNote(valGrundton + allStrings[0]);
        combS1.setValue(s1);
        // Saite 2
        String s2 = notes.getNote(valGrundton + allStrings[1]);
        combS2.setValue(s2);
        // Saite 3
        String s3 = notes.getNote(valGrundton + allStrings[2]);
        combS3.setValue(s3);
        // Saite 4
        String s4 = notes.getNote(valGrundton + allStrings[3]);
        combS4.setValue(s4);
        // Saite 5
        String s5 = notes.getNote(valGrundton + allStrings[4]);
        combS5.setValue(s5);
        // Saite 6
        String s6 = notes.getNote(valGrundton + allStrings[5]);
        combS6.setValue(s6);
    }


}
