package relacion_4.ej5_16;

public class Rifle extends ArmaFuego{
    float alcance=100;
    public Rifle(float potencia) {
        super(potencia);
    }

    public Rifle(float potencia, float alcance) {
        super(potencia);
        this.alcance = alcance;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "Rifle{" +
                "potencia=" + potencia +
                ", cargada=" + cargada +
                ", alcance=" + alcance +
                '}';
    }
    public float disparar(float distancia) {
        if(alcance>=distancia) return super.disparar();
        cargada=false;
        return 0;
    }
}
