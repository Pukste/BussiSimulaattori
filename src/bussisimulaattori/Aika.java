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
public class Aika {
    private int minuutit;
    
    public Aika() {
        minuutit = 0;
    }
    
    public void aikaKuluu() {
        minuutit++;
    }
    
    public int getAika() {
        return minuutit;
    }
}