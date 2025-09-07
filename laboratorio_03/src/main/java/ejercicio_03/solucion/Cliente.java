package ejercicio_03.solucion;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("=== SINGLETON PATTERN - SOLUCIÓN ===\n");
        
        // Mostrar configuración inicial
        System.out.println("1. Estado inicial de la configuración:");
        GameConfig config = GameConfig.getInstance();
        config.showConfig();
        
        // Modificar desde GameSession
        System.out.println("\n2. Modificando configuración desde GameSession:");
        GameSession session = new GameSession();
        GameConfig.getInstance().setMaxPlayers(50);
        GameConfig.getInstance().setDebugMode(true);
        session.startSession();
        
        // Verificar cambios desde NetworkManager
        System.out.println("\n3. Verificando cambios desde NetworkManager:");
        NetworkManager network = new NetworkManager();
        network.connect();
        
        // Verificar cambios desde DatabaseManager
        System.out.println("\n4. Verificando cambios desde DatabaseManager:");
        DatabaseManager database = new DatabaseManager();
        database.saveData();
        
        // Mostrar resultados - misma instancia
        System.out.println("\n5. Demostrando que es la misma instancia:");
        GameConfig config1 = GameConfig.getInstance();
        GameConfig config2 = GameConfig.getInstance();
        GameConfig config3 = GameConfig.getInstance();
        
        System.out.println("config1 hash: " + config1.hashCode());
        System.out.println("config2 hash: " + config2.hashCode());
        System.out.println("config3 hash: " + config3.hashCode());
        System.out.println("¿Son la misma instancia? " + (config1 == config2 && config2 == config3));
        
        // NetworkConfig usando enum
        System.out.println("\n6. Demostrando NetworkConfig (Enum Singleton):");
        NetworkConfig networkConfig1 = NetworkConfig.INSTANCE;
        NetworkConfig networkConfig2 = NetworkConfig.INSTANCE;
        
        networkConfig1.setPort(9090);
        networkConfig1.showNetworkConfig();
        
        System.out.println("NetworkConfig es la misma instancia: " + (networkConfig1 == networkConfig2));
        System.out.println("Puerto desde segunda referencia: " + networkConfig2.getPort());
    }
}
