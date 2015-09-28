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
        // Pysäkkien tiedot
        Label a1 = new Label();
        Label b1 = new Label();
        Label c1 = new Label();
        Label d1 = new Label();
        Label e1 = new Label();
        Label f1 = new Label();
        Label g1 = new Label();
        Label h1 = new Label();
        Label i1 = new Label();
        Label j1 = new Label();
        
        Label a2 = new Label();
        Label b2 = new Label();
        Label c2 = new Label();
        Label d2 = new Label();
        Label e2 = new Label();
        Label f2 = new Label();
        Label g2 = new Label();
        Label h2 = new Label();
        Label i2 = new Label();
        Label j2 = new Label();
        
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
                
                a1.setText("A: " + tulos.getJäänyt(0));
                b1.setText("B: " + tulos.getJäänyt(1));
                c1.setText("C: " + tulos.getJäänyt(2));
                d1.setText("D: " + tulos.getJäänyt(3));
                e1.setText("E: " + tulos.getJäänyt(4));
                f1.setText("F: " + tulos.getJäänyt(5));
                g1.setText("G: " + tulos.getJäänyt(6));
                h1.setText("H: " + tulos.getJäänyt(7));
                i1.setText("I: " + tulos.getJäänyt(8));
                j1.setText("J: " + tulos.getJäänyt(9));
                
                a2.setText("A: " + tulos.getTullut(0));
                b2.setText("B: " + tulos.getTullut(1));
                c2.setText("C: " + tulos.getTullut(2));
                d2.setText("D: " + tulos.getTullut(3));
                e2.setText("E: " + tulos.getTullut(4));
                f2.setText("F: " + tulos.getTullut(5));
                g2.setText("G: " + tulos.getTullut(6));
                h2.setText("H: " + tulos.getTullut(7));
                i2.setText("I: " + tulos.getTullut(8));
                j2.setText("J: " + tulos.getTullut(9));
            }
        });
        
        vbox.getChildren().add(btn);
        
        Text title2 = new Text("Matkustaneet");
        title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title3 = new Text("Pysäkille jääneet");
        title3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title4 = new Text("Pysäkille tulleet");
        title4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox2.getChildren().add(title2);
        vbox2.getChildren().add(matkustaneet);
        vbox2.getChildren().add(title3);
        vbox2.getChildren().add(a1);
        vbox2.getChildren().add(b1);
        vbox2.getChildren().add(c1);
        vbox2.getChildren().add(d1);
        vbox2.getChildren().add(e1);
        vbox2.getChildren().add(f1);
        vbox2.getChildren().add(g1);
        vbox2.getChildren().add(h1);
        vbox2.getChildren().add(i1);
        vbox2.getChildren().add(j1);
        vbox2.getChildren().add(title4);
        vbox2.getChildren().add(a2);
        vbox2.getChildren().add(b2);
        vbox2.getChildren().add(c2);
        vbox2.getChildren().add(d2);
        vbox2.getChildren().add(e2);
        vbox2.getChildren().add(f2);
        vbox2.getChildren().add(g2);
        vbox2.getChildren().add(h2);
        vbox2.getChildren().add(i2);
        vbox2.getChildren().add(j2);
        
        
        Scene scene = new Scene(border, 500, 700);
        
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
