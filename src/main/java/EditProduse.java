import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static javax.swing.JOptionPane.showMessageDialog;

public class EditProduse {

    private Stage window1;
    private Scene scene;
    private Parent root;
    @FXML
    private Button backButton;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private TableView<Produs> tableaProduse;
    @FXML
    private TableColumn<Produs, String> produsColoana;
    @FXML
    private TableColumn<Produs,String> lemnColoana;
    @FXML
    private TableColumn<Produs,Integer> pretColoana;

    private ObservableList<Produs> produse = FXCollections.observableArrayList(ProdusService.pprodus());
    public void initialize() {
        produsColoana.setCellValueFactory(new PropertyValueFactory<>("nume"));
        lemnColoana.setCellValueFactory(new PropertyValueFactory<>("lemn"));
        pretColoana.setCellValueFactory(new PropertyValueFactory<>("pret"));

        tableaProduse.setItems(produse);
    }

    public void goButton() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuManager.fxml"));
        window1 = (Stage)backButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }

    public void DeleteProdus()throws  Exception {

            ObservableList<Produs> produsAles;
            produsAles = tableaProduse.getSelectionModel().getSelectedItems();
            if(produsAles.isEmpty()){
                showMessageDialog(null, "Nici un element nu este selectat");
                return;
            }
            for(Produs produsul : produsAles) {
                ProdusService.stergereProdus(produsul);
            }

            //Reintoarcere la pagina de Editare Produse
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("editProduse.fxml"));
            window1 = (Stage)deleteButton.getScene().getWindow();
            window1.setScene(new Scene(root));
        }



    public void addProduct() throws  Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("produsNou.fxml"));
        window1 = (Stage)addButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }
}
