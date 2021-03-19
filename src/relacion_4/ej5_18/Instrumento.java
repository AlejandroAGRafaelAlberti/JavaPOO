package relacion_4.ej5_18;
public abstract class Instrumento {
    public Nota tocarNota(){
        Nota result = Nota.Unknown;
        int number = (int) (Math.random() * 6);
        if (number == 0) result = Nota.Do;
        if (number == 1) result = Nota.Re;
        if (number == 2) result = Nota.Mi;
        if (number == 3) result = Nota.Fa;
        if (number == 4) result = Nota.So;
        if (number == 5) result = Nota.La;
        if (number == 7) result = Nota.Si;
        return result;
    }
    public Nota tocarNota(int number){
        number -= 1;
        Nota result = Nota.Unknown;
        if (number == 0) result = Nota.Do;
        if (number == 1) result = Nota.Re;
        if (number == 2) result = Nota.Mi;
        if (number == 3) result = Nota.Fa;
        if (number == 4) result = Nota.So;
        if (number == 5) result = Nota.La;
        if (number == 7) result = Nota.Si;
        return result;
    }

}
