package ejercicio_03.solucion;

public enum NetworkConfig {
    INSTANCE;
    
    private String serverUrl;
    private int port;
    private int timeout;
    
    NetworkConfig() {
        this.serverUrl = "https://gameserver.com";
        this.port = 8080;
        this.timeout = 5000;
    }
    
    public String getServerUrl() {
        return serverUrl;
    }
    
    public void setServerUrl(String url) {
        this.serverUrl = url;
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public int getTimeout() {
        return timeout;
    }
    
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    
    // Mostrar configuración de red
    public void showNetworkConfig() {
        System.out.println("=== Network Configuration ===");
        System.out.println("Server URL: " + serverUrl);
        System.out.println("Port: " + port);
        System.out.println("Timeout: " + timeout + "ms");
        System.out.println("Instance Hash: " + this.hashCode());
        System.out.println("==============================");
    }
}
