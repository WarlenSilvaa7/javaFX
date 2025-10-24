package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import util.Alerts;

public class ViewController {

    @FXML
    private Button btTest;

    public void onBtTestAction(){
    Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);
    }
}
