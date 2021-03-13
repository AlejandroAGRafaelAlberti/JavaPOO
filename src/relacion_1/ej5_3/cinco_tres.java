package relacion_1.ej5_3;

import java.util.Scanner;

public class cinco_tres {
    public static void main(String[] args) {
        float nota;
        System.out.print("Puntuación\tCalificación\n>= 0.9\t\tSobresaliente\n>= 0.8\t\tNotable\n>= 0.7\t\tBien\n>= 0.6\t\tSuficiente\n<  0.6\t\tInsuficiente\n");
        System.out.print("Introduce la calificación: ");
        while(true){
            Scanner input = new Scanner(System.in);
            if(!input.hasNextFloat()){
                input.nextLine();
                System.out.println("Debe ser un número");
                continue;
            }
            nota = input.nextFloat();
            if(nota<0 | nota>1){
                input.nextLine();
                System.out.println("Debe ser un número enter 0 y 1");
                continue;
            }
            break;
        }
        while (true){
            if(nota<0.6){
                System.out.println("Insuficiente");
                break;
            }
            if(nota<0.7){
                System.out.println("Suficiente");
                break;
            }
            if(nota<0.8){
                System.out.println("Bien");
                break;
            }
            if(nota<0.9){
                System.out.println("Notable");
                break;
            }
            System.out.println("Sobresaliente");
            break;
            }
        //no se como es el elif, asi que me ha quedado esto un poco raro
        // no me funciona del to-do bien
    }
}