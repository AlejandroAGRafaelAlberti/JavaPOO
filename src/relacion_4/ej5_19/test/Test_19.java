package relacion_4.ej5_19.test;
import org.junit.jupiter.api.*;
import relacion_4.ej5_19.Cliente;
import relacion_4.ej5_19.Grupo;
import relacion_4.ej5_19.Persona;
import relacion_4.ej5_19.Proveedor;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Test_19 {
    Cliente miCliente;
    Proveedor miProveedor;
    Grupo miGrupo;

    @BeforeEach
    void arrange(){
        miCliente = new Cliente("Pepe","González",18,45);
        miProveedor = new Proveedor("Pepa","007");
        miGrupo = new Grupo(miProveedor);
    }
    @Test
    void test_Personas(){
        assertEquals(45, miCliente.getId());
        miCliente.setNombre("Ignacio");
        assertEquals("Ignacio",miCliente.getNombre());
        miCliente.setApellidos("Ignacio");
        assertEquals("Ignacio",miCliente.getApellidos());
        miCliente.setEdad(15);
        assertEquals(15,miCliente.getEdad());
        miCliente = new Cliente("Ignacio","Ignacio",8);
        miCliente = new Cliente("Ignacio",8);
        assertEquals("Cliente{id=8, nombre='Ignacio', apellidos='null', edad=0}",miCliente.toString());
        miProveedor.setCodigo("009");
        assertEquals("009",miProveedor.getCodigo());
        miProveedor = new Proveedor("Ignacio","Ignacio","Ignacio");
        miProveedor = new Proveedor("Ignacio","Ignacio",9,"Ignacio");
        assertEquals("Proveedor{nombre='Ignacio', apellidos='Ignacio', edad=9, codigo='Ignacio'}",miProveedor.toString());
    }
    @Test
    void test_Grupos(){
        miGrupo.registra(miCliente);
        ArrayList<Persona> expected = new ArrayList<>(1);
        expected.add(miProveedor);
        expected.add(miCliente);
        assertEquals(expected,miGrupo.getComponentes());
        miGrupo.borra(miCliente);
        expected.remove(miCliente);
        assertEquals(expected,miGrupo.getComponentes());
        assertEquals("Grupo{componentes=[Proveedor{nombre='Pepa', apellidos='null', edad=0, codigo='007'}]}",miGrupo.toString());
        Proveedor miProveedor2 = new Proveedor("xd","sip");
        Proveedor miProveedor3 = new Proveedor("wow","sip");
        assert miGrupo.registra(miProveedor2);
        assert !(miGrupo.registra(miProveedor3));
        assert miGrupo.borra(miProveedor3);
        assert !(miGrupo.borra(miProveedor2));
        //No se llama .getclass de example, no se como arreglarlo
    }
}
