package relacion_2.ej5_9;

import java.util.Vector;

/*
Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo

disponible. Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.
Crear además una clase Persona, que se caracteriza por un DNI y un vector de cuentas bancarias. La Persona puede
tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 que es el
máximo). También debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con
saldo negativo).

*/
    public class Cuenta{
        private final int num_cuenta;
        private int saldo;

        public int comprobar_Saldo() {
            return saldo;
        }

        public int getNum_cuenta() {
            return num_cuenta;
        }

        public Cuenta(int num_cuenta, int saldo) {
            this.num_cuenta = num_cuenta;
            this.saldo = saldo;
        }

        @Override
        public String toString() {
            return "Cuenta{" +
                    "num_cuenta=" + num_cuenta +
                    ", saldo=" + saldo +
                    '}';
        }

        public void recibir_abono(int abono) {
            saldo += abono;
        }
        public void realizar_pago(int pago) {
            saldo -= pago;
        }
    }


