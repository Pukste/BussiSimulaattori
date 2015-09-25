/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;

/**
 *
 * @author Aki
 */
public class Tapahtuma {
    private int aika;
    private Task id;
    private Bussi bussi;
    private Pysäkki pysäkki;
    
    public Tapahtuma(int aika, Task id, Bussi bussi, Pysäkki pysäkki) {
        this.aika = aika;
        this.id = id;
        this.bussi = bussi;
        this.pysäkki = pysäkki;
    }
    
    public int getAika() {
        return aika;
    }
    
    public int suorita() {
        int tulos = 0; // Monta matkustajaa saatiin pysäkille
        
        switch (id) {
            case BUSSIIN:
                // Siirtää pysäkin matkustajat bussiin.
                // VÄLIAIKAINEN RATKAISU
                bussi.setNykyinenpysäkki(bussi.getSeuraavapysäkki());
                bussi.setSeuraavapysäkki(pysäkki); // TÄHÄN UUSI PYSÄKKI!
                for (Matkustaja matkustaja : pysäkki.meneePysäkille(bussi.getSeuraavapysäkki().getPysäkki())) {
                    bussi.lisaamatkustajabussiin(matkustaja);
                }
                
                break;
            case BUSSISTA:
                // Poistaa pysäkille jäävät matkustajat ja palauttaa jäävien
                // matkustajien lukumäärän.
                tulos += bussi.poistuuBussista();
                break;
        }
        
        return tulos;
    }
}
