package ejercicio_01.solucion;

public abstract class GameFactory {
    
    // Función de creación
    public abstract Game createGame();
    
    public void playGame() {
        Game game = createGame();
        System.out.println(game.getInfo());
        game.start();
        System.out.println("¡Disfruta el juego!\n");
    }
}
