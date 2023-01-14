module com.example.todonew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todonew to javafx.fxml;
    exports com.example.todonew;
}