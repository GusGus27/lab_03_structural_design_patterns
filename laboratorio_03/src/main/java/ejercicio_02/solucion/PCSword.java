package ejercicio_02.solucion;

public class PCSword extends Weapon {

    public PCSword() {
        this.name = "Espada Legendaria";
        this.platform = "PC";
    }

    @Override
    public void use() {
        System.out.println("Espada PC con gráficos detallados, reflejos y animaciones fluidas");
    }
}
