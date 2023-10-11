
package pio1;

import java.util.Random;

public class Player {
    private String imie;
    
    
    public void setName(String imie){
        this.imie = imie;
    }
    public String getName(){
        return imie;
    }
    
    private Random brain = new Random();
        public int guess(){
            return brain.nextInt(6) + 1;
        }
}
