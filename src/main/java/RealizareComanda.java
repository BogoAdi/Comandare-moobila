import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

import javafx.scene.control.Button;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import static javax.swing.JOptionPane.showMessageDialog;

public class RealizareComanda {
    private Stage window1;
    private Scene scene;
    private Parent root;
    @FXML
    Button BackButton;
    @FXML
     ChoiceBox<String> alegereProdus;
    @FXML
    TextField numeClient;
    @FXML
     TextField oras;
    @FXML
     TextField strada;
    @FXML
     TextField numarCasa;
    @FXML
    Button sendButton;

    @FXML
    private CheckBox checkBox;

    public void initialize() {
        ArrayList<String> produse = new ArrayList<>();
        for (Produs pito : ProdusService.pprodus())
            produse.add(pito.getTot());
        alegereProdus.getItems().addAll(produse);

    }
    public void realizareComanda() throws Exception{
        if(alegereProdus.getValue()==null){
            showMessageDialog(null, "Nu este selectat niciun produs");
            return;
        }
        if(numeClient.getText().equals(""))
        {  showMessageDialog(null, "Completati  nume si prenume!");
            return;
        }
        if(oras.getText().equals("")){
            showMessageDialog(null, "Completati Orasul!");
            return;
        }
        if(strada.getText().equals("")){
            showMessageDialog(null, "Va rugam introduceti o strada");
            return;
        }
        if(numarCasa.getText().equals("")){
            showMessageDialog(null, "Va rugam completati numarul de Casa");
            return;
        }
        String Data;

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy , hh ");
        Data = dateFormat.format(date);


        Produs produs=ProdusService.getMobila(alegereProdus.getValue());

        ComandaService.adaugareComanda(User.getCurrentUser(),oras.getText(),strada.getText(),numarCasa.getText(),produs,checkBox.isSelected(),Data);




        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuClient.fxml"));
        Stage window = (Stage) sendButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void GoBack() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("meniuClient.fxml"));
        window1 = (Stage)BackButton.getScene().getWindow();
        window1.setScene(new Scene(root));
    }

}

