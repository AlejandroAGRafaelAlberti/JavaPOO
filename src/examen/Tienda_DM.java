package examen;

import java.util.ArrayList;

public class Tienda_DM {
    private ArrayList<Producto> a_productos;
    private ArrayList<Disco> a_discos;
    private ArrayList<Pelicula> a_peliculas;
    private void anadirProducto(Producto producto){
        a_productos.add(producto);
    }
    public void anadirDisco(Disco disco){
        a_discos.add(disco);
        anadirProducto(disco);
    }
    public void anadirPelicula(Pelicula pelicula){
        a_peliculas.add(pelicula);
        anadirProducto(pelicula);
    }
    public int buscaProducto(int numero_id_buscar){
        for (Producto producto: a_productos){
            if (producto.getNumero_id() == numero_id_buscar) return numero_id_buscar;
        }
        return 0;
    }
    public Disco buscaDisco(int numero_id_buscar){
        for (Disco disco: a_discos){
            if (disco.getNumero_id() == numero_id_buscar) return disco;
        }
        return new Disco(0); // error id
    }
    public Pelicula buscaPelicula(int numero_id_buscar){
        for (Pelicula pelicula: a_peliculas){
            if (pelicula.getNumero_id() == numero_id_buscar) return pelicula;
        }
        return new Pelicula(0); // error id
    }
    public float compraPelicula(int num_ejemplares,Pelicula pelicula){
        return num_ejemplares * pelicula.getPrecio();
    }
    public float compraDisco(int num_ejemplares,Disco disco){
        disco.setStock(disco.getStock()-num_ejemplares);
        return num_ejemplares * disco.getPrecio();
    }
}
