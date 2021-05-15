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
        private TableColumn<Produs, String> lemnColoana;

        @FXML
        private TableColumn<Produs, Integer> pretColoana;
        @FXML
        private TableColumn<Comanda, String> orasColoana;
        @FXML
        private TableColumn<Comanda, String> stradaColoana;
        @FXML
        private TableColumn<Comanda, String> numarColoana;

        @FXML
        private TableColumn<Comanda, Boolean>  asistentaColoana;


        @FXML
        private Button backButton;

        @FXML
        private Label label1;


        private ObservableList<Comanda> comenzi = FXCollections.observableArrayList(ComandaService.comenzi());


        public void initialize() {

        produsColoana.setCellValueFactory(new PropertyValueFactory<>("Mobila"));
        lemnColoana.setCellValueFactory(new PropertyValueFactory<>("Lemn"));
        orasColoana.setCellValueFactory(new PropertyValueFactory<>("oras"));
        pretColoana.setCellValueFactory(new PropertyValueFactory<>("pret"));
        stradaColoana.setCellValueFactory(new PropertyValueFactory<>("strada"));
        numarColoana.setCellValueFactory(new PropertyValueFactory<>("numarCasa"));
        asistentaColoana.setCellValueFactory(new PropertyValueFactory<>("asistenta"));

        comenziTabel.setItems(comenzi);


    }


    }
}
