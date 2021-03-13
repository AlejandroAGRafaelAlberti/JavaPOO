package relacion_4.ej5_16;

public class Pistola extends ArmaFuego{
    int calibre = 9;
    public Pistola(float potencia) {
        super(potencia);
    }

    public Pistola(float potencia, int calibre) {
        super(potencia);
        this.calibre = calibre;
    }

    public void cargar(int calibre) {
        if (this.calibre==calibre) super.cargar();
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
        return "Pistola{" +
                "potencia=" + potencia +
                ", cargada=" + cargada +
                ", calibre=" + calibre +
                '}';
    }
}
