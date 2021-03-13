package relacion_4.ej5_17;

public class Guardia extends Empleado{
    int noches=0;
    float extranoche = 50;
    public Guardia(String nombre, float sueldo) {
        super(nombre, sueldo);
    }

    public Guardia(String nombre, float sueldo, float extranoche) {
        super(nombre, sueldo);
        if (extranoche>0)this.extranoche = extranoche;
    }

    public void trabajar(){
        noches += 1;
    }
    public int getNoches() {
        return noches;
    }

    public float getExtranoche() {
        return extranoche;
    }

    public void setExtranoche(float extranoche) {
        this.extranoche = extranoche;
    }

    @Override
    public float cobrar() {
        float extra = noches*extranoche;
        noches = 0;
        return super.cobrar()+extra;
    }

    @Override
    public String toString() {
        return "Guardia{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", noches=" + noches +
                ", extranoche=" + extranoche +
                '}';
    }
}
