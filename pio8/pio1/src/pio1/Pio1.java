package pio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pio1  {

    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer(new PlayerComp("stefan"));
        game.addPlayer(new PlayerComp("stefan"));
        game.addPlayer(new PlayerComp("stefan2"));
        game.addPlayer(new PlayerComp("stefan1"));
        game.addPlayer(new PlayerComp("mario"));
        game.addPlayer(new PlayerComp("arek"));

        game.printPlayers();

     //   game.play();

    }

}
