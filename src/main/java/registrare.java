import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javax.swing.JOptionPane.showMessageDialog;

public class registrare {
    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    public void initialize() {
        role.getItems().addAll("Client", "Manager");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            if(usernameField.getText().equals("")){
                showMessageDialog(null, "Introduceti numele  de utilizator");
                return;
            }
            if(passwordField.getText().equals("")){
                showMessageDialog(null, "Introduceti parola");
                return;
            }
            if(role.getValue()==null){
                showMessageDialog(null, "Alegeti un Rol");
                return;
            }
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String) role.getValue());
            registrationMessage.setText("Cont creeat!");
        } catch (UsernameAlreadyExists e) {
            registrationMessage.setText(e.getMessage());
        }
    }

    public void handleBackAction() throws Exception{
        Stage primaryStage = (Stage) role.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        Scene newScene = new Scene(root, 800, 600);
        primaryStage.setScene(newScene);
}
}
