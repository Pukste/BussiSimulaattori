package bussisimulaattori;

import java.util.*;

public class Bussi {

    private String linjatunnus;
    private int matkustajamaara;
    private int maksimimatkustajamaara; //jos yli, jätetään pysäkille.
    private Pysäkki nykyinenpysakki;
    private Pysäkki[] pysäkit;
    private ArrayList<Matkustaja> matkustajat = new ArrayList<>();

    Bussi(Pysäkki[] pysäkit) {
        this.pysäkit = pysäkit;
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

    public Pysäkki getNykyinenpysakki() {
        return nykyinenpysakki;
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
}
