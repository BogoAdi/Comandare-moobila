import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginControler{

    @FXML
    private Button CreeazaContB;

    @FXML
    private Text registrationMessage;

    @FXML
    private TextField ultiC;

    @FXML
    private PasswordField passC;
    @FXML private Label testt;


    public void handleCreateAccountAction() throws Exception{

        Stage pri = (Stage) registrationMessage.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("registrare.fxml"));
        Scene nextScene = new Scene(root);

        pri.setScene(nextScene);
    }

    public void handleLoginAction() throws Exception{
        Stage Prim = (Stage) registrationMessage.getScene().getWindow();

        try {
            String role = UserService.getUserRole(ultiC.getText(), passC.getText());
            User.setCurrentUser(ultiC.getText());

            if(role.equals("Client")){
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client1.fxml"));
                Scene nextScene = new Scene(root);
                Prim.setScene(nextScene);
           ;
            }
            else{
               Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniu1.fxml"));
                Scene nextScene = new Scene(root);

                Prim.setScene(nextScene);
                ;//Pagina Meniu Manager
            }
        }catch (AccountException e) {
            registrationMessage.setText(e.getMessage());
        }
    }


}

