package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDataController {

    @FXML
    private TextField textEmail;

    @FXML
    private PasswordField textPassword1;

    @FXML
    private PasswordField textPassword2;

    @FXML
    private Label btnLogin;

    private final String DB_URL = "jdbc:mysql://localhost:3306/my_games";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "2005";

    @FXML
    public void initialize() {
        btnLogin.setOnMouseClicked(event -> registerAccount());
    }

    private void registerAccount() {
        String email = textEmail.getText();
        String password1 = textPassword1.getText();
        String password2 = textPassword2.getText();

        if (email.isEmpty() || password1.isEmpty() || password2.isEmpty()) {
            System.out.println("All fields are required!");
            return;
        }

        if (!password1.equals(password2)) {
            System.out.println("Passwords do not match!");
            return;
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO users (mail, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password1);
                preparedStatement.executeUpdate();
                System.out.println("User registered successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
