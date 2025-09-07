package ejercicio_02.solucion;

public class MobileWarrior extends Character {

    public MobileWarrior() {
        this.name = "Guerrero Móvil";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero Mobile ataca con efectos optimizados para batería");
    }
}
