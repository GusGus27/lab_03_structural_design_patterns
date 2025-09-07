package ejercicio_02.solucion;

public class PCWarrior extends Character {

    public PCWarrior() {
        this.name = "Guerrero Elite";
        this.platform = "PC";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero PC ataca con efectos en HD y partículas avanzadas");
    }
}
