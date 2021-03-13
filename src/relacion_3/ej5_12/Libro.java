package relacion_3.ej5_12;

public class Libro {
    private final String titulo;
    private final String n_autor;
    private int numero_pag = 0;
    private String genero = "Unknown";

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        n_autor = autor.getNombre();
    }
    public Libro(String titulo, Autor autor, int numero_pag) {
        this.titulo = titulo;
        n_autor = autor.getNombre();
        this.numero_pag = numero_pag;
    }
    public Libro(String titulo, Autor autor, int numero_pag, String genero) {
        this.titulo = titulo;
        n_autor = autor.getNombre();
        this.numero_pag = numero_pag;
        this.genero = genero;
    }

    public void setNumero_pag(int numero_pag) {
        this.numero_pag = numero_pag;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero_pag() {
        return numero_pag;
    }

    public String getGenero() {
        return genero;
    }

    public String getN_autor() {
        return n_autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", n_autor='" + n_autor + '\'' +
                ", numero_pag=" + numero_pag +
                ", genero='" + genero + '\'' +
                '}';
    }
}
