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
    
    public Tapahtuma(int aika, Task id) {
        this.aika = aika;
        this.id = id;
    }
    
    public int getAika() {
        return aika;
    }
    
    public void suorita(Bussi bussi, Pysäkki pysäkki) {
        switch (id) {
            case BUSSIIN:
                break;
            case BUSSISTA:
                break;
        }
    }
}
