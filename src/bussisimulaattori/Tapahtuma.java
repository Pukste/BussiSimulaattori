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
    private Pysäkki[] linja;
    private Pysäkki pysäkki;
    private int matkanneet;

    public Tapahtuma(int aika, Task id, Bussi bussi, Pysäkki[] linja, Pysäkki pysäkki) {
        this.aika = aika;
        this.id = id;
        this.bussi = bussi;
        this.linja = linja;
        this.pysäkki = pysäkki;
    }

    public int getAika() {
        return aika;
    }
    
    public int getMatkanneet() {
        return matkanneet;
    }

    public Tapahtuma suorita(int tapahtumanAika) {
        Tapahtuma tulos; // Monta matkustajaa saatiin pysäkille

        switch (id) {
            case BUSSIIN:
                // Siirtää pysäkin matkustajat bussiin.

                if (bussi.getNykyinenpysäkki() == null) {
                    bussi.setNykyinenpysäkki(bussi.getSeuraavapysäkki());
                    bussi.setSeuraavapysäkki();
                }
                
                // Iterator on yksi bussin päämääräpysäkeistä. Luupissa käydään läpi kaikki pysäkit.
                
                for (String iterator : bussi.getPysäkit()) {
                    
                    // Antaa määränpääpysäkille menevät matkustajat.
                    for (Matkustaja matkustaja : pysäkki.meneePysäkille(iterator)) {
                        if (bussi.matkustajamaara() == true && matkustaja.getRahat() >= bussi.getBussilippuhinta()) {
                        bussi.lisaamatkustajabussiin(matkustaja);
                        } else {
                            pysäkki.lisääMatkustaja(matkustaja);
                        }
                    }
                }
                
                for(int i = 0; i < linja.length; i++) {
                    if (linja[i] == pysäkki) {
                        if (i == (linja.length - 1)) {
                            this.pysäkki = linja[0];
                            break;
                        }
                        else {
                            this.pysäkki = linja[i+1];
                            break;
                        }
                    }
                }
                
                // Tapahtuman luonti
                tulos = new Tapahtuma(tapahtumanAika + 5, Task.BUSSISTA, bussi, linja, pysäkki);

                break;
            case BUSSISTA:
                // Poistaa pysäkille jäävät matkustajat ja palauttaa jäävien
                // matkustajien lukumäärän.
                bussi.setNykyinenpysäkki(bussi.getSeuraavapysäkki());
                bussi.setSeuraavapysäkki();
                matkanneet += bussi.poistuuBussista();
                
                // Tapahtuman luonti
                tulos = new Tapahtuma(tapahtumanAika + 1, Task.BUSSIIN, bussi, linja, pysäkki);
                
                break;
            //case LISÄÄMATKUSTAJAT:
            //    tulos = new Tapahtuma (tapahtumanAika + 30, Task.LISÄÄMATKUSTAJAT, null, null, null);
            //    break;
            default:
                tulos = null;
        }

        return tulos;
    }
}
