package ejercicio_03.solucion;

public class GameSession {

    public GameSession() {
        // Usa getInstance() en lugar de new
    }

    public void startSession() {
        GameConfig config = GameConfig.getInstance();
        
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
        System.out.println("Database: " + config.getDatabaseUrl());
    }
}
