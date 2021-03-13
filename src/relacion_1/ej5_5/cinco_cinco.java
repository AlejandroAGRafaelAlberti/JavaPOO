package relacion_1.ej5_5;

public class cinco_cinco {
    public static void main(String[] args) {
        for(int i=2; i<101; i+=2){
            if (i == 100){
                System.out.println(i+".");
                System.exit(0);
            }
            System.out.print(i+", ");
        }
    }
}
