/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Kymppi
 */
public class Kontrolleri {
    BussiSimulaattori gui;
    Pysäkki a = new Pysäkki("A");
    Pysäkki b = new Pysäkki("B");
    Matkustaja testi = new Matkustaja("B", 0);
    
    // Bussi 1 ja bussin 1 tapahtumat
    Bussi testiBussi = new Bussi();
    Task bussiin1 = Task.BUSSIIN;
    Task bussista1 = Task.BUSSISTA;
    Tapahtuma bussi1 = new Tapahtuma(0, bussiin1);
    Tapahtuma bussi2 = new Tapahtuma(5, bussista1);
    
    // Priority queue tapahtumille
    Comparator<Tapahtuma> comparator = new Komparaattori();
    PriorityQueue<Tapahtuma> jono = new PriorityQueue<Tapahtuma>(comparator);
    
    public Kontrolleri(BussiSimulaattori gui){
        this.gui = gui;
    }
    
    public void simuloi() {
        jono.add(bussi1);
        jono.add(bussi2);
        
        while (jono.size() != 0) {
            jono.poll().suorita(testiBussi, a);
            jono.poll().suorita(testiBussi, b);
        }
    }
}
