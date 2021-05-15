import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VizProduse {

    private Stage window1;
    private Scene scene;
    private Parent root;


    @FXML
    private Button VPButton;
    @FXML
    private TableView<Produs> tableaProduse;
    @FXML
    private TableColumn<Produs, String> produsColoana;
    @FXML
    private  TableColumn<Produs,String> lemnColoana;
    @FXML
    private TableColumn<Produs,Integer> pretColoana;
    private ObservableList<Produs> produse = FXCollections.observableArrayList(ProdusService.Produs());
    public void initialize() {
        produsColoana.setCellValueFactory(new PropertyValueFactory<>("nume"));
        lemnColoana.setCellValueFactory(new PropertyValueFactory<>("lemn"));
        pretColoana.setCellValueFactory(new PropertyValueFactory<>("pret"));

        tableaProduse.setItems(produse);
        public void GoBack() throws Exception{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuClient.fxml"));
            window1 = (Stage)VPButton.getScene().getWindow();
            window1.setScene(new Scene(root));
        }
    }
}
