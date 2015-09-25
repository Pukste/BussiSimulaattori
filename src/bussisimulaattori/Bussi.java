package bussisimulaattori;

import java.util.*;

public class Bussi {

    private String linjatunnus;
    private int matkustajamaara;
    private String nykyinenpysakki;
    private String seuraavapysakki;
    private String edellinenpysakki;

    ArrayList<Matkustaja> matkustajat = new ArrayList<>();

    Bussi() {
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

    public String getNykyinenpysakki() {
        return nykyinenpysakki;
    }

    public String getSeuraavapysakki() {
        return seuraavapysakki;
    }

    public String getEdellinenpysakki() {
        return edellinenpysakki;
    }
}
