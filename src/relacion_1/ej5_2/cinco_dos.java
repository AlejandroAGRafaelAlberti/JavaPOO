package relacion_1.ej5_2;

import java.util.Scanner;

public class cinco_dos {
    public static void main(String[] args) {
        float precio;
        float precio_no_iva;
        float iva;
        float iva_percentage = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el precio final: ");
        while(!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Debe ser un número");
        }
        precio = input.nextFloat();
        input.nextLine();

        precio_no_iva = precio / (iva_percentage/100 + 1);
        iva = precio - precio_no_iva;

        System.out.println("El precio sin iva: " + precio_no_iva);
        System.out.println("El iva aplicado: " + iva);
    }
}