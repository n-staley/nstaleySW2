package Controller;

import Model.Customers;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CustomerDashboardController extends ViewController {
    public TableView<Customers> customersTableView;
    public TableColumn<Customers, Integer> customerIDColumn;
    public TableColumn<Customers, String> nameColumn;
    public TableColumn<Customers, String> phoneNumberColumn;
    public TableColumn<Customers, String> addressColumn;
    public TableColumn<Customers, String> postalCodeColumn;
    public TableColumn<Customers, String> stateOrProvinceColumn;
    public TableColumn<Customers, String> countryColumn;
    public Label customersTableViewLabel;
    public Button addCustomerButton;
    public Button editCustomerButton;
    public Button viewAppointmentsButton;
    public Button viewReportsButton;
    public Button exitButton;
    public Button deleteCustomerButton;
    public AnchorPane mainPane;

    public void toAddCustomer(ActionEvent actionEvent) {
        try {
            switchScene(actionEvent, "/view/AddCustomerForm.fxml", 550, 650, "Add Customer");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void toEditCustomer(ActionEvent actionEvent) {
        try {
            switchScene(actionEvent, "/view/EditCustomerForm.fxml", 550, 650, "Edit Customer");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void toViewAppointments(ActionEvent actionEvent) {
        try {
            switchScene(actionEvent, "/view/AppointmentDashboardForm.fxml", 1200, 600, "Appointment DashBoard");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void toViewReports(ActionEvent actionEvent) {
        try {
            switchScene(actionEvent, "/view/ReportsForm.fxml", 1200, 600, "Reports DashBoard");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void exit(ActionEvent actionEvent) {
        exitProgram(mainPane);
    }

    public void deleteCustomer(ActionEvent actionEvent) {
    }
}
