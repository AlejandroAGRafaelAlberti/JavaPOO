package relacion_2.ej5_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño
fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar
por pantalla los libros con la mayor y menor calificación y, por último, mostrar un contenido del conjunto.
 */
public  class ConjuntoLibros{
    private final Vector<Libro> v_libros;
    // Max Size = 10

    public void anyadir_libro(Libro libro){
        if(v_libros.size()<11){
            v_libros.add(libro);
        }
    }

    public ArrayList<String> mejoresLibros() {
        ArrayList<String> result = new ArrayList<>(1);
        for (Libro libro : v_libros){
            if (libro.getCalificacion()>8)
                result.add(libro.getTitulo());
        }
        return result;
    }

    public  ArrayList<String> peoresLibros() {
        ArrayList<String> result = new ArrayList<>(1);
        for (Libro libro : v_libros){
            if (libro.getCalificacion()<2)
                result.add(libro.getTitulo());
        }
        return result;
    }

    public void eliminar_A(String autor){
        v_libros.removeIf(libro -> libro.getAutor().equals(autor));
    }
    public void eliminar_T(String titulo){
        v_libros.removeIf(libro -> libro.getTitulo().equals(titulo));
    }

    @Override
    public String toString() {
        return "ConjuntoLibros{" +
                "v_libros=" + v_libros +
                '}';
    }

    public Vector<Libro> getV_libros() {
        return v_libros;
    }

    public ConjuntoLibros() {
        v_libros = new Vector<>(10,0);
    }
}