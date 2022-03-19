package Model;

public class Paper {

    private final String nombre="Paper";

    public String getNombre() {
        return nombre;
    }

    public Paper() {
    }

    @Override
    public String toString() {
        return "Paper{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
