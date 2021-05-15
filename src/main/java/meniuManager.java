import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class meniuManager {

    private Stage window1;
    private Scene scene;
    private Parent root;


    @FXML
    private Button backButton;
    @FXML
    private Button viewButton;
    @FXML
    private Button editButton;


    public void ViewOrders() throws Exception {

    }


    public void goToEditPage()throws  Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("editProduse.fxml"));
        window1 = (Stage)editButton.getScene().getWindow();
        window1.setScene(new Scene(root));



    }

    public void goBack() throws  Exception {

    }
}
