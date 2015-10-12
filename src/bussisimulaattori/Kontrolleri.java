/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Kymppi
 */
public class Kontrolleri {
    BussiSimulaattori gui;
    int matkanneet;
    
    // Pysäkkien luonti
    ArrayList<Pysäkki> pysäkit = new ArrayList();
    Pysäkki a = new Pysäkki("A");
    Pysäkki b = new Pysäkki("B");
    Pysäkki c = new Pysäkki("C");
    Pysäkki d = new Pysäkki("D");
    Pysäkki e = new Pysäkki("E");
    Pysäkki f = new Pysäkki("F");
    Pysäkki g = new Pysäkki("G");
    Pysäkki h = new Pysäkki("H");
    Pysäkki i = new Pysäkki("I");
    Pysäkki j = new Pysäkki("J");
    
    
    // Matkustajien luonti - VANHA
    //Matkustaja testi = new Matkustaja("B", 0);
    //Matkustaja testi2 = new Matkustaja("C", 0);
    //Matkustaja testi3 = new Matkustaja("C", 0);
    
    // Eri tehtävät
    Task bussiin = Task.BUSSIIN;
    Task bussista = Task.BUSSISTA;
    
    // Bussi 1 ja bussin 1 tapahtumat
    String[] linja1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    Pysäkki[] Plinja1 = {a, b, c, d, e, f, g, h, i, j};
    Bussi bussi1 = new Bussi(linja1);
    Tapahtuma bussi1T1 = new Tapahtuma(0, bussiin, bussi1, Plinja1, a);
    /*Tapahtuma bussi1T2 = new Tapahtuma(5, bussista, bussi1, b);
    Tapahtuma bussi1T3 = new Tapahtuma(6, bussiin, bussi1, b);
    Tapahtuma bussi1T4 = new Tapahtuma(10, bussista, bussi1, c);
    Tapahtuma bussi1T5 = new Tapahtuma(11, bussiin, bussi1, c);
    Tapahtuma bussi1T6 = new Tapahtuma(15, bussista, bussi1, d);
    Tapahtuma bussi1T7 = new Tapahtuma(16, bussiin, bussi1, d);
    Tapahtuma bussi1T8 = new Tapahtuma(20, bussista, bussi1, e);*/
    
    // Bussi 2 ja bussin 2 tapahtumat
    String[] linja2 = {"J", "I", "H", "G", "F", "E"};
    Pysäkki[] Plinja2 = {j, i, h, g, f, e};
    Bussi bussi2 = new Bussi(linja2);
    Tapahtuma bussi2T1 = new Tapahtuma(0, bussiin, bussi2, Plinja2, j);
    /*Tapahtuma bussi2T2 = new Tapahtuma(5, bussista, bussi2, i);
    Tapahtuma bussi2T3 = new Tapahtuma(6, bussiin, bussi2, i);
    Tapahtuma bussi2T4 = new Tapahtuma(10, bussista, bussi2, h);
    Tapahtuma bussi2T5 = new Tapahtuma(11, bussiin, bussi2, h);
    Tapahtuma bussi2T6 = new Tapahtuma(15, bussista, bussi2, g);
    Tapahtuma bussi2T7 = new Tapahtuma(16, bussiin, bussi2, g);
    Tapahtuma bussi2T8 = new Tapahtuma(20, bussista, bussi2, f);
    Tapahtuma bussi2T9 = new Tapahtuma(21, bussiin, bussi2, f);
    Tapahtuma bussi2T10 = new Tapahtuma(25, bussista, bussi2, e);*/
    
    // Bussi 3 ja bussin 3 tapahtumat
    String[] linja3 = {"C", "D", "E", "F", "G"};
    Pysäkki[] Plinja3 = {c, d, e, f, g};
    Bussi bussi3 = new Bussi(linja3);
    Tapahtuma bussi3T1 = new Tapahtuma(0, bussiin, bussi3, Plinja3, c);
    /*Tapahtuma bussi3T2 = new Tapahtuma(5, bussista, bussi3, d);
    Tapahtuma bussi3T3 = new Tapahtuma(6, bussiin, bussi3, d);
    Tapahtuma bussi3T4 = new Tapahtuma(10, bussista, bussi3, e);
    Tapahtuma bussi3T5 = new Tapahtuma(11, bussiin, bussi3, e);
    Tapahtuma bussi3T6 = new Tapahtuma(15, bussista, bussi3, f);
    Tapahtuma bussi3T7 = new Tapahtuma(16, bussiin, bussi3, f);
    Tapahtuma bussi3T8 = new Tapahtuma(20, bussista, bussi3, g);*/
    
