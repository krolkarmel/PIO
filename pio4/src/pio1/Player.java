
package pio1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Player {
    private String imie = "NONAME";
    Player(){
    
//        if(imie == null)
//            this.imie = "noname";   
     }
    
    Player(String imie){
        setName(imie);
    }
    
    
    public void setName(String imie){

        if(!imie.isEmpty() && imie != null){
            this.imie = imie;
        }
        else{
            System.err.println("Imie jest puste");
        }
  
        
    }
    public String getName(){
        return imie;
        
    }
    
    private Random brain = new Random();
        public int guess(){
            return brain.nextInt(6) + 1;
        }
}
