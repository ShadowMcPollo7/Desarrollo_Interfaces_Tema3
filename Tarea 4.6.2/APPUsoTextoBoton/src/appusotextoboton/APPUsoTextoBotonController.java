/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campoTextoBoton.CampoTextoBotonViewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author raul-
 */
public class APPUsoTextoBotonController implements Initializable {
    
    
    @FXML
    private Label labelSalida;
    @FXML
    private CampoTextoBotonViewController textoBoton1;
    @FXML
    private CampoTextoBotonViewController textoBoton2;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        textoBoton1.buttonSetText("Grabar");
        
        textoBoton2.buttonSetText("Grabar");
        
        textoBoton1.setOnAction((ActionEvent event) -> {
            labelSalida.setText("Se ha grabado: " + textoBoton1.getText());
            //Hacer algo cuando se capture el evento
        });
        
        textoBoton2.setOnAction((ActionEvent event) -> {
            labelSalida.setText("Se ha grabado: " + textoBoton2.getText());
            //Hacer algo cuando se capture el evento
        });
        
        
    }    

   


    
}
