package ejercicio_01.solucion;

public class RPGFactory extends GameFactory {
    
    @Override
    public Game createGame() {
        return new RPGGame();
    }
}
