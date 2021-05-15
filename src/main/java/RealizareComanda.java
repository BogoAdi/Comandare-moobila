import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class RealizareComanda {
    private Stage window1;
    private Scene scene;
    private Parent root;
    @FXML
    private Button BackButton;
    @FXML
    private ChoiceBox<String> alegereProdus;
    @FXML
    private TextField numeClient;
    @FXML
    private TextField oras;
    @FXML
    private TextField strada;
    @FXML
    private TextField numarCasa;
    @FXML
    private Button sendButton;
    @FXML
    private Text mesaj;
    @FXML
    private CheckBox checkBox;

}

