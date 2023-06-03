package com.mycompany.cliahorcado;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CrearCuentaController {

    @FXML
    private Button btn_cancelar;

    @FXML
    private Button btn_crear;

    @FXML
    private TextField nickT;

    @FXML
    private TextField emailT;

   

    @FXML
    void switchToLogin(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

    

}