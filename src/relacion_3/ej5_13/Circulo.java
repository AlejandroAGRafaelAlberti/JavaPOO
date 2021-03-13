package relacion_3.ej5_13;

public class Circulo {
    private int radio = 1;
    private Punto centro;

    public Circulo(Punto centro) {
        this.centro = centro;
    }

    public Circulo(Punto centro, int radio) {
        this.radio = radio;
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", centro=" + centro +
                '}';
    }
}
