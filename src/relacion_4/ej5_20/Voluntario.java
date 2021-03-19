package relacion_4.ej5_20;

public class Voluntario {
    private final String nombre;
    private int edad=18;

    public Voluntario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        if (edad<0)
            this.edad = -edad;
    }

    public Voluntario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
