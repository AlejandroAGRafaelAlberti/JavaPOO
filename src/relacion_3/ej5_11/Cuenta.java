package relacion_3.ej5_11;

public class Cuenta {
    private final int numero_cliente;
    private int saldo = 0;

    public Cuenta(Cliente cliente) {
        numero_cliente = cliente.getNumero_cliente();
    }
    public Cuenta(Cliente cliente, int saldo){
        numero_cliente = cliente.getNumero_cliente();
        this.saldo = saldo;
    }
    public void depositar(int dinero){
        saldo += dinero;
    }
    public void retirar(int dinero){
        saldo -= dinero;
    }

    public int getNumero_cliente() {
        return numero_cliente;
    }

    public int getSaldo() {
        return saldo;
    }
}
