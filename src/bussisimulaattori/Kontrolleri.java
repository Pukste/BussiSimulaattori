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
    
    // Pysäkkien luonti
    Pysäkki a = new Pysäkki("A");
    Pysäkki b = new Pysäkki("B");
    Pysäkki c = new Pysäkki("C");
    
    // Matkustajien luonti
    Matkustaja testi = new Matkustaja("B", 0);
    Matkustaja testi2 = new Matkustaja("C", 0);
    Matkustaja testi3 = new Matkustaja("C", 0);
    
    // Bussi 1 ja bussin 1 tapahtumat
    String[] linja1 = {"A", "B", "C"};
    Bussi testiBussi = new Bussi(linja1);
    Task bussiin = Task.BUSSIIN;
    Task bussista = Task.BUSSISTA;
    Tapahtuma bussi1T1 = new Tapahtuma(0, bussiin, testiBussi, a);
    Tapahtuma bussi1T2 = new Tapahtuma(1, bussista, testiBussi, b);
    Tapahtuma bussi1T3 = new Tapahtuma(2, bussiin, testiBussi, b);
    Tapahtuma bussi1T4 = new Tapahtuma(3, bussista, testiBussi, c);
    
    // Priority queue tapahtumille
    Comparator<Tapahtuma> comparator = new Komparaattori();
    PriorityQueue<Tapahtuma> jono = new PriorityQueue<Tapahtuma>(comparator);
    
    public Kontrolleri(BussiSimulaattori gui){
        this.gui = gui;
    }
    
    public int simuloi() {
        a.lisääMatkustaja(testi);
        a.lisääMatkustaja(testi2);
        b.lisääMatkustaja(testi3);
        jono.add(bussi1T1);
        jono.add(bussi1T2);
        jono.add(bussi1T3);
        jono.add(bussi1T4);
        
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        
        return matkanneet;
    }
}
