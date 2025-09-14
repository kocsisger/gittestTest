module hu.unideb.inf.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.unideb.inf.demo1 to javafx.fxml;
    exports hu.unideb.inf.demo1;
}