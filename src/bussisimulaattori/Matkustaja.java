/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;

/**
 *
 * @author Kymppi
 */
public class Matkustaja {
    private Pysäkki pysäkki;
    private double rahat;

    public Matkustaja(Pysäkki pysäkki, double rahat) {

        this.rahat = rahat;
        this.pysäkki = pysäkki;
        
    }
    public double getRahat() {
        return rahat;
    }
    public Pysäkki getPysäkki() {
        return pysäkki;
    }



    

   
    
}
    

