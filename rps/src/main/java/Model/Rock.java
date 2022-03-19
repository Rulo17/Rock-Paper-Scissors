package Model;

public class Rock {

    private final String nombre="Rock";

    public Rock() {
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
