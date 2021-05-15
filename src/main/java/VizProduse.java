import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
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
}
