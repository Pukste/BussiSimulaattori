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
        VBox vbox3 = new VBox();
        VBox vbox4 = new VBox();
        VBox vbox5 = new VBox();
        VBox vbox6 = new VBox();
        VBox vbox7 = new VBox();
        vbox3.setSpacing(8);
        vbox4.setSpacing(8);
        vbox5.setSpacing(8);
        vbox6.setSpacing(8);
        vbox7.setSpacing(8);
        HBox wrapper = new HBox();
        HBox wrapper2 = new HBox();
        
        wrapper.setSpacing(8);
        wrapper2.setSpacing(8);
        border.setLeft(vbox);
        border.setCenter(vbox2);
        Label matkustaneet = new Label();
        Label tuotto = new Label();
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
        
        Label bussi1 = new Label();
        Label bussi2 = new Label();
        Label bussi3 = new Label();
        
        // Otsikon lisäys
        Text title = new Text("Bussisimulaattori");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);
        
        /*Text aika = new Text("Simuloinnissa kuluva aika");
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
        
        vbox.getChildren().add(minuutit);*/
        
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
                
                bussi1.setText("Bussi 1: " + tulos.getBusseissa(0));
                bussi2.setText("Bussi 2: " + tulos.getBusseissa(1));
                bussi3.setText("Bussi 3: " + tulos.getBusseissa(2));
                
                tuotto.setText(tulos.getTuotto() + " euroa");
            }
        });
        
        vbox.getChildren().add(btn);
        
        Text title2 = new Text("Matkustaneet");
        title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title6 = new Text("Bussien tuotto");
        title6.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title3 = new Text("Pysäkille jääneet");
        title3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title4 = new Text("Pysäkille tulleet");
        title4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Text title5 = new Text("Matkustajat busseissa");
        title5.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        
        vbox2.getChildren().add(wrapper2);
        wrapper2.getChildren().add(vbox6);
        wrapper2.getChildren().add(vbox7);
        vbox6.getChildren().add(title2);
        vbox6.getChildren().add(matkustaneet);
        
        vbox7.getChildren().add(title6);
        vbox7.getChildren().add(tuotto);
        
        vbox2.getChildren().add(wrapper);
        wrapper.getChildren().add(vbox3);
        wrapper.getChildren().add(vbox4);
        wrapper.getChildren().add(vbox5);
        
        vbox3.getChildren().add(title3);
        vbox3.getChildren().add(a1);
        vbox3.getChildren().add(b1);
        vbox3.getChildren().add(c1);
        vbox3.getChildren().add(d1);
        vbox3.getChildren().add(e1);
        vbox3.getChildren().add(f1);
        vbox3.getChildren().add(g1);
        vbox3.getChildren().add(h1);
        vbox3.getChildren().add(i1);
        vbox3.getChildren().add(j1);
        vbox4.getChildren().add(title4);
        vbox4.getChildren().add(a2);
        vbox4.getChildren().add(b2);
        vbox4.getChildren().add(c2);
        vbox4.getChildren().add(d2);
        vbox4.getChildren().add(e2);
        vbox4.getChildren().add(f2);
        vbox4.getChildren().add(g2);
        vbox4.getChildren().add(h2);
        vbox4.getChildren().add(i2);
        vbox4.getChildren().add(j2);
        
        vbox5.getChildren().add(title5);
        vbox5.getChildren().add(bussi1);
        vbox5.getChildren().add(bussi2);
        vbox5.getChildren().add(bussi3);
        
        Scene scene = new Scene(border, 600, 400);
        
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
