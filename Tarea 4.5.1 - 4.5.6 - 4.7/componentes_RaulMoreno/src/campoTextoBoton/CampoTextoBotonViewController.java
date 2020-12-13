/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campoTextoBoton;

import SelectorDeslizamiento.SelectorDeslizamientoViewController;
import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author raul-
 */
public class CampoTextoBotonViewController extends HBox {

    @FXML
    private TextField textField;
    @FXML
    private Button button;
     
    public CampoTextoBotonViewController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("campoTextoBotonView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        
        button.setOnAction((ActionEvent event) -> {
            ObjectProperty<EventHandler<ActionEvent>> onAction = new ObjectPropertyBase<EventHandler<ActionEvent>>() {
                @Override
                protected void invalidated() {
                    setEventHandler(ActionEvent.ACTION, get());
                }

                @Override
                public Object getBean() {
                    return CampoTextoBotonViewController.this;
                }

                @Override
                public String getName() {
                    return "onAction";
                }
            };
        }
        );
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }
    
    public void buttonSetText(String value) {
        button.setText(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }

   public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return onAction;
    }

    public final void setOnAction(EventHandler<ActionEvent> value) {
        onActionProperty().set(value);
    }

    public final EventHandler<ActionEvent> getOnAction() {
        return onActionProperty().get();
    }

    private ObjectProperty<EventHandler<ActionEvent>> onAction = new ObjectPropertyBase<EventHandler<ActionEvent>>() {
        @Override
        protected void invalidated() {
            setEventHandler(ActionEvent.ACTION, get());
        }

        @Override
        public Object getBean() {
            return CampoTextoBotonViewController.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };
    
    
    
    

    
    
}
