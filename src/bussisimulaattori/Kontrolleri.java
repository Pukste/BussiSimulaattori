/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;
import java.util.*;

/**
 *
 * @author Kymppi
 */
public class Kontrolleri {
    BussiSimulaattori gui;
    Pysäkki a = new Pysäkki("A");
    Pysäkki b = new Pysäkki("B");
    Matkustaja testi = new Matkustaja("B", 0);
    Bussi testiBussi = new Bussi();
    
    public Kontrolleri(BussiSimulaattori gui){
        this.gui = gui;
    }
    // derp
    // Käy läpi annetun pysäkin matkustajat ja jos bussi on matkalla kyseiseen
    // pysäkkiin, niin bussi noukkii matkustajan.
    public void pysäkiltäBussiin(Pysäkki pysäkki, Bussi bussi) {
        // Käy läpi bussin pysäkit
        // Tarvii päivityksen bussiluokkaan!
        
        // Käy läpi pysäkin matkustajat
        
    }
    
    // Käy läpi bussin matkustajat ja jos ollaan päämääräpysäillä, niin
    // matkustaja jää pysäkille. Lopuksi pysäkiltä tyhjennetään saapuneet
    // matkustajat.
    public void bussistaPysäkille() {
        ArrayList<Matkustaja> lähtevät;
    }
    
    // Lopussa koontafunktio, joka pyörittää koko simulaatiota.
}
