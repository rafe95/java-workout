module com.rafe.fxclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.rafe95.fxclient to javafx.fxml;
    exports com.rafe95.fxclient;
}