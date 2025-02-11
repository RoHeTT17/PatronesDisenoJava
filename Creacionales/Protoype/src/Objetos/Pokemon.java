package Objetos;

import java.util.ArrayList;
import java.util.Arrays;

public class Pokemon {

    public String   name;
    public String   type;
    public int      level;
    public ArrayList<String> attacks;

    /*public Pokemon(String name, String type, int level, String[] attacks) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.attacks = attacks;
    }*/

    public Pokemon(String name, String type, int level, String...attacks) {
        this.name    = name;
        this.type    = type;
        this.level   = level;
        this.attacks =  new ArrayList<> (Arrays.asList(attacks));
    }
    
    
    public Pokemon Clone(){
    
            return new Pokemon(this.name, this.type, this.level, this.attacks.toArray(new String[0])); 

    }

    public void DisplayInfo(){

        System.out.println("Pokémon: "+this.name +"\n"+
                           "Tipo: "   +this.type +"\n"+
                           "Level: "  +this.level +"\n"+
                           //"Ataques: "+Arrays.toString(this.attacks)+"\n"
                           "Ataques: "+this.attacks+"\n"
                          );

    }

}
