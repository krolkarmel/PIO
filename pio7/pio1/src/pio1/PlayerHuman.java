package pio1;



public class PlayerHuman extends Player{
    private Scanner input = new Scanner(System.in);
    private Random brain = new Random();
    private int liczba;
    PlayerHuman(){
        
    }
    PlayerHuman(String imie){
        super(imie);
    }
    
    public int guess(){
        System.out.println("Podaj liczbe:");
        liczba = input.nextInt();
        
            return liczba;
        }
}
