package relacion_1.ej5_4;

import java.util.Scanner;

public class cinco_cuatro {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        float resultado = 0;
        int operacion; // 1=+, 2=-, 3=/, 4=*.
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        while(!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Debe ser un número");
        }
        numero1 = input.nextFloat();
        input.nextLine();
        System.out.print("Introduce el segundo número: ");
        while(!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Debe ser un número");
        }
        numero2 = input.nextFloat();
        input.nextLine();

        System.out.print("Introduce la operación (1=+, 2=-, 3=/, 4=*): ");
        while(true){
            Scanner input_oper = new Scanner(System.in);
            while(!input_oper.hasNextInt()) {
                input_oper.nextLine();
                System.out.println("Debe ser un número entero");
            }
            operacion = input_oper.nextInt();
            if (!(operacion<1 | operacion>4))break;
            else System.out.println("Debe ser 1, 2, 3 o 4");
        }
        if (operacion == 1){
            resultado = numero1 + numero2;
        }
        if (operacion == 2){
            resultado = numero1 - numero2;
        }
        if (operacion == 3){
            if (!(numero2 == 0)){
                resultado = numero1 / numero2;
            }
            else {
                System.out.println("no puedes dividir entre 0");
                System.exit(0);
            }
        }
        if (operacion == 4){
            resultado = numero1 * numero2;
        }
        System.out.println("El resultado es:"+ resultado);
    }
}
