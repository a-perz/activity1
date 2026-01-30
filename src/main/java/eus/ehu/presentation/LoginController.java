package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
  @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("admin".equals(username) && "123456".equals(password)) { //correct credentials
            messageLabel.setText("Credentials are correct");
            messageLabel.setStyle("-fx-text-fill: green;");
        
        } else { //incorrect credentials
            messageLabel.setText("Invalid credentials");
            messageLabel.setStyle("-fx-text-fill: red;");
        }

        messageLabel.setVisible(true);
    }
}
