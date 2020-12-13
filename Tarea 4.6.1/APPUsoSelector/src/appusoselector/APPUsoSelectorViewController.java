/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import SelectorDeslizamiento.SelectorDeslizamientoViewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author raul-
 */
public class APPUsoSelectorViewController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private SelectorDeslizamientoViewController selector1;
    @FXML
    private SelectorDeslizamientoViewController selector2;
    @FXML
    private Label labelAbajo;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

        selector1.setOnAction((ActionEvent event) -> {
            labelAbajo.setText("Pulsado el selector de arriba");
            //Hacer algo cuando se capture el evento
        });
        selector2.setOnAction((ActionEvent event) -> {
            labelAbajo.setText("Pulsado el selector de abajo");
            //Hacer algo cuando se capture el evento
        });
    }

}
