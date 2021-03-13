package relacion_2.ej5_9;
/*
En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una
sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la
primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda. Imprimir por pantalla si la persona
es morosa.
Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y
mostrar por pantalla el estado de la persona.
 */
public class Main_cinco_nueve {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(567,0);
        Cuenta cuenta2 = new Cuenta(568,700);
        Persona Alejandro = new Persona("Nunca sabras mi dni >:D",cuenta1,cuenta2);
        System.out.println(Alejandro.toString());
        cuenta1.recibir_abono(1100);
        cuenta2.realizar_pago(750);
        System.out.println(Alejandro.toString());
        // soy moroso?
         if (Alejandro.es_morosa())  System.out.println("Soy moroso ;_;");
         else System.out.println("No soy moroso :D");
         cuenta1.realizar_pago(50);
         cuenta2.recibir_abono(50);
        // soy moroso?
        if (Alejandro.es_morosa())  System.out.println("Soy moroso ;_;");
        else System.out.println("No soy moroso :D");
    }
}
