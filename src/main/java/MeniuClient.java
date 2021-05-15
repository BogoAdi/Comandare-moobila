import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MeniuClient  {
    private Stage window1;
    private Scene scene;
    private Parent root;
    @FXML
    private Button LOB;
    @FXML
    private Button ViewProductsButton;
    @FXML
    private Button ComandaButton;
    @FXML
    private Button IstoricButton;


    public void VizualizareProduse() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("vizProduse.fxml"));
        window1 = (Stage)ViewProductsButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }

    public void IstoricComenzi()throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("vizIstoricComenzi.fxml"));
        window1 = (Stage)IstoricButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }


    public void RealizareComanda() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("realizareComanda.fxml"));
        window1 = (Stage)ComandaButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }

    public void Back() throws  Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        window1 = (Stage)LOB.getScene().getWindow();
        window1.setScene(new Scene(root));
    }




}
