package ejercicio_03.solucion;

public class GameConfig {

    private static volatile GameConfig instance;
    
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    // Constructor privado
    private GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }

    // Función de creación singleton
    public static GameConfig getInstance() {
        if (instance == null) {
            synchronized (GameConfig.class) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String url) {
        this.databaseUrl = url;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }
    
    // Mostrar configuración
    public void showConfig() {
        System.out.println("=== Configuración Actual ===");
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("Debug Mode: " + debugMode);
        System.out.println("Max Players: " + maxPlayers);
        System.out.println("Instance Hash: " + this.hashCode());
        System.out.println("============================");
    }
}
