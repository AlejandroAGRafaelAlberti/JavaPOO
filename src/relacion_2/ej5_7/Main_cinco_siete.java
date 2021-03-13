package relacion_2.ej5_7;


public class Main_cinco_siete {
    public static void main( String [] args ){
        Coche mycoche1;
        mycoche1 = new Coche("rojo","marca muy buena","modelo muy bueno","Matricula muy real",6,4);
        System.out.println(mycoche1.toString());
        Coche mycoche2;
        mycoche2 = new Coche("azul","marca buena","modelo bueno","Matricula no tan real",4,90);
        System.out.println(mycoche2.toString());
        mycoche1.setColor("verde");
        mycoche2.setColor("magenta");
        System.out.println(mycoche2.toString());
        System.out.println(mycoche1.toString());
    }
}
