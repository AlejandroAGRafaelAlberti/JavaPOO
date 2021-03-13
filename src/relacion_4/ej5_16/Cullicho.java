package relacion_4.ej5_16;

public class Cullicho extends ArmaBlanca{
    public Cullicho(float potencia) {
        super(potencia);
    }

    public Cullicho(float potencia, float reduccionSinAfilar) {
        super(potencia, reduccionSinAfilar);
    }

    @Override
    public String toString() {
        return "Cullicho{" +
                "potencia=" + potencia +
                ", afilada=" + afilada +
                ", reduccionSinAfilar=" + reduccionSinAfilar +
                '}';
    }
}
