module com.example.list {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.list to javafx.fxml;
    exports com.example.list;
}