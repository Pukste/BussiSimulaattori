package bussisimulaattori;

import java.util.*;

public class Bussi {

    private String linjatunnus;
    private int matkustajamaara;
    private int maksimimatkustajamaara; //jos yli, jätetään pysäkille.
    private Pysäkki nykyinenpysäkki;
    private Pysäkki seuraavapysäkki;
    private int indexPysäkit;
    private Pysäkki[] pysäkit;
    private ArrayList<Matkustaja> matkustajat = new ArrayList<>();

    Bussi(Pysäkki[] pysäkit) {
        this.pysäkit = pysäkit;
        seuraavapysäkki = this.pysäkit[0];
        indexPysäkit = 1;
    }


    public void lisaamatkustajabussiin(Matkustaja matkustaja) {
        matkustajat.add(matkustaja);
    }

    public void poistamatkustajabussista(Matkustaja matkustaja) {
        matkustajat.remove(matkustaja);
        }


    public String getLinjatunnus() {
        return linjatunnus;
    }

    public int getMatkustajamaara() {
        return matkustajamaara;
    }
    
    public void setNykyinenpysäkki(Pysäkki uusi) {
        this.nykyinenpysäkki = uusi;
    }

    public Pysäkki getNykyinenpysäkki() {
        return nykyinenpysäkki;
    }
    
    public void setSeuraavapysäkki(Pysäkki seuraava) {
        this.seuraavapysäkki = seuraava;
    }
    
    public Pysäkki getSeuraavapysäkki() {
        return seuraavapysäkki;
    }

    public Pysäkki getPysäkki(String pysäkkiID) {
        Pysäkki result = null;
        for (Pysäkki tempPysäkki : pysäkit) {
            if (tempPysäkki.getPysäkki().equals(pysäkkiID)) {
                result = tempPysäkki;
            }
        }
        return result;
    }
    
    public int poistuuBussista() {
        int poistuneet = 0;
        for (Matkustaja matkustaja : matkustajat) {
            // Pitäisikö muokata eri luokkien getPysäkit vähän eri nimisiksi...
            if (matkustaja.getPysäkki().getPysäkki().equals(nykyinenpysäkki.getPysäkki())) {
                matkustajat.remove(matkustaja); // Onkohan väärin poistaa ajon aikana alkioita?
                poistuneet++;
            }
        }
        
        return poistuneet;
    }
}
