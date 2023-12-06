
package pio1;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public abstract class Player {
    private String imie = "NONAME";
    Player(){
    
//        if(imie == null)
//            this.imie = "noname";   
     }
    
    Player(String imie){
        setName(imie);
    }
    
    private String regex = "^[A-Za-z0-9_\\-.]{3,}$";
    
    public void setName(String imie){
        
        
        if(!imie.isEmpty() && imie.matches(regex)){
            this.imie = imie;
//        throw new NullPointerException();
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
