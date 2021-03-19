package relacion_4.ej5_20;

import java.util.ArrayList;
import java.util.Optional;

public class ONG {
    private final ArrayList<Voluntario> voluntarios = new ArrayList<>(1);
    private boolean next_oldest = true;
    public void anadir_vol(Voluntario voluntario){
        voluntarios.add(voluntario);
    }
    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }
    public Optional<Voluntario> siguiente(){
        if (voluntarios.equals(new ArrayList<Voluntario>(1))) return Optional.empty();

        if (next_oldest){
            next_oldest = false;
            int ram_edad = 0;
            Voluntario ram_voluntario = new Voluntario("Nombre_error",0);
            for (Voluntario voluntario : voluntarios){
                if (voluntario.getEdad()>ram_edad){
                    ram_edad = voluntario.getEdad();
                    ram_voluntario = voluntario;
                }
            }
            for (Voluntario voluntario : voluntarios){
                if (voluntario.equals(ram_voluntario)) voluntarios.remove(voluntario);
            }
            return Optional.of(ram_voluntario);
        }
        next_oldest = true;
        int ram_edad = 0;
        Voluntario ram_voluntario = new Voluntario("Nombre_error",999); // dudo que alguien tenga mas de 999 años
        for (Voluntario voluntario : voluntarios){
            if (voluntario.getEdad()<ram_edad){
                ram_edad = voluntario.getEdad();
                ram_voluntario = voluntario;
            }
        }
        for (Voluntario voluntario : voluntarios){
            if (voluntario.equals(ram_voluntario)) voluntarios.remove(voluntario);
        }
        return Optional.of(ram_voluntario);
    }
}

