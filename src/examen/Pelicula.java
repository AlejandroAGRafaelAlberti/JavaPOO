package examen;

public class Pelicula extends Producto{
    protected String director = "Unknown";
    protected genero_pelicula genero = genero_pelicula.Other;

    public Pelicula(int numero_id) {
        super(numero_id);
    }

    public Pelicula(int numero_id, float precio) {
        super(numero_id, precio);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public genero_pelicula getGenero() {
        return genero;
    }

    public void setGenero(genero_pelicula genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", genero=" + genero +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", ano_pub=" + ano_pub +
                ", numero_id=" + numero_id +
                ", sale_producto=" + sale_producto +
                '}';
    }
}
