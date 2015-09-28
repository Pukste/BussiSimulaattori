/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;
import java.util.*;

/**
 *
 * @author Aki
 */
public class Pysäkki {
    private String nimi;
    private ArrayList<Matkustaja> matkustajat = new ArrayList();
    
    public Pysäkki() {
        
    }
    
    public Pysäkki(String uusiNimi) {
        nimi = uusiNimi;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public void setPysäkki(String uusiNimi) {
        nimi = uusiNimi;
    }
    
    // Lisätään pysäkille matkustaja.
    public void lisääMatkustaja(Matkustaja matkustaja) {
        matkustajat.add(matkustaja);
    }
    
    // Poistetaan annetun niminen matkustaja pysäkiltä. Jos poisto onnistui
    // palautetaan true, muuten false.
    public void poistaMatkustaja(Matkustaja matkustaja) {
        matkustajat.remove(matkustaja);
    }
    
    // Funktio, jolla etsitään matkustajista kaikki tietylle pysäkille menevät
    public ArrayList<Matkustaja> meneePysäkille(String pysäkki) {
        ArrayList<Matkustaja> result = new ArrayList();
        
        for (Matkustaja matkustaja : matkustajat) {
            if (matkustaja.getPysäkki().equals(pysäkki)) {
                result.add(matkustaja);
                //matkustajat.remove(matkustaja); // Voi olla väärin tuhota kesken suorituksen.
            }
        }
        
        for (Matkustaja matkustaja : result) {
            matkustajat.remove(matkustaja);
        }
        
        return result;
    }
}
