import Objetos.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Pokemon Charmander = new Pokemon("Charmander", "Fuego", 1, new String[]{"Llamarada", "Arañazo"});
        
        Pokemon Charmander = new Pokemon("Charmander", "Fuego", 1, "Llamarada", "Arañazo");

        Charmander.DisplayInfo();

        System.out.println("***********CLONES***************");

        Pokemon Charmeleon = Charmander.Clone();
        Charmeleon.name = "Charmeleon";
        Charmeleon.level = 16;
        Charmeleon.attacks.add("Lanzallamas");
        Charmander.DisplayInfo();     
        System.out.println("---------------------------------------");
        Charmeleon.DisplayInfo();
    

    }
}
