package pio1;

import java.util.Random;
import java.util.Scanner;



public class Pio1  {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int mode = 1;
        int rzut;
        int guess;
        rzut = rand.nextInt(6) + 1;
        
//        Player player = new Player("");
//        player.setName("");
//        PlayerHuman player = new PlayerHuman("aaa");
        Player p;
        if(mode == 1)
        p = new PlayerHuman(); 
      else
           p = new Player();     
//        while(true){
//        System.out.println("Podaj liczbe, ktora wylosowala kostka: ");
//        liczba =(new Scanner(System.in)).nextInt();
//       liczba = rand.nextInt(6) + 1;
//        
//            System.out.println("Gracz" + " "  + player.getName() + " " + guess);
//        if(guess != rzut){
//            System.out.println("Zly traf.");
//        }
//        else {
//            System.out.println("Trafiles!");
//            break;
//        }
//        }
    }
    
}
