package relacion_1.ej5_1;

import java.util.Scanner;

public class cinco_uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce las horas de trabajo: ");
        while(!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Debe ser un número");
        }
        float horas = input.nextFloat();
        input.nextLine();

        System.out.print("Introduce el coste por hora: ");
        while(!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Debe ser un número");
        }
        float coste = input.nextFloat();
        input.nextLine();

        System.out.println("El importe total es: " + coste * horas);
    }
}
