/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author raul-
 */
public class CeldaImagenTexto extends ListCell<Animal> {
    
    private VBox vbox;
    private ImageView imageview;
    private Label label;

    public CeldaImagenTexto() {
        imageview=new ImageView();
        vbox=new VBox();
        label=new Label();
        
        imageview.setFitWidth(100);
        imageview.setFitHeight(100);
        
        vbox.getChildren().addAll(imageview, label);
        vbox.setAlignment(Pos.CENTER);
          
    }
    
    @Override
    protected void updateItem(Animal animal, boolean vacia) {
        super.updateItem(animal, vacia);
        if(animal!=null){
            label.setText(animal.getNombre());
            imageview.setImage(new Image(animal.getImagenMiniatura()));
            setGraphic(vbox);
        }
    }
    
    
    
    
    
}
