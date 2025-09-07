package ejercicio_03.solucion;

public class DatabaseManager {

    public DatabaseManager() {
        // Usa getInstance() en lugar de new
    }

    public void saveData() {
        GameConfig config = GameConfig.getInstance();
        
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
        System.out.println("Debug mode activo: " + config.isDebugMode());
    }
}
