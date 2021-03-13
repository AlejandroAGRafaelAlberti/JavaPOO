package relacion_4.ej5_16;

public class ArmaBlanca extends Arma{
    boolean afilada = false;
    float reduccionSinAfilar = 10;
    public ArmaBlanca(float potencia) {
        super(potencia);
    }

    public ArmaBlanca(float potencia, float reduccionSinAfilar) {
        super(potencia);
        this.reduccionSinAfilar = reduccionSinAfilar;
    }

    public void afilar(){
        afilada = true;
    }

    @Override
    public float atacar() {
        if(afilada){
            afilada = false;
            return potencia;
        }
        if ((potencia - reduccionSinAfilar)>0) return potencia - reduccionSinAfilar;
        return 0;
    }

    public boolean isAfilada() {
        return afilada;
    }

    public float getReduccionSinAfilar() {
        return reduccionSinAfilar;
    }

    public void setReduccionSinAfilar(float reduccionSinAfilar) {
        this.reduccionSinAfilar = reduccionSinAfilar;
    }

    @Override
    public String toString() {
        return "ArmaBlanca{" +
                "potencia=" + potencia +
                ", afilada=" + afilada +
                ", reduccionSinAfilar=" + reduccionSinAfilar +
                '}';
    }
}
