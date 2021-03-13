package relacion_3.ej5_14;

import relacion_3.ej5_13.Circulo;
import relacion_3.ej5_13.Punto;

public class Bola {
    private Circulo circulo;

    public boolean colision(Bola bola_extranjera){
        Punto centro_e = bola_extranjera.getCirculo().getCentro();
        Punto centro = circulo.getCentro();
        double distancia = centro_e.distancia(centro);
        int suma_r = bola_extranjera.getCirculo().getRadio() + circulo.getRadio();
        return (distancia < suma_r);
    }
    public Bola(Circulo circulo) {
        this.circulo = circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }


    public Circulo getCirculo() {
        return circulo;
    }

    @Override
    public String toString() {
        return "Bola{" +
                "circulo=" + circulo +
                '}';
    }
}
