import java.util.ArrayList;
import java.util.Optional;

public class CodeEditorHistory {

    private ArrayList<CodeEditorState> history;
    private int currentIndex;
    
    public CodeEditorHistory(){
        history = new ArrayList<>();
        currentIndex = -1;
    };
    
    
    public void save(CodeEditorState state){
        //Este patrón permite navegar entre el "historial" de  estados, por lo tanto, es necesario validar en que "momento" del historial
        //se encuentra y si guarda un nuevo estado borrar los estados que "estan delante" 
        if(this.currentIndex< this.history.size()-1){
              //Limpiar los estados que ya no son validos
            this.history = (ArrayList<CodeEditorState>) this.history.subList(0, this.currentIndex+1);
        }

        this.history.add(state);
        this.currentIndex++;

    }


    //Revertir el estado (ctrl+Z)
    public Optional<CodeEditorState>  undo(){

        if (this.currentIndex > 0){
                this.currentIndex--;
                return Optional.of(this.history.get(this.currentIndex));
            
        }
    
        return null;
    
    }
    
    //Re-hacer el estado (ctrl+Y)
    public  Optional<CodeEditorState> redo(){
    
        if (this.currentIndex < this.history.size()-1){
            this.currentIndex++;
            return Optional.of(this.history.get(this.currentIndex));
        }
    
         return null;
    
    }



}
