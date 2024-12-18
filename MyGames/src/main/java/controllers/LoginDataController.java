package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginDataController {

    @FXML
    private Label btnLogin;

    @FXML
    private void handleLoginClick() {
        try {
            // Cargar MainPane desde su archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/MainPane.fxml"));
            AnchorPane mainPane = loader.load();

            // Crear una nueva escena y asignarla al Stage actual
            Stage currentStage = (Stage) btnLogin.getScene().getWindow();
            Scene scene = new Scene(mainPane);
            currentStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
