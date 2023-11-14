package pio1;

import java.util.Random;
import java.util.Scanner;



public class Pio1  {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        Player player = new PlayerHuman();
    //    Player player1 = new PlayerComp();

        try{
        player.setName("xx");
        }
//        catch(NullPointerException e){
//            System.err.println("NULL");
//        }
//        catch(RuntimeException e){
//            System.err.println("Bład!");
//        }
       catch(IllegalArgumentException e){
           System.err.println("Bład skladni imienia!");
           System.out.println("Podaj imie");
           player.setName(scanner.nextLine());
       }
        int number;                    
        int guess;                    

        do {
            
            number = rand.nextInt(6) + 1;

            guess = player.guess(); 
            System.out.println("Gracz " + player.getName() + ": " + guess);
            
            if (number != guess) {
                System.out.println("PUDLO!");
            }

        } while (number != guess);

        System.out.println("BRAWO!");
    }

}
