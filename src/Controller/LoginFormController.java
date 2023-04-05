package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    @FXML
    private Label locationLabel;

    @FXML
    private Button loginButton;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTF;

    @FXML
    private TextField userNameTF;

    @FXML
    private Label usernameLabel;

    @FXML
    void onLogin(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

