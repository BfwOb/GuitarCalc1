package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



    @FXML ChoiceBox choiceS1,choiceS2,choiceS3,choiceS4,choiceS5,choiceS6;
    @FXML ComboBox<String> combStimmung;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        combStimmung.getItems().addAll("Standart","Open");

    }
    public void testStandart(){


    }
}
