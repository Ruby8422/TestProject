package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewAppointmentController implements Initializable {

    @FXML
    private Label appContact;

    @FXML
    private TextField appContactTF;

    @FXML
    private Label appCustomerId;

    @FXML
    private ComboBox<?> appCustomerIdCombo;

    @FXML
    private Label appDescription;

    @FXML
    private TextField appDescriptionTF;

    @FXML
    private Label appLocation;

    @FXML
    private TextField appLocationTF;

    @FXML
    private Label appTitle;

    @FXML
    private TextField appTitleTF;

    @FXML
    private Label appType;

    @FXML
    private TextField appTypeTF;

    @FXML
    private Label appUserId;

    @FXML
    private ComboBox<?> appUserIdCombo;

    @FXML
    private Label appointmentID;

    @FXML
    private TextField appointmentIdTF;

    @FXML
    private Button cancelNewApp;

    @FXML
    private Label endDate;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private Label endTime;

    @FXML
    private TextField endTimeTF;

    @FXML
    private Button saveNewApp;

    @FXML
    private Label startDate;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private Label startTime;

    @FXML
    private TextField startTimeTF;

    @FXML
    void onAppCustomerIdCombo(ActionEvent event) {

    }

    @FXML
    void onAppUserIdCombo(ActionEvent event) {

    }

    @FXML
    void onCancelNewApp(ActionEvent event) {

    }

    @FXML
    void onSaveNewApp(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

