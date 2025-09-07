package ejercicio_01.solucion;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD PATTERN - SOLUCIÓN ===\n");
        
        // Crear factories específicos
        GameFactory rpgFactory = new RPGFactory();
        GameFactory fpsFactory = new FPSFactory();
        GameFactory puzzleFactory = new PuzzleFactory();
        
        // Mostrar resultados
        System.out.println("1. Creando juego RPG:");
        rpgFactory.playGame();
        
        System.out.println("2. Creando juego FPS:");
        fpsFactory.playGame();
        
        System.out.println("3. Creando juego Puzzle:");
        puzzleFactory.playGame();
        
        // Uso dinámico
        System.out.println("4. Usando factories dinámicamente:");
        GameFactory[] factories = {rpgFactory, fpsFactory, puzzleFactory};
        
        for (GameFactory factory : factories) {
            factory.playGame();
        }
    }
}
