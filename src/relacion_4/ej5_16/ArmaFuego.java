package relacion_4.ej5_16;

public class ArmaFuego extends Arma{
    boolean cargada = false;
    public ArmaFuego(float potencia) {
        super(potencia);
    }
    public void cargar(){
        cargada = true;
    }
    public float disparar(){
        if(cargada){
            cargada = false;
            return potencia*3;
        }
        return 0;
    }
    public boolean isCargada() {
        return cargada;
    }

    @Override
    public String toString() {
        return "ArmaFuego{" +
                "potencia=" + potencia +
                ", cargada=" + cargada +
                '}';
    }
}
