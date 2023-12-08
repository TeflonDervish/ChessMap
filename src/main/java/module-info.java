module com.example.chessmap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chessmap to javafx.fxml;
    exports com.example.chessmap;
}