module com.example.memorytest {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.memorytest to javafx.fxml;
    exports com.example.memorytest;
}