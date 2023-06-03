module com.mycompany.cliahorcado {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cliahorcado to javafx.fxml;
    exports com.mycompany.cliahorcado;
}
