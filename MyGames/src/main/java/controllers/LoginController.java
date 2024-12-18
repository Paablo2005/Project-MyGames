package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class LoginController {
    @FXML
    private GridPane paneBtnLogin;

    @FXML
    private GridPane paneBtnRegister;

    @FXML
    private BorderPane paneData;

    @FXML
    public void initialize() {
        try {
            // Cargar el FXML del panel de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/LoginDataPane.fxml"));
            Node loginPanel = loader.load();
            // Establecer el contenido en paneData
            paneData.setCenter(loginPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Asignar eventos de clic
        paneBtnLogin.setOnMouseClicked(event -> showLoginContent());
        paneBtnRegister.setOnMouseClicked(event -> showRegisterContent());
    }

    private void showLoginContent() {
        try {
            // Cargar el FXML del panel de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/LoginDataPane.fxml"));
            Node loginPanel = loader.load();
            // Establecer el contenido en paneData
            paneData.setCenter(loginPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showRegisterContent() {
        try {
            // Cargar el FXML del panel de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/RegisterDataPane.fxml"));
            Node loginPanel = loader.load();
            // Establecer el contenido en paneData
            paneData.setCenter(loginPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
