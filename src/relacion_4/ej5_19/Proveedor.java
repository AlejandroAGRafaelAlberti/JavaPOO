package relacion_4.ej5_19;

public class Proveedor extends Persona{
    private String codigo;

    public Proveedor(String nombre, String codigo) {
        super(nombre);
        this.codigo = codigo;
    }

    public Proveedor(String nombre, String apellidos, String codigo) {
        super(nombre, apellidos);
        this.codigo = codigo;
    }

    public Proveedor(String nombre, String apellidos, int edad, String codigo) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
