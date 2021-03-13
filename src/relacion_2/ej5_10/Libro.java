package relacion_2.ej5_10;
/*
Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos
haya gustado más o menos al leerlo.
Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación que le
damos entre 0 y 10. Crear los métodos para poder modificar y obtener los atributos (sólo si tienen sentido).
 */
    public class Libro{
        private final String titulo;
        private final String autor;
        private int n_pag = 0;
        private int calificacion;

        @Override
        public String toString() {
            return "Libro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", n_pag=" + n_pag +
                    ", calificacion=" + calificacion +
                    '}';
        }

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            calificacion = 0;
        }

        public Libro(String titulo, String autor, int calificacion) {
            this.titulo = titulo;
            this.autor = autor;
            if (calificacion<=10 & calificacion >=0)this.calificacion = calificacion;
            else this.calificacion=0;
        }

        public Libro(String titulo, String autor, int n_pag, int calificacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.n_pag = n_pag;
            if (calificacion<=10 & calificacion >=0)this.calificacion = calificacion;
            else this.calificacion=0;
        }

        public void setN_pag(int n_pag) {
            this.n_pag = n_pag;
        }

        public void setCalificacion(int calificacion) {
            if (calificacion<=10 & calificacion >=0) this.calificacion = calificacion;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getN_pag() {
            return n_pag;
        }

        public int getCalificacion() {
            return calificacion;
        }
    }
