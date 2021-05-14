import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
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



    public void handleLoginAction() throws Exception{
        Stage Prim = (Stage) registrationMessage.getScene().getWindow();

        try {
            String role = getUserRole(ultiC.getText(), passC.getText());
            User.setCurrentUser(ultiC.getText());
            if(role.equals("Client")){

                ;
            }
            else{
                ;
            }
        }catch (AccountException e) {
            registrationMessage.setText(e.getMessage());
        }
    }

    public void handleCreateAccountAction() throws Exception{

        Stage pri = (Stage) registrationMessage.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/register.fxml"));
        Scene nextScene = new Scene(root);

        pri.setScene(nextScene);
    }
}

