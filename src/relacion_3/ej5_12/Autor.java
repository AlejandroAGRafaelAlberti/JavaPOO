package relacion_3.ej5_12;


import java.util.Arrays;

public class Autor {
    private final String nombre;
    private String nacionalidad = "Unknown";
    private final Libro[] libros_escritos = new Libro[5];
    private final String[] libros_T_escritos = new String[5];
    //cada autor puede escribir hasta cinco libros, para hacer mas faciles los test, pero se puede cambiar facilmente
    //el primer array tiene los libros como objetos, el segundo solo los titulos

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }
    public boolean anyadir_libro(Libro libro){
        for (int i=0; i<libros_escritos.length;i++){
            if(libros_escritos[i]==null) {
                libros_escritos[i] = libro;
                libros_T_escritos[i] = libro.getTitulo();
                return true;
            }
        }
        return false;
    }
    public boolean eliminar_libro(Libro libro){
        for (int i=0; i<libros_escritos.length;i++){
            if(libros_escritos[i]==libro) {
                libros_escritos[i] = null;
                libros_T_escritos[i] = null;
                return true;
            }
        }
        return false;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Libro[] getLibros_escritos() {
        return libros_escritos;
    }

    public String[] getLibros_T_escritos() {
        return libros_T_escritos;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", libros_escritos=" + Arrays.toString(libros_escritos) +
                ", libros_T_escritos=" + Arrays.toString(libros_T_escritos) +
                '}';
    }
}
