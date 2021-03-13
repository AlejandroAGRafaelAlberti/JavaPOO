package relacion_3.ej5_11;

public class Cliente {
    private String nombre = "Unknown";
    private String dni = "Unknown";
    private final int numero_cliente;

    public boolean check_dni(String dni){
        char[] dni_chars = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        String ram_str = "";
        if(dni.length() != 9 || !Character.isLetter(dni.charAt(8))) {
            return false;
        }
        for(int i = 0; i<dni.length()-1; i++){
            if (!Character.isDigit(dni.charAt(i))) return false;
            ram_str += dni.charAt(i);
        }
        int fin_dni_int = Integer.parseInt(ram_str);
        int resto = fin_dni_int % 23;
        char letra = dni.charAt(8);
        letra = (Character.toUpperCase(letra));
        return dni_chars[resto] == letra;
    }

    public Cliente(int numero_cliente,String dni,String nombre) {
            this.nombre = nombre;
            if (check_dni(dni)) this.dni = dni;
            this.numero_cliente = numero_cliente;
    }

    public Cliente(int numero_cliente,String dni) {
            if (check_dni(dni)) this.dni = dni;
            this.numero_cliente = numero_cliente;
    }

    public Cliente(int numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni){
        if(!check_dni(this.dni)){
            if (check_dni(dni))
            this.dni = dni;
        }
        //solo te deja cambiar el dni si el que esta asignado esta mal
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getNumero_cliente() {
        return numero_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", numero_cliente=" + numero_cliente +
                '}';
    }
}
