public class App {
    public static void main(String[] args) throws Exception {
       

    // Crear jugador inicial
    Player player = new Player("Carlos", 0, 1);
    System.out.println("Estado inicial:");
    player.displayState();

    System.out.println("-----------------------------------------------");

    // Incrementar el puntaje
    player = player.copyWith(null,10, null);
    System.out.println("Después de incrementar el puntaje:");
    player.displayState();

    System.out.println("-----------------------------------------------");
    // Subir de nivel
    player = player.withLevel(2 );
    System.out.println("Después de subir de nivel:");
    player.displayState();

    System.out.println("-----------------------------------------------");
    // Cambiar el nombre del jugador
    player = player.withName("Carlos Pro");
    System.out.println("Después de cambiar el nombre:");
    player.displayState();

    System.out.println("-----------------------------------------------");

    }
}
