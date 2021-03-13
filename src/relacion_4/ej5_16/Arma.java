package relacion_4.ej5_16;

public class Arma {
    float potencia;
    public float atacar(){
        return potencia;
    }

    public Arma(float potencia) {
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "potencia=" + potencia +
                '}';
    }
}
