package ejercicio_02.solucion;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("=== ABSTRACT FACTORY PATTERN - SOLUCIÓN ===\n");
        
        // Crear factories para diferentes plataformas
        System.out.println("1. Creando elementos para PC:");
        GameElementFactory pcFactory = new PCFactory();
        createGameElements(pcFactory);
        
        System.out.println("\n2. Creando elementos para Mobile:");
        GameElementFactory mobileFactory = new MobileFactory();
        createGameElements(mobileFactory);
        
        // Mostrar resultados - cambio dinámico
        System.out.println("\n3. Demostrando flexibilidad:");
        GameElementFactory[] factories = {pcFactory, mobileFactory};
        
        for (int i = 0; i < factories.length; i++) {
            System.out.println("\nPlataforma " + (i + 1) + ":");
            createGameElements(factories[i]);
        }
    }
    
    // Función que garantiza compatibilidad
    private static void createGameElements(GameElementFactory factory) {
        Character warrior = factory.createWarrior();
        Weapon weapon = factory.createWeapon();
        
        // Mostrar resultados
        System.out.println(warrior.getInfo());
        System.out.println(weapon.getInfo());
        
        warrior.attack();
        weapon.use();
    }
}
