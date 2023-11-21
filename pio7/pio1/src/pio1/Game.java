package pio1;

import java.util.Random;
import java.util.Scanner;

public class Game extends Player{
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Player player;
    public void addPlayer(){

        
        System.out.println("Kto ma grac gracz czy komputer?");
        String var = scanner.nextLine();
        if (var.equals("gracz")) {
            player = new PlayerHuman();
        } else if (var.equals("komputer")) {
            player = new PlayerComp();
        }
    }
    public void play(){
    
        addPlayer();
        //Player player = new PlayerComp();
    
        try{
        
        
        player.setName("Stefan");
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

    @Override
    public int guess() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



}


