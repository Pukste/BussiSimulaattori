/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussisimulaattori;
import java.util.Comparator;

/**
 *
 * @author Kymppi
 */
public class Komparaattori implements Comparator<Tapahtuma>
{
    @Override
    public int compare(Tapahtuma tapahtuma1, Tapahtuma tapahtuma2){
        if (tapahtuma1.getAika() < tapahtuma2.getAika())
        {  return -1;}
        if (tapahtuma1.getAika() > tapahtuma2.getAika())
        {  return 1;}
        return 0;
    }
}
