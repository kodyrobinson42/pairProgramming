module com.example.teamcoach {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teamcoach to javafx.fxml;
    exports com.example.teamcoach;
}