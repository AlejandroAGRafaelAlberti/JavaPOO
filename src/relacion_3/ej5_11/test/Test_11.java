package relacion_3.ej5_11.test;

import org.junit.jupiter.api.*;
import relacion_3.ej5_11.Cliente;
import relacion_3.ej5_11.Cuenta;
import static org.junit.jupiter.api.Assertions.*;

class Test_11 {
    Cuenta miCuenta;
    Cliente miCliente;
    @BeforeEach
    void Arrange(){
        miCliente = new Cliente(1234,"72344755A","Nombre");
        miCuenta = new Cuenta(miCliente);
    }
    @AfterEach
    void Dissasemble(){
    }
    /**
     * TEST DE ClIENTE
     **/
    @Test
    void Test_Cliente_constructor_1arg(){
        miCliente= new Cliente(1234);
        assert miCliente.getNombre().equals("Unknown");
        assert miCliente.getDni().equals("Unknown");
        assert miCliente.getNumero_cliente()==1234;
    }
    @Test
    void Test_Cliente_constructor_2arg(){
        miCliente= new Cliente(1234,"72344755A");
        assert miCliente.getNombre().equals("Unknown");
        assert miCliente.getDni().equals("72344755A");
        assert miCliente.getNumero_cliente()==1234;
    }
    @Test
    void Test_Cliente_constructor_2arg_Wrong(){
        miCliente= new Cliente(1234,"72344755H");
        assert miCliente.getNombre().equals("Unknown");
        assert miCliente.getDni().equals("Unknown");
        assert miCliente.getNumero_cliente()==1234;
    }
    @Test
    void Test_Cliente_constructor_3ar(){
        assert miCliente.getNombre().equals("Nombre");
        assert miCliente.getDni().equals("72344755A");
        assert miCliente.getNumero_cliente()==1234;
    }
    @Test
    void Test_Cliente_constructor_3arg_Wrong(){
        miCliente= new Cliente(1234,"72344755H","Nombre");
        assert miCliente.getNombre().equals("Nombre");
        assert miCliente.getDni().equals("Unknown");
        assert miCliente.getNumero_cliente()==1234;
    }
    @Test
    void Test_Cliente_checker(){
        assert miCliente.check_dni("72344755A");
        assert !(miCliente.check_dni("72344755H"));
        assert !(miCliente.check_dni("723455H"));
        assert !(miCliente.check_dni("72344755"));
        assert !(miCliente.check_dni(""));
        assert !(miCliente.check_dni("Unknown"));
    }
    @Test
    void Test_Cliente_toString(){
        assert miCliente.toString().equals("Cliente{nombre='Nombre', dni='72344755A', numero_cliente=1234}");
    }
    @Test
    void Test_Cliente_Set_Nombre(){
        miCliente.setNombre("PEPE");
        assertEquals("PEPE",miCliente.getNombre());
    }
    @Test
    void Test_Cliente_Set_Dni(){
        miCliente= new Cliente(1234,"72344755H","Nombre");
        miCliente.setDni("no_valido");
        assertEquals("Unknown",miCliente.getDni());
        miCliente.setDni("72344755A");
        assertEquals("72344755A",miCliente.getDni());
        miCliente.setDni("26097370Y");
        assertEquals("72344755A",miCliente.getDni());
    }
    /**
     * TEST DE CUENTA
     **/
    @Test
    void Test_Cuenta_constructor_1args(){
        assertEquals(1234,miCuenta.getNumero_cliente());
        assertEquals(0,miCuenta.getSaldo());
    }
    @Test
    void Test_Cuenta_constructor_2args(){
        miCuenta = new Cuenta(miCliente,800);
        assertEquals(800,miCuenta.getSaldo());
    }
    @Test
    void Test_Cuenta_saldo(){
        miCuenta.depositar(800);
        assertEquals(800,miCuenta.getSaldo());
        miCuenta.retirar(900);
        assertEquals(-100,miCuenta.getSaldo());
    }

}