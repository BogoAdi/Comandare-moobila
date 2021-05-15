import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        UserService.initDatabase();
        //initializare Baza de date de produse
        ProdusService.initDatabase();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("test.fxml"));
        primaryStage.setTitle("Comanda Mobila");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
