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
import java.util.Comparator;
import java.util.PriorityQueue;
public class Prioqueue {
    public static void main(String[] args) {
        
        Comparator<String> comparator = new Komparaattori();
        PriorityQueue<String> queue =
                new PriorityQueue<String>(10, comparator);
        queue.add(tapahtuma());
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }
}
