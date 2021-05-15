import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProdusNou{

        private Stage window1;
        private Scene scene;
        private Parent root;
        @FXML
        private Button backButton;
        @FXML
        private Button addButton;
        @FXML
        private TextField nume;
        @FXML
        private TextField lemn;
        @FXML
        private TextField pret;
        @FXML
        private Text mesaj;

        public void goBack()throws Exception {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuManager.fxml"));
            window1 = (Stage)backButton.getScene().getWindow();
            window1.setScene(new Scene(root));
        }



}
