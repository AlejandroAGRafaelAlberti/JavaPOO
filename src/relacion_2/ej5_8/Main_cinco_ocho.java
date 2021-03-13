package relacion_2.ej5_8;

import java.util.Scanner;

public class Main_cinco_ocho {
    public static void main(String[] args) {
        Tiempo myTempo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        while(!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int hora = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Introduce los minutos (en blanco para no especificar): ");
        int minuto = 0;
        while(true) {
            String cadena = entrada.nextLine();
            if(cadena.equals("")) {
                myTempo = new Tiempo(hora);
                break;
            }
            else {
                try {
                    minuto = Integer.parseInt(cadena);
                    System.out.print("Introduce los segundos (en blanco para no especificar): ");
                    int segundo = 0;
                    while(true) {
                        cadena = entrada.nextLine();
                        if(cadena.equals("")) {
                            myTempo = new Tiempo(hora, minuto);
                            break;
                        }
                        else {
                            try {
                                segundo = Integer.parseInt(cadena);
                                myTempo = new Tiempo(hora, minuto, segundo);
                                break;
                            } catch (Exception e) {
                                System.out.println("Debe ser un número");
                            }
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Debe ser un número");
                }
            }
        }
        System.out.println("La hora introducida es: "+myTempo.toString());
    }
}
