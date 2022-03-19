package Model;

public class Scissors {

    private final String nombre = "Scissors";

    public Scissors() {
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
