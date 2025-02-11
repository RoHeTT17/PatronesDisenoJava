public record CodeEditorState( String content, Integer cursorPosition, boolean  unSavedChanges) {

    
    public CodeEditorState withContent(String content){

        return new CodeEditorState(content, this.cursorPosition, this.unSavedChanges);
    }
    
    public CodeEditorState withCursorPosition(int cursorPosition){
        return new CodeEditorState(this.content, cursorPosition, this.unSavedChanges);
    }

    public CodeEditorState withUnsavedChange(int cursorPosition){
        return new CodeEditorState(this.content, this.cursorPosition, unSavedChanges);
    }

    public CodeEditorState copyWith(String content, Integer cursorPosition, boolean  unSavedChanges){

        return new CodeEditorState(
                                    content == null        ? this.content: content, 
                                    cursorPosition == null ? this.cursorPosition: cursorPosition, 
                                    (unSavedChanges == this.unSavedChanges) ? this.unSavedChanges : unSavedChanges
                                  );

    }


    public void displaySate(){
        System.out.println("Estado del editor: ");
        System.out.println("Contenido: "+this.content);
        System.out.println("Cursor position: "+this.cursorPosition);
        System.out.println("Unsaved changes: "+this.unSavedChanges);
;
    }


}
