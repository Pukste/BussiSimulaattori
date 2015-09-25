/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;

/**
 *
 * @author Aki
 */
public class BussiSimulaattori extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();
        VBox vbox = addVBox();
        border.setLeft(vbox);
        
        Scene scene = new Scene(border, 300, 250);
        
        primaryStage.setTitle("Bussisimulaattori");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public VBox addVBox() {
        // Koko 
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
        
        Text title = new Text("Bussisimulaattori");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);
        
        Text aika = new Text("Simuloinnissa kuluva aika");
        vbox.getChildren().add(aika);
        
        Button btn = new Button();
        
        HBox tunnit = new HBox();
        tunnit.setSpacing(8);
        
        Label label = new Label("Tunnit:");
        TextField textField = new TextField();
        
        tunnit.getChildren().add(label);
        tunnit.getChildren().add(textField);
        
        vbox.getChildren().add(tunnit);
        
        HBox minuutit = new HBox();
        minuutit.setSpacing(8);
        
        Label label2 = new Label("Minuutit:");
        TextField textField2 = new TextField();
        
        minuutit.getChildren().add(label2);
        minuutit.getChildren().add(textField2);
        
        vbox.getChildren().add(minuutit);
        
        btn.setText("Simuloi");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bussisimulaattori");
                System.out.println(textField.getText());
                System.out.println(textField2.getText());
            }
        });
        
        vbox.getChildren().add(btn);

        return vbox;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
