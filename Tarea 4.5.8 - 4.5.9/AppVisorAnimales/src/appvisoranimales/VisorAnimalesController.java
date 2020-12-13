/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

/**
 *
 * @author raul-
 */
public class VisorAnimalesController implements Initializable {
    
    private Animal animal; 
    
    
    private ObservableList<Animal> listaObservable;
        
    private Label label;
    @FXML
    private ListView<Animal> listViewAnimales;
    @FXML
    private ImageView imageViewAnimales;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        
        listViewAnimales.setCellFactory(new Callback<ListView<Animal>, ListCell<Animal>>() {
            @Override
            public ListCell<Animal> call(ListView<Animal> param) {
                return new CeldaImagenTexto();
            }
        });
        listaObservable = FXCollections.observableArrayList();

        Animal perro = new Animal("Perro", "fotos/perro.jpg", "fotos/perrochico.jpg");
        Animal gato = new Animal("Gato", "fotos/gato.jpg", "fotos/gatochico.jpg");
        Animal conejo = new Animal("Conejo", "fotos/conejo.jpg", "fotos/conejochico.jpg");
        
        listaObservable.add(perro);
        listaObservable.add(gato);
        listaObservable.add(conejo);
        
        listViewAnimales.setItems(listaObservable);
        listViewAnimales.getSelectionModel().select(perro);
        imageViewAnimales.setImage(new Image(perro.getImagenGrande()));
        
        listViewAnimales.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Animal>(){
            @Override
            public void changed(ObservableValue<? extends Animal> observable, Animal oldValue, Animal newValue) {
                animal = newValue;
                imageViewAnimales.setImage(new Image(animal.getImagenGrande()));
            }
        });
        
        
    }    
    
}
