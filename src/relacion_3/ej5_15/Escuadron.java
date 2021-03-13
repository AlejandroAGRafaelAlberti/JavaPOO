package relacion_3.ej5_15;

import java.util.ArrayList;
import java.util.Arrays;

public class Escuadron {
    private final ArrayList<Soldado> soldados = new ArrayList<Soldado>(10);

    public boolean escuadrones_iguales_potencia(Escuadron escuadron_ex){
        return escuadron_ex.potencia_fuego() == this.potencia_fuego();
    }

    public Escuadron(Soldado soldado) {
        soldados.add(soldado);
    }
    public void anyadirSoldado(Soldado soldado){
        soldados.add(soldado);
    }
    public void anyadirSoldados(Soldado[] soldados_ex){
        soldados.addAll(Arrays.asList(soldados_ex));
    }
    public float potencia_fuego(){
        float result = 0;
        for (Soldado soldado : soldados){
            result += soldado.getP_fuego();
        }
        return result;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    @Override
    public String toString() {
        return "Escuadron{" +
                "soldados=" + soldados +
                '}';
    }
}
