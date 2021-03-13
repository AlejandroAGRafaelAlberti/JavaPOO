package relacion_3.ej5_13;

public class Punto {
    private int x = 0;
    private int y = 0;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean puntos_iguales(Punto punto_extranjero){
        return x == punto_extranjero.getX() & y == punto_extranjero.getY();
    }

    public double distancia(Punto punto_extranjero){
        int x2 = punto_extranjero.getX();
        int y2 = punto_extranjero.getY();
         return Math.pow((Math.pow((x2-x),2)+Math.pow((y2-y),2)),0.5);
    }
    public Punto() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
