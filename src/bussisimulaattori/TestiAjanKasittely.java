package bussisimulaattori;

import java.util.Scanner;

public class TestiAjanKasittely {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        int tunti;
        int minuutti;
        int paiva = 1; //ensimmäinen päivä

        System.out.println("Tunnit: ");
        tunti = lukija.nextInt();

        System.out.println("Minuutit");
        minuutti = lukija.nextInt();

        while (minuutti >= 60) {
            minuutti = minuutti - 60;
            tunti = tunti + 1;
        }

        while (tunti >= 24) {
            tunti = tunti - 24;
            paiva = paiva + 1;
        }

          if (minuutti < 10) {
            System.out.println("Päivä: " + paiva + "." + " " + tunti + ":" + "0" + minuutti);
        } else {
            System.out.println("Päivä: " + paiva + "." + " " + "Kello: " + tunti + ":" + minuutti);
        }

    }

}
