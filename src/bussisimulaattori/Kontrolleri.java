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
    int matkanneet;
    Pysäkki a = new Pysäkki("A");
    Pysäkki b = new Pysäkki("B");
    Matkustaja testi = new Matkustaja("B", 0);
    
    // Bussi 1 ja bussin 1 tapahtumat
    Pysäkki[] linja1 = {a, b};
    Bussi testiBussi = new Bussi(linja1);
    Task bussiin1 = Task.BUSSIIN;
    Task bussista1 = Task.BUSSISTA;
    Tapahtuma bussi1 = new Tapahtuma(0, bussiin1, testiBussi, a);
    Tapahtuma bussi2 = new Tapahtuma(5, bussista1, testiBussi, b);
    
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
            matkanneet += jono.poll().suorita();
            matkanneet += jono.poll().suorita();
        }
    }
}
