package bussisimulaattori;

import java.util.*;

public class Bussi {

    private String linjatunnus;
    private int matkustajamaara = 0;
    private final int maksimimatkustajamaara = 50; //luku asetetettu mielivaltaisesti, jos yli, jätetään pysäkille
    private String nykyinenpysäkki;
    private String seuraavapysäkki;
    private int indexPysäkit;
    private String[] pysäkit;
    private double bussilippuhinta = 7.50;
    private double bussilipputuotto = 0;
    private ArrayList<Matkustaja> matkustajat = new ArrayList<>();

    Bussi(String[] pysäkit) {
        this.pysäkit = pysäkit;
        seuraavapysäkki = this.pysäkit[0];
        indexPysäkit = 1;
    }

    public boolean matkustajamaara() {
        if (matkustajamaara < maksimimatkustajamaara) {
            return true;
        } else {
            return false;
        }
    }

    public void lisaamatkustajabussiin(Matkustaja matkustaja) {
        matkustajat.add(matkustaja);
        bussilipputuotto += bussilippuhinta;
        matkustajamaara++;
    }

    public void poistamatkustajabussista(Matkustaja matkustaja) {
        matkustajat.remove(matkustaja);
        matkustajamaara--;
    }

    public String getLinjatunnus() {
        return linjatunnus;
    }
    
    public double getBussilippuhinta(){
        return bussilippuhinta;
    }

    public int getMatkustajamaara() {
        return matkustajamaara;
    }

    public int getMaksimimatkustajamaara() {
        return maksimimatkustajamaara;
    }

    public void setNykyinenpysäkki(String uusi) {
        this.nykyinenpysäkki = uusi;
    }

    public String getNykyinenpysäkki() {
        return nykyinenpysäkki;
    }

    public void setSeuraavapysäkki() {
        if (indexPysäkit < pysäkit.length) {
            this.seuraavapysäkki = pysäkit[indexPysäkit];
            indexPysäkit++;
        } else if (indexPysäkit == pysäkit.length) {
            this.seuraavapysäkki = pysäkit[0];
            indexPysäkit = 1;
        }
    }

    public String getSeuraavapysäkki() {
        return seuraavapysäkki;
    }

    public String getPysäkki(String pysäkkiID) {
        String result = null;
        for (String tempPysäkki : pysäkit) {
            if (tempPysäkki.equals(pysäkkiID)) {
                result = tempPysäkki;
            }
        }
        return result;
    }

    public String[] getPysäkit() {
        return pysäkit;
    }
    
    public int getPysäkkiIndex(String pysäkki) {
        for (String i : pysäkit) {
            
        }
    }

    public int poistuuBussista() {
        int poistuneet = 0;
        ArrayList<Matkustaja> temp = new ArrayList();
        for (Matkustaja matkustaja : matkustajat) {
            // Pitäisikö muokata eri luokkien getPysäkit vähän eri nimisiksi...
            if (matkustaja.getPysäkki().equals(nykyinenpysäkki)) {
                //matkustajat.remove(matkustaja); // Onkohan väärin poistaa ajon aikana alkioita?
                poistuneet++;
                temp.add(matkustaja);
            }
        }

        for (Matkustaja matkustaja : temp) {
            matkustajat.remove(matkustaja);
        }

        return poistuneet;
    }
    
   
}