    // Priority queue tapahtumille
    Comparator<Tapahtuma> comparator = new Komparaattori();
    PriorityQueue<Tapahtuma> jono = new PriorityQueue<Tapahtuma>(comparator);
    
    public Kontrolleri(BussiSimulaattori gui){
        this.gui = gui;
    }
    
    public Tulos simuloi(int aika) {
        Tulos tulos = new Tulos();
        
        // Pysäkkien käsittely
        pysäkit.add(a);
        pysäkit.add(b);
        pysäkit.add(c);
        pysäkit.add(d);
        pysäkit.add(e);
        pysäkit.add(f);
        pysäkit.add(g);
        pysäkit.add(h);
        pysäkit.add(i);
        pysäkit.add(j);
        
        // Matkustajien luonti
        Random random = new Random();
        
        // Tehdään jokaiselle pysäkille matkustajia
        for (Pysäkki pysäkki : pysäkit) {
            // Matkustamäärän luonti
            int määrä = random.nextInt(10);
        
            for(int i = 0; i < määrä; i++) {
                int indeksi = random.nextInt(9);
            
                while (pysäkit.indexOf(pysäkki) == indeksi) {
                    indeksi = random.nextInt(9);
                }
            
                Matkustaja temp = new Matkustaja(pysäkit.get(indeksi).getNimi(), 0);
                pysäkki.lisääMatkustaja(temp);
                tulos.addTulleet(pysäkit.indexOf(pysäkki), 1);
            }
        }
        
        // Pysäkille lisätään matkustajat
        //a.lisääMatkustaja(testi);
        //a.lisääMatkustaja(testi2);
        //b.lisääMatkustaja(testi3);
        
        // Lisätään tapahtumajonoon tapahtumat
        jono.add(bussi1T1);
        /*jono.add(bussi1T2);
        jono.add(bussi1T3);
        jono.add(bussi1T4);
        jono.add(bussi1T5);
        jono.add(bussi1T6);
        jono.add(bussi1T7);
        jono.add(bussi1T8);*/
        jono.add(bussi2T1);
        /*jono.add(bussi2T2);
        jono.add(bussi2T3);
        jono.add(bussi2T4);
        jono.add(bussi2T5);
        jono.add(bussi2T6);
        jono.add(bussi2T7);
        jono.add(bussi2T8);
        jono.add(bussi2T9);
        jono.add(bussi2T10);*/
        jono.add(bussi3T1);
        /*jono.add(bussi3T2);
        jono.add(bussi3T3);
        jono.add(bussi3T4);
        jono.add(bussi3T5);
        jono.add(bussi3T6);
        jono.add(bussi3T7);
        jono.add(bussi3T8);*/
        
        // Käydään läpi tapahtumajono
        int iteratorAika = 0;
        while(iteratorAika <= aika) {
            Tapahtuma temp = jono.peek();
            
            if (temp.getAika() == iteratorAika) {
                Tapahtuma temp2 = jono.poll();
                Tapahtuma temp3 = temp2.suorita(iteratorAika);
                jono.add(temp3);
                
                matkanneet = temp2.getMatkanneet();
                tulos.addMatkanneet(matkanneet);
                
            }
            
            Tapahtuma temp4 = jono.peek();
            if (temp4.getAika() != iteratorAika) {
                if (iteratorAika % 30 == 0 && iteratorAika != 0) {
                    for (Pysäkki pysäkki : pysäkit) {
                    // Matkustamäärän luonti
                    int määrä = random.nextInt(10);

                    for(int i = 0; i < määrä; i++) {
                        int indeksi = random.nextInt(9);

                            while (pysäkit.indexOf(pysäkki) == indeksi) {
                                indeksi = random.nextInt(9);
                            }

                            Matkustaja temp2 = new Matkustaja(pysäkit.get(indeksi).getNimi(), 0);
                            pysäkki.lisääMatkustaja(temp2);
                            tulos.addTulleet(pysäkit.indexOf(pysäkki), 1);
                        }
                    }
                }
                iteratorAika++;
            }
        }
        
        for (Pysäkki pysäkki : pysäkit) {
            for (Matkustaja matkustaja : pysäkki.getMatkustajat()) {
                tulos.addJääneet(pysäkit.indexOf(pysäkki), 1);
            }
        }
        
        tulos.addBusseissa(0, bussi1.getMatkustajamaara());
        tulos.addBusseissa(1, bussi2.getMatkustajamaara());
        tulos.addBusseissa(2, bussi3.getMatkustajamaara());
        
        tulos.addTuotto(bussi1.getBussilipunTuotto());
        tulos.addTuotto(bussi2.getBussilipunTuotto());
        tulos.addTuotto(bussi3.getBussilipunTuotto());
        
        return tulos;
    }
}
