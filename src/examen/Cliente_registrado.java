package examen;

public class Cliente_registrado implements Cliente{
    private final String nombre;
    private final String apellidos;
    private final String dni_nif;
    private final String telefono;
    private float saldo_gastado = 0;
    private int descuento = 2;
    private final static String[] LETRASDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
            "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public boolean compruebaDNI(){
        try {
            // Último caracter (python): DNI[-1]
            String letra = dni_nif.substring(dni_nif.length() - 1);
            String numeroString = dni_nif.substring(0, dni_nif.length() - 1);
            int numero = Integer.parseInt(numeroString);
            int indiceLetra = numero % 23;
            if(!letra.toUpperCase().equals(Cliente_registrado.LETRASDNI[indiceLetra]))
                throw new Exception("Letra incorrecta");
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean esvip(){
        return saldo_gastado >= 100;
    }
    public void actualizacionDescuento(){
        if (saldo_gastado >= 100){
            descuento = 5;
            int ram_saldo = (int) (saldo_gastado-100);
            while (ram_saldo>=50){
                ram_saldo-=50;
                descuento +=1 ;
            }
        }
    }

    @Override
    public float aplicaDescuento(Producto producto) {
        float sale = producto.obtener_descuento();
        return (producto.getPrecio()-sale)*descuento/100;
    }

    @Override
    public void pagar(float cantidad) {
        saldo_gastado += cantidad;
    }


    public Cliente_registrado(String nombre, String apellidos, String dni_nif, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni_nif = dni_nif;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni_nif() {
        return dni_nif;
    }

    public String getTelefono() {
        return telefono;
    }

    public float getSaldo_gastado() {
        return saldo_gastado;
    }

    public int getDescuento() {
        return descuento;
    }
}
