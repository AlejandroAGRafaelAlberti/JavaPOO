package relacion_2.ej5_6;

public class Main_cinco_seis {
    public static void main( String [] args ){
        Rectangulo myrectangulo1;
        myrectangulo1 = new Rectangulo(4,5);
        System.out.println(myrectangulo1.toString());
        myrectangulo1.setAltura(0);
        //no hace nada ya que es cero, y no es valido.
        myrectangulo1.setBase(10);
        System.out.println(myrectangulo1.toString());
    }
}
