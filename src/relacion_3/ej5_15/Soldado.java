package relacion_3.ej5_15;

public class Soldado {
    private String nombre = "Unknown";
    private String tipo = "Unknown";
    private float p_fuego;

    public Soldado(float p_fuego) {
        if (p_fuego>=0)
            this.p_fuego = p_fuego;
    }

    public Soldado(float p_fuego, String nombre) {
        this.nombre = nombre;
        this.p_fuego = p_fuego;
    }

    public Soldado(float p_fuego, String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.p_fuego = p_fuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getP_fuego() {
        return p_fuego;
    }

    public void setP_fuego(float p_fuego) {
        this.p_fuego = p_fuego;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", p_fuego=" + p_fuego +
                '}';
    }
}
