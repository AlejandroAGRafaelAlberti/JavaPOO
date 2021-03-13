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
    public class Persona{
        private final String dni;
        private final Vector<Cuenta> v_cuentas;

        @Override
        public String toString() {
            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", v_cuentas=" + v_cuentas +
                    '}';
        }

        public void anyadir_cuenta(Cuenta cuenta){
            if (v_cuentas.size()<3) v_cuentas.add(cuenta);
        }

        public boolean es_morosa(){
            for (Cuenta v_cuenta : v_cuentas) {
                if (v_cuenta.comprobar_Saldo() < 0)
                    return true;
            }
            return false;
        }

        public String getDni() {
            return dni;
        }

        public Vector<Cuenta> getV_cuentas() {
            return v_cuentas;
        }

        public Persona(String dni) {
            this.dni = dni;
            v_cuentas = new Vector<Cuenta>();
        }
        public Persona(String dni,Cuenta cuenta) {
            this.dni = dni;
            v_cuentas = new Vector<Cuenta>();
            v_cuentas.add(cuenta);
        }
        public Persona(String dni,Cuenta cuenta1,Cuenta cuenta2) {
            this.dni = dni;
            v_cuentas = new Vector<Cuenta>();
            v_cuentas.add(cuenta1);
            v_cuentas.add(cuenta2);
        }
        public Persona(String dni,Cuenta cuenta1,Cuenta cuenta2,Cuenta cuenta3) {
            this.dni = dni;
            v_cuentas = new Vector<Cuenta>();
            v_cuentas.add(cuenta1);
            v_cuentas.add(cuenta2);
            v_cuentas.add(cuenta3);
        }

    }
