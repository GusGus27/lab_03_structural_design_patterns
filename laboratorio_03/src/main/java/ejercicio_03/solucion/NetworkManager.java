package ejercicio_03.solucion;

public class NetworkManager {

    public NetworkManager() {
        // Usa getInstance() en lugar de new
    }

    public void connect() {
        GameConfig config = GameConfig.getInstance();
        NetworkConfig networkConfig = NetworkConfig.INSTANCE;
        
        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
        System.out.println("Server: " + networkConfig.getServerUrl() + ":" + networkConfig.getPort());
    }
}
