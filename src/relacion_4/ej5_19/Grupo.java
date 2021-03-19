package relacion_4.ej5_19;

import java.util.ArrayList;

public class Grupo {
    private final ArrayList<Persona> componentes = new ArrayList<>(1);
    public boolean registra(Persona persona){
        if (componentes.contains(persona)) return false;
        componentes.add(persona);
        return true;
    }
    public boolean borra(Persona persona){
        if (!(componentes.contains(persona))) return false;
        componentes.remove(persona);
        return true;
    }

    public Grupo(Persona fundador) {
        componentes.add(fundador);
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
