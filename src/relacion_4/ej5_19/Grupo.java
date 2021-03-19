package relacion_4.ej5_19;

import java.util.ArrayList;

public class Grupo {
    private final ArrayList<Persona> componentes = new ArrayList<>(1);
    private final ArrayList<Proveedor> proveedores = new ArrayList<>(1);
    private final Proveedor example = new Proveedor("xd","xd");

    public boolean registra(Persona persona){
        if (persona.getClass()==example.getClass()) {
            for (Proveedor proveedor:proveedores){
                if (((Proveedor) persona).getCodigo().equals(proveedor.getCodigo())) return false;
            }
            proveedores.add((Proveedor) persona);
            componentes.add(persona);
            return true;
        }

        if (componentes.contains(persona)) return false;
        componentes.add(persona);
        return true;
    }
    public boolean borra(Persona persona){
        if (persona.getClass()==example.getClass()) {
            for (Proveedor proveedor:proveedores){
                if (((Proveedor) persona).getCodigo().equals(proveedor.getCodigo())){
                    proveedores.add((Proveedor) persona);
                    componentes.add(persona);
                    return true;
                }
            }
            return false;
        }

        if (!(componentes.contains(persona))) return false;
        componentes.remove(persona);
        return true;
    }


    public Grupo(Persona fundador) {
        componentes.add(fundador);
        if (fundador.getClass()==example.getClass()){
            proveedores.add((Proveedor)fundador);
        }
    }

    public ArrayList<Persona> getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "componentes=" + componentes +
                '}';
    }
}
