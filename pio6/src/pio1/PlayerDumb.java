package pio1;
public class PlayerDumb extends Player{
    PlayerDumb(){
        
    }
    PlayerDumb(String imie){
        super(imie);
    }
    
    public int guess() {
        return 3;
    }
}
