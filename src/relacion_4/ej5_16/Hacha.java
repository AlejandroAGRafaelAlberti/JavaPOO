package relacion_4.ej5_16;

public class Hacha extends ArmaBlanca{
    int filos=1;
    public Hacha(float potencia) {
        super(potencia);
    }

    public Hacha(float potencia, float reduccionSinAfilar) {
        super(potencia, reduccionSinAfilar);
    }

    public int getFilos() {
        return filos;
    }

    public void setFilos(int filos) {
        if(filos==1 | filos==2) this.filos = filos;
    }

    @Override
    public float atacar() {
        return super.atacar()*filos;
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "potencia=" + potencia +
                ", afilada=" + afilada +
                ", reduccionSinAfilar=" + reduccionSinAfilar +
                ", filos=" + filos +
                '}';
    }
}
