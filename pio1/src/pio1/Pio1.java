
package pio1;

import java.util.Random;
import java.util.Scanner;

public class Pio1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int rzut;
        int liczba;
        rzut = rand.nextInt(6) + 1;
        while(true){
        System.out.println("Podaj liczbe, ktora wylosowala kostka: ");
        liczba =(new Scanner(System.in)).nextInt();
        if(liczba != rzut){
            System.out.println("Zly traf.");
        }
        else {
            System.out.println("Trafiles!");
            break;
        }
        }
    }
    
}
