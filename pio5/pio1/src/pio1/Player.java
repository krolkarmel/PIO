
package pio1;

import java.util.Random;
import javax.swing.JOptionPane;

public abstract class Player {
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
         //   this.imie = imie;
        throw new NullPointerException();
        }
        else{
            throw new IllegalArgumentException();
        }
  
        
    }
    public String getName(){
        return imie;
        
    }
    
        abstract public int guess();
}
