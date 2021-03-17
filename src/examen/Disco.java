package examen;

public class Disco extends Producto{
    protected String grupo = "Unknown";
    protected int stock = 0;
    protected genero_musica genero = genero_musica.Other;

    public Disco(int numero_id) {
        super(numero_id);
    }

    public Disco(int numero_id, float precio) {
        super(numero_id, precio);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public genero_musica getGenero() {
        return genero;
    }

    public void setGenero(genero_musica genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "grupo='" + grupo + '\'' +
                ", stock=" + stock +
                ", genero=" + genero +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", ano_pub=" + ano_pub +
                ", numero_id=" + numero_id +
                ", sale_producto=" + sale_producto +
                '}';
    }
}
