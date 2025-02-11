public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-----------------------------INICIA----------------------------");
        CodeEditorHistory history = new CodeEditorHistory();
        CodeEditorState editorState = new CodeEditorState("rogelio hjadsfsadiufhasdiuh duiasdfuihasiudfhiugasdfui", 2, false);

        history.save(editorState);
        System.out.println("-----------------------------Estado inicial----------------------------");
        editorState.displaySate();

        editorState = editorState.copyWith("Primer copyWith", 17, true);

        history.save(editorState);

        System.out.println("-----------------------------Después del primer cambio----------------------------");
        editorState.displaySate();


        editorState = editorState.withCursorPosition(99);
        history.save(editorState);

        System.out.println("-----------------------------Después de cambiar la posición del cursor----------------------------");
        editorState.displaySate();
        
        System.out.println("-----------------------------Después del UNDO----------------------------");
        editorState = history.undo().get();//! De momento no estamos validando si regresa null
        editorState.displaySate();

        System.out.println("-----------------------------Después del RE-DO----------------------------");
        editorState = history.redo().get();//! De momento no estamos validando si regresa null
        editorState.displaySate();

    }
}
