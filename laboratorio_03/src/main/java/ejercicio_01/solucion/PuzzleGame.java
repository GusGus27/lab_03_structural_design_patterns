package ejercicio_01.solucion;

public class PuzzleGame extends Game {

    public PuzzleGame() {
        this.name = "Mind Bender";
        this.genre = "Puzzle";
    }

    @Override
    public void start() {
        System.out.println("Cargando rompecabezas...");
        System.out.println("Prepárate para desafiar tu mente");
    }
}
