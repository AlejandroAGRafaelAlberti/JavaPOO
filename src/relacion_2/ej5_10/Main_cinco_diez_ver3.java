package relacion_2.ej5_10;
/*
En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por
los dos criterios (título y autor) hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido
final
 */
public class Main_cinco_diez_ver3 {
    public static void main(String[] args) {
        Libro libro_1 = new Libro("titulo1","autor1",20,8);
        Libro libro_2 = new Libro("titulo2","autor1",20,9);
        ConjuntoLibros set_1 = new ConjuntoLibros();
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_1);
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_2);
        System.out.println(set_1.toString());
        set_1.eliminar_A("autor1");
        //por algun motivo solo se borra libro1, no se por que :c
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_1);
        System.out.println(set_1.toString());
    }


}
