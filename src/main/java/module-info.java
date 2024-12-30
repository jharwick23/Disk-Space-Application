module com.example.disk_space {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.disk_space to javafx.fxml;
    exports com.example.disk_space;
}