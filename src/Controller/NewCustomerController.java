package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewCustomerController implements Initializable {

    @FXML
    private Button cancelNewCustomer;

    @FXML
    private Label customerAddress;

    @FXML
    private TextField customerAddressTF;

    @FXML
    private Label customerCountry;

    @FXML
    private ComboBox<?> customerCountryCombo;

    @FXML
    private Label customerId;

    @FXML
    private TextField customerIdTF;

    @FXML
    private Label customerName;

    @FXML
    private TextField customerNameTF;

    @FXML
    private Label firstLevelDiv;

    @FXML
    private ComboBox<?> firstLevelDivCombo;

    @FXML
    private Label phoneNumber;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private Label postalCode;

    @FXML
    private TextField postalCodeTF;

    @FXML
    private Button saveNewCustomer;

    @FXML
    void onCancelNewCustomer(ActionEvent event) {

    }

    @FXML
    void onCustmerCountry(ActionEvent event) {

    }

    @FXML
    void onFirstLevelDiv(ActionEvent event) {

    }

    @FXML
    void onSaveNewCustomer(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

