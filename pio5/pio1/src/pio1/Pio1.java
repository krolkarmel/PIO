package pio1;

import java.util.Random;
import java.util.Scanner;



public class Pio1  {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        Player player = new PlayerHuman();
        Player player1 = new PlayerComp();

        try{
        player.setName("");
        }
//        catch(NullPointerException e){
//            System.err.println("NULL");
//        }
        catch(RuntimeException e){
            System.err.println("Bład!");
        }
        int number;                    
        int guess;                    

        do {

            number = rand.nextInt(6) + 1;

            guess = player1.guess(); 
            System.out.println("Gracz " + player1.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDLO!");
            }

        } while (number != guess);

        System.out.println("BRAWO!");
    }

}
