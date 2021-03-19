package examen.Test;

import examen.Cliente_registrado;
import examen.Disco;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test_cliente_registrado {
    Cliente_registrado miCliente;
    @BeforeEach
    void arrange(){
        miCliente = new Cliente_registrado("ho","la","49986930H","123123123");
    }
    @Test
    void test_Cliente(){
        assertEquals("ho",miCliente.getNombre());
        assertEquals("la",miCliente.getApellidos());
        assertEquals("49986930H",miCliente.getDni_nif());
        assertEquals("123123123",miCliente.getTelefono());
    }
    @Test
    void test_methots(){
        assert miCliente.compruebaDNI();
        miCliente = new Cliente_registrado("ho","la","49980H","123123123");
        assert !(miCliente.compruebaDNI());
        miCliente.pagar(600);
        assert miCliente.esvip();
        miCliente.actualizacionDescuento();
        assertEquals(15,miCliente.getDescuento());
        Disco midisco = new Disco(9,24);
        assertEquals(3.6,miCliente.aplicaDescuento(midisco));
    }
}
