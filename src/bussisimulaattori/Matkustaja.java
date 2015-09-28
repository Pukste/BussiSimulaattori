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

    private String pysäkki;
    private double rahat;

    public Matkustaja(String pysäkki, double rahat) {

        rahat = Math.random() * 40;
        rahat = Math.round(rahat * 100.00) / 100.00;
        this.rahat = rahat;
        this.pysäkki = pysäkki;

    }

    public double getRahat() {
        return rahat;
    }

    public String getPysäkki() {
        return pysäkki;
    }

}
