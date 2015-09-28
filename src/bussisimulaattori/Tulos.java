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
public class Tulos {
    private double tuotto;
    private int[] jääneet;
    private int[] tulleet;
    private int matkanneet;
            
    public Tulos() {
        jääneet = new int[10];
        tulleet = new int[10];
    }
    
    public double getTuotto() {
        return tuotto;
    }
    
    public int[] getJääneet() {
        return jääneet;
    }
    
    public int getJäänyt(int indeksi) {
        return jääneet[indeksi];
    }
    
    public void addJääneet(int indeksi, int tulos) {
        jääneet[indeksi] += tulos;
    }
    
    public int getTullut(int indeksi) {
        return tulleet[indeksi];
    }
    
    public int[] getTulleet() {
        return tulleet;
    }
    
    public void addTulleet(int indeksi, int tulleetMatkustajat) {
        tulleet[indeksi] = tulleetMatkustajat;
    }
    
    public int getMatkanneet() {
        return matkanneet;
    }
    
    public int addMatkanneet(int lisäys) {
        matkanneet += lisäys;
        return matkanneet;
    }
}
