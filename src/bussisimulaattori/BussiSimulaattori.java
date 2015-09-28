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
    private final Kontrolleri kontrolleri = new Kontrolleri(this);
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();
        VBox vbox = addVBox();
        VBox vbox2 = addVBox();
        border.setLeft(vbox);
        border.setCenter(vbox2);
        Label matkustaneet = new Label();
        
        // Otsikon lisäys
        Text title = new Text("Bussisimulaattori");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);
        
        Text aika = new Text("Simuloinnissa kuluva aika");
        vbox.getChildren().add(aika);
        
        
        // Tuntien lisääminen simulaattoriin.
        HBox tunnit = new HBox();
        tunnit.setSpacing(8);
        
        Label label = new Label("Tunnit:");
        TextField textField = new TextField();
        
        tunnit.getChildren().add(label);
        tunnit.getChildren().add(textField);
        
        vbox.getChildren().add(tunnit);
        
        // Minuuttien lisääminen simulaattoriin.
        HBox minuutit = new HBox();
        minuutit.setSpacing(8);
        
        Label label2 = new Label("Minuutit:");
        TextField textField2 = new TextField();
        
        minuutit.getChildren().add(label2);
        minuutit.getChildren().add(textField2);
        
        vbox.getChildren().add(minuutit);
        
        // Luodaan simuloinnin painike ja määritellään sen toiminta.
        Button btn = new Button();
        btn.setText("Simuloi");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Tulos tulos = new Tulos();
                tulos = kontrolleri.simuloi();
                Integer matkanneet = tulos.getMatkanneet();
                matkustaneet.setText(matkanneet.toString());
                btn.setDisable(true);
            }
        });
        
        vbox.getChildren().add(btn);
        
        Text title2 = new Text("Matkustaneet");
        title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title3 = new Text("Pysäkille jääneet");
        title3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title4 = new Text("Tuotto");
        title4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox2.getChildren().add(title2);
        vbox2.getChildren().add(matkustaneet);
        vbox2.getChildren().add(title3);
        vbox2.getChildren().add(title4);
        
        
        Scene scene = new Scene(border, 400, 200);
        
        primaryStage.setTitle("Bussisimulaattori");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public VBox addVBox() {
        // Vasemman puoliskon koon määrittely
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
                
        return vbox;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
