package ejercicio_01.solucion;

public class PuzzleFactory extends GameFactory {
    
    @Override
    public Game createGame() {
        return new PuzzleGame();
    }
}
