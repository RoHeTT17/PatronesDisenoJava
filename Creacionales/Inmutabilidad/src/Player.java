public class Player {

    private final String name;
    private final int score;
    private final int level;

    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }


    //* Si fuera de esta manera tendría que mandar llamar los 3 métodos para cambiarlo todo
    public Player withName(String name){
        return new Player(name, this.score, this.level);
    }

    public Player withScore(int score){
        return new Player(this.name, score, this.level);
    }

    public Player withLevel(int level){
        return new Player(this.name, this.score, level);
    }

    //* Todo en la misma llamada
    public Player copyWith(String name, Integer score, Integer level){

        return new Player( name == null ? this.name  : name, 
                           score== null ? this.score : score, 
                           level== null ? this.level : level 
                         );

    }

    public void displayState(){
     
        System.out.println("Jugador: "+this.name);
        System.out.println("Puntaje: "+this.score);
        System.out.println("Nivel: "+this.level);

    }
    
}
