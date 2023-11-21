package pio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pio1  {

    public static void main(String[] args) {
       
        List<String> list = new ArrayList();
        
        list.add("raz");
        list.add("3333");
        list.add("r1223");
        list.add("442");
        list.add("vceas");
        list.add("dzasz");
        list.add("dasz");
        
   
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
   
        System.out.println("-----------------------------------");
        
        for(String item : list){
            System.out.println(item);
        }
        
        System.out.println("-----------------------------------");
        
        list.forEach(System.out::println);
        
        System.out.println("-----------------------------------");
        
        Iterator<String> iterator = list.iterator(); 
        
        while(true){ 
            if(list.iterator().hasNext())
            System.out.println(iterator.next());
        else
            System.out.println("Koniec listy");
    }
        
        for(Iterator<String> it = list.iterator() ){
        it.hasNext();
        System.out.println(it.next())
                }
//        Game game = new Game();
//        game.play();

    }

}
