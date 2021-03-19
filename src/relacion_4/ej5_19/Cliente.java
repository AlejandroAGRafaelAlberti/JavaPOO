package relacion_4.ej5_19;

public class Cliente extends Persona{
    private final long id;

    public Cliente(String nombre, long id) {
        super(nombre);
        this.id = id;
    }

    public Cliente(String nombre, String apellidos, long id) {
        super(nombre, apellidos);
        this.id = id;
    }

    public Cliente(String nombre, String apellidos, int edad, long id) {
        super(nombre, apellidos, edad);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
