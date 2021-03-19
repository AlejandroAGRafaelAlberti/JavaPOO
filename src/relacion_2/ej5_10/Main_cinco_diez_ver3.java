package relacion_2.ej5_10;

public class Main_cinco_diez_ver3 {
    public static void main(String[] args) {
        Libro libro_1 = new Libro("titulo1","autor1",20,8);
        Libro libro_2 = new Libro("titulo2","autor2",20,9);
        ConjuntoLibros set_1 = new ConjuntoLibros();
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_1);
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_2);
        System.out.println(set_1.toString());
        set_1.eliminar_A("autor1");
        System.out.println(set_1.toString());
        set_1.eliminar_T("titulo2");
        System.out.println(set_1.toString());
        set_1.anyadir_libro(libro_1);
        System.out.println(set_1.toString());
    }


}
