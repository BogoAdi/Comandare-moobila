import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
public class VizComenziManager {


        private Stage window1;
        private Scene scene;
        private Parent root;
        @FXML
        private TableView<Comanda> comenziTabel;
        @FXML
        private TableColumn<Comanda, String> produsColoana;
        @FXML
        private TableColumn<Comanda, String> lemnColoana;
        @FXML
        private TableColumn<Comanda,String> numeColoana;
        @FXML
        private TableColumn<Comanda, Integer> pretColoana;
        @FXML
        private TableColumn<Comanda, String> orasColoana;
        @FXML
        private TableColumn<Comanda, String> stradaColoana;
        @FXML
        private TableColumn<Comanda, String> numarColoana;
        @FXML TableColumn<Comanda, String> dataColoana;
        @FXML
        private TableColumn<Comanda, Boolean>  asistentaColoana;


        @FXML
        private Button backButton;

        @FXML
        private Label label1;


        private ObservableList<Comanda> comenzi = FXCollections.observableArrayList(ComandaService.comenzi());


        public void initialize() {
        numeColoana.setCellValueFactory(new PropertyValueFactory<>("numeSiPrenume"));
        produsColoana.setCellValueFactory(new PropertyValueFactory<>("Mobila"));
        lemnColoana.setCellValueFactory(new PropertyValueFactory<>("Lemn"));
        orasColoana.setCellValueFactory(new PropertyValueFactory<>("oras"));
        pretColoana.setCellValueFactory(new PropertyValueFactory<>("pret"));
        stradaColoana.setCellValueFactory(new PropertyValueFactory<>("strada"));
        numarColoana.setCellValueFactory(new PropertyValueFactory<>("numarCasa"));
        asistentaColoana.setCellValueFactory(new PropertyValueFactory<>("asistenta"));
        dataColoana.setCellValueFactory(new PropertyValueFactory<>("Data"));
        comenziTabel.setItems(comenzi);


    }
        public void goBack()throws Exception {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuManager.fxml"));
                window1 = (Stage)backButton.getScene().getWindow();
                window1.setScene(new Scene(root));
        }

    }

