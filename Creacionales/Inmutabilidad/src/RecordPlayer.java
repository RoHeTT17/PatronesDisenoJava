public record RecordPlayer(String name, Integer score, Integer level) {


    public RecordPlayer withName(String name){
        return new RecordPlayer(name, this.score, this.level);
    }

    public RecordPlayer withScore(int score){
        return new RecordPlayer(this.name, score, this.level);
    }

    public RecordPlayer withLevel(int level){
        return new RecordPlayer(this.name, this.score, level);
    }

    //* Todo en la misma llamada
    public RecordPlayer copyWith(String name, Integer score, Integer level){

        return new RecordPlayer( name == null ? this.name  : name, 
                           score== null ? this.score : score, 
                           level== null ? this.level : level 
                         );

    }

}
