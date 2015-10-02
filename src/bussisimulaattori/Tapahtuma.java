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

                if (bussi.getNykyinenpysäkki() == null) {
                    bussi.setNykyinenpysäkki(bussi.getSeuraavapysäkki());
                    bussi.setSeuraavapysäkki();
                }
                
                // Iterator on yksi bussin päämääräpysäkeistä. Luupissa käydään läpi kaikki pysäkit.
                int index = 0;
                for (String iterator : bussi.getPysäkit()) {
                    if (index >= )
                    // Antaa määränpääpysäkille menevät matkustajat.
                    for (Matkustaja matkustaja : pysäkki.meneePysäkille(iterator)) {
                        if (bussi.matkustajamaara() == true && matkustaja.getRahat() >= bussi.getBussilippuhinta()) {
                            bussi.lisaamatkustajabussiin(matkustaja);
                        } else {
                            pysäkki.lisääMatkustaja(matkustaja);
                            //break;
                        }
                    }
                }

                break;
            case BUSSISTA:
                // Poistaa pysäkille jäävät matkustajat ja palauttaa jäävien
                // matkustajien lukumäärän.
                bussi.setNykyinenpysäkki(bussi.getSeuraavapysäkki());
                bussi.setSeuraavapysäkki();
                tulos += bussi.poistuuBussista();
                break;
        }

        return tulos;
    }
}
