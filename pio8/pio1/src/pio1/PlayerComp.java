package pio1;

import java.util.Random;

public class PlayerComp extends Player{
    private Random brain = new Random();
    PlayerComp(){
        
    }
    PlayerComp(String imie){
        super(imie);
    }
    
    
    
    public int guess() {
        return brain.nextInt(6) + 1;
    }
}
