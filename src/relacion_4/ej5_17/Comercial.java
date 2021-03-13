package relacion_4.ej5_17;

public class Comercial extends Empleado{
    float ventas = 0;
    float comision = 20; //%
    public Comercial(String nombre, float sueldo) {
        super(nombre, sueldo);
    }

    public Comercial(String nombre, float sueldo, float comision) {
        super(nombre, sueldo);
        if (comision <= 100 & comision >=0) this.comision = comision;
    }

    public void vende(float cantidad){
        if (cantidad>0) ventas += cantidad;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getVentas() {
        return ventas;
    }

    @Override
    public float cobrar() {
        float extra = 0;
        if (ventas !=0 & comision !=0)extra = ventas * comision /100;
        ventas = 0;
        return super.cobrar() + extra;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "ventas=" + ventas +
                ", comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
