package ejercicio_02.solucion;

public interface GameElementFactory {
    
    // Función de creación de personajes
    Character createWarrior();
    
    // Función de creación de armas
    Weapon createWeapon();
}
