package relacion_4.ej5_16;

public class Escopeta extends ArmaFuego{
    boolean recortada = false;
    float aumentorecortada = 10;
    public Escopeta(float potencia) {
        super(potencia);
    }

    public Escopeta(float potencia, boolean recortada) {
        super(potencia);
        this.recortada = recortada;
    }

    public Escopeta(float potencia, boolean recortada, float aumentorecortada) {
        super(potencia);
        this.recortada = recortada;
        this.aumentorecortada = aumentorecortada;
    }

    public boolean isRecortada() {
        return recortada;
    }

    public void setRecortada(boolean recortada) {
        this.recortada = recortada;
    }

    public float getAumentorecortada() {
        return aumentorecortada;
    }

    public void setAumentorecortada(float aumentorecortada) {
        this.aumentorecortada = aumentorecortada;
    }

    @Override
    public float disparar(){
        if(cargada){
            cargada = false;
            return potencia*3+aumentorecortada;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Escopeta{" +
                "potencia=" + potencia +
                ", cargada=" + cargada +
                ", recortada=" + recortada +
                ", aumentorecortada=" + aumentorecortada +
                '}';
    }
}
