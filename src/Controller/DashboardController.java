package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

        @FXML
        private Button addAppointment;

        @FXML
        private Button addCustomer;

        @FXML
        private RadioButton appMonthRadio;

        @FXML
        private RadioButton appWeekRadio;

        @FXML
        private TableColumn<?, ?> appointmentIdCol;

        @FXML
        private TableColumn<?, ?> appointmentTitleCol;

        @FXML
        private TableColumn<?, ?> contactCol;

        @FXML
        private TableColumn<?, ?> countryCol;

        @FXML
        private TableColumn<?, ?> customerAddressCol;

        @FXML
        private TableColumn<?, ?> customerIdCol;

        @FXML
        private TableColumn<?, ?> customerIdCol2;

        @FXML
        private TableColumn<?, ?> customerNameCol;

        @FXML
        private TableView<?> customerTable;

        @FXML
        private Button deleteAppointment;

        @FXML
        private Button deleteCustomer;

        @FXML
        private TableColumn<?, ?> descriptionCol;

        @FXML
        private TableColumn<?, ?> endCol;

        @FXML
        private TableColumn<?, ?> firstLevelDivCol;

        @FXML
        private TableColumn<?, ?> locationCol;

        @FXML
        private Button logOut;

        @FXML
        private TableColumn<?, ?> phoneNumCol;

        @FXML
        private TableColumn<?, ?> postalCodeCol;

        @FXML
        private Button reports1;

        @FXML
        private Button reports2;

        @FXML
        private TableColumn<?, ?> startCol;

        @FXML
        private Button updateAppointment;

        @FXML
        private Button updateCustomer;

        @FXML
        private TableColumn<?, ?> userIdCol;

        @FXML
        void onAddAppointment(ActionEvent event) {

        }

        @FXML
        void onAddCustomer(ActionEvent event) {

        }

        @FXML
        void onAppMonth(ActionEvent event) {

        }

        @FXML
        void onAppWeek(ActionEvent event) {

        }

        @FXML
        void onDeleteAppointment(ActionEvent event) {

        }

        @FXML
        void onDeleteCustomer(ActionEvent event) {

        }

        @FXML
        void onLogOut(ActionEvent event) {

        }

        @FXML
        void onReports1(ActionEvent event) {

        }

        @FXML
        void onReports2(ActionEvent event) {

        }

        @FXML
        void onUpdateAppointment(ActionEvent event) {

        }

        @FXML
        void onUpdateCustomer(ActionEvent event) {

        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


