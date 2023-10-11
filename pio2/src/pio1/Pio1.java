package pio1;

import java.util.Random;
import java.util.Scanner;

public class Pio1  {

    public static void main(String[] args) {
        Random rand = new Random();
        int rzut;
        int guess;
        rzut = rand.nextInt(6) + 1;
        
        Player player = new Player();
        Player player2 = new Player();
        player.setName("Ziutek");
        player2.setName("Romek");
        
        while(true){
        System.out.println("Podaj liczbe, ktora wylosowala kostka: ");
//        liczba =(new Scanner(System.in)).nextInt();
//        liczba = rand.nextInt(6) + 1;
        guess = player.guess();
            System.out.println("Gracz" + " "  + player.getName() + " " + guess);
        if(guess != rzut){
            System.out.println("Zly traf.");
        }
        else {
            System.out.println("Trafiles!");
            break;
        }
        }
    }
    
}
