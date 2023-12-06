package pio1;

import java.util.*;

public class Game extends Player {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Player player;
    private static List<Player> players = new ArrayList<>();


    private int cnt = 1;
    public void addPlayer(Player player) {
        players.forEach(p -> {
            if(player.getName().equals(p.getName())){
                System.out.println("TAKI GRACZ ISTNIEJE");
                player.setName(player.getName() + cnt);
                cnt-= 1;
            }
        });

        players.add(player);


            }

    public void play() {

        //addPlayer();
        //Player player = new PlayerComp();

        //       try{


        //       player.setName("Stefan");
        //       }
//        catch(NullPointerException e){
//            System.err.println("NULL");
//        }
//        catch(RuntimeException e){
//            System.err.println("Bład!");
//        }
        //      catch(IllegalArgumentException e){
        //         System.err.println("Bład skladni imienia!");
        //         System.out.println("Podaj imie");
        //         player.setName(scanner.nextLine());
        //     }
        int number;
        int guess;
        boolean repeat = true;
        do {

            number = rand.nextInt(6) + 1;


            for (Player player : players) {
                guess = player.guess();
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number == guess) {
                    System.out.println("BRAWO!");
                    repeat = false;
                } else {
                    System.out.println("PUDLO!");
                }
            }
        } while (repeat);
    }

    public void printPlayers(){


       players.forEach(player -> {
            System.out.println(player.getName());
       });
        System.out.println("------+-------+-------+");



      //  for(Player player : players){
       //     System.out.println(player.getName());
       // }
    }

    public void removePlayers(String name){
        players.removeIf(player -> (player.getName().equals(name)));

        /*players.forEach(player ->{
            if(player.getName().equals(name)){
                players.remove(player);
            }

        });
        */

        /*        for(Player player : players){
            if(player.getName().equals(name)){
                players.remove(player);
                break;
            }
        }*/


      /*  Iterator<Player> it = players.iterator();
        while(it.hasNext()){
            if(player.getName().equals(name)){
                it.remove();
            }
        }*/


/*        for(int i = 0 ; i < players.size() ; i++){
        if(players.get(i).getName().equals(name)) {
            players.remove(i);
        }
        }*/

    }

    @Override
    public int guess() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



}


