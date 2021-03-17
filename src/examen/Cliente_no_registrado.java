package examen;

public class Cliente_no_registrado implements Cliente{
    @Override
    public float aplicaDescuento(Producto producto) {
        return producto.getPrecio() - producto.obtener_descuento();
    }

    @Override
    public void pagar(float cantidad) {
        // no pasa nada
    }
}
