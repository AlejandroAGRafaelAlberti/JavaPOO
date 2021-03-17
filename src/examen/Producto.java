package examen;

public abstract class Producto {
    protected String titulo="Unknown";
    protected float precio = 0;
    protected int ano_pub = 0;
    protected final int numero_id; // para poder buscarlo
    protected int sale_producto = 0;

    public Producto(int numero_id) {
        this.numero_id = numero_id;
    }

    public Producto(int numero_id,float precio) {
        this.precio = precio;
        this.numero_id = numero_id;
    }

    public int obtener_descuento() {
        return sale_producto;
    }

    public void setSale_producto(int sale_producto) {
        this.sale_producto = sale_producto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAno_pub() {
        return ano_pub;
    }

    public void setAno_pub(int ano_pub) {
        this.ano_pub = ano_pub;
    }

    public int getNumero_id() {
        return numero_id;
    }
}
