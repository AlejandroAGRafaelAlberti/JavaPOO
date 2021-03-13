package relacion_2.ej5_10;

import java.util.Vector;

/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño
fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar
por pantalla los libros con la mayor y menor calificación y, por último, mostrar un contenido del conjunto.

 */
    public  class ConjuntoLibros{
        private final Vector<Libro> v_libros;
        // Max Size = 10
        private final Vector<String> rambest;
        private final Vector<String> ramworst;

        public void anyadir_libro(Libro libro){
            if(v_libros.size()<11){
                v_libros.add(libro);
            }
        }

        public Vector<String> mejoresLibros() {
            best_and_worst_update();
            return rambest;
        }

        public Vector<String> peoresLibros() {
            best_and_worst_update();
            return ramworst;
        }

        public void best_and_worst_update(){
            rambest.clear();
            ramworst.clear();
            int ram_cal1 = 0; // mayor cal
            int ram_cal2 = 10; // menor cal
            for (Libro libro: v_libros){
                if (libro.getCalificacion()>ram_cal1) ram_cal1 = libro.getCalificacion();
                if (libro.getCalificacion()<ram_cal2) ram_cal2 = libro.getCalificacion();
            }
            for (Libro libro : v_libros){
                if (ram_cal1 == libro.getCalificacion()) rambest.add(libro.getTitulo());
                if (ram_cal2 == libro.getCalificacion()) ramworst.add(libro.getTitulo());
            }
        }


        public void eliminar_A(String autor){
            // no tengo ni idea de que este linting problem , te lo dejo como yo lo se hacer
            // v_libros.removeIf(libro -> libro.getAutor().equals(autor));
            v_libros.removeIf(libro -> libro.getAutor().equals(autor));
        }
        public void eliminar_T(String titulo){
            // no tengo ni idea de que este linting problem , te lo dejo como yo lo se hacer
            // v_libros.removeIf(libro -> libro.getTitulo().equals(titulo));
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
            rambest = new Vector<String>();
            ramworst = new Vector<String>();
        }
    }
