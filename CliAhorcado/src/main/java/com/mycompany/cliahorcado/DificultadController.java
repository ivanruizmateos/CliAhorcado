/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliahorcado;

/**
 *
 * @author ivanr
 */
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DificultadController {

    @FXML
    private Button btn_cancelar;

    @FXML
    private Button btn_fame;

    @FXML
    private Button btn_facil;

    @FXML
    private Button btn_normal;

    @FXML
    private Button btn_dificil;

    @FXML
    void switchToJuego(ActionEvent event) {

    }

    @FXML
    void switchToLogin(ActionEvent event) {

    }

    @FXML
    void switchToFame(ActionEvent event) throws IOException {
        App.setRoot("hallOfFame");
    }

}
