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
    Matkustaja testi = new Matkustaja(b, 0);
    Matkustaja testi2 = new Matkustaja(c, 0);
    
    // Bussi 1 ja bussin 1 tapahtumat
    Pysäkki[] linja1 = {a, b, c};
    Bussi testiBussi = new Bussi(linja1);
    Task bussiin = Task.BUSSIIN;
    Task bussista = Task.BUSSISTA;
    Tapahtuma bussiT1 = new Tapahtuma(0, bussiin, testiBussi, a);
    Tapahtuma bussiT2 = new Tapahtuma(1, bussista, testiBussi, b);
    Tapahtuma bussiT3 = new Tapahtuma(2, bussiin, testiBussi, b);
    Tapahtuma bussiT4 = new Tapahtuma(3, bussista, testiBussi, c);
    
    // Priority queue tapahtumille
    Comparator<Tapahtuma> comparator = new Komparaattori();
    PriorityQueue<Tapahtuma> jono = new PriorityQueue<Tapahtuma>(comparator);
    
    public Kontrolleri(BussiSimulaattori gui){
        this.gui = gui;
    }
    
    public int simuloi() {
        a.lisääMatkustaja(testi);
        a.lisääMatkustaja(testi2);
        jono.add(bussiT1);
        jono.add(bussiT2);
        jono.add(bussiT3);
        jono.add(bussiT4);
        
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        matkanneet += jono.poll().suorita();
        
        return matkanneet;
    }
}
