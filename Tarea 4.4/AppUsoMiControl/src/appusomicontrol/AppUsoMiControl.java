
package appusomicontrol;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import proyectomicontrol.MiControl;
import java.lang.Class;
import java.lang.reflect.Field;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raul-
 */
public class AppUsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MiControl miControl = new MiControl();
       
        
                     
        miControl.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                try {
                    introspeccion(miControl);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(AppUsoMiControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(AppUsoMiControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AppUsoMiControl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
            
        Pane root = new Pane();
        root.getChildren().add(miControl);
            
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("AppUsoMiControl");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void introspeccion(MiControl miControl) throws NoSuchMethodException, NoSuchFieldException, ClassNotFoundException
    {
        Method[] metodos;
        metodos = miControl.getClass().getDeclaredMethods();
        
        //Nombre Clase
        System.out.println("GetName: "+miControl.getClass().getName());  
        
        //Métodos
        System.out.println("Métodos: ");
        for(int i = 0; i < metodos.length; i++) {
            System.out.println("Metodo "+(i+1)+ " : "+metodos[i]);
         }
        System.out.println("Constructores: "+miControl.getClass().getConstructor());
        
        //Clase
        Class clase;
        clase=Class.forName("proyectomicontrol.MiControl");
        System.out.println("Clase: "+clase.getName());
        
        // Field
        //Field sField = miControl.getClass().getField("string1");
        //System.out.println("Field: " + sField.toString());
        
        
    }
}
    