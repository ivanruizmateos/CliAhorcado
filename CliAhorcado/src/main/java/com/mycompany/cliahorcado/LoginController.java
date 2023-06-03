package com.mycompany.cliahorcado;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button btn_registrarse;

    @FXML
    private Button btn_login;

    @FXML
    private TextField nickT;

    @FXML
    private TextField emailT;

    @FXML
    void switchToRegistro(ActionEvent event) throws IOException {
        App.setRoot("crearCuenta");
    }

    @FXML
    void switchToMenu(ActionEvent event) throws IOException {
        App.setRoot("seleccionDificultad");
    }

}
