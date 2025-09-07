package ejercicio_01.solucion;

public class FPSFactory extends GameFactory {
    
    @Override
    public Game createGame() {
        return new FPSGame();
    }
}
