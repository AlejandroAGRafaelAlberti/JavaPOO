package relacion_4.ej5_17.test;
import org.junit.jupiter.api.*;
import relacion_4.ej5_17.Comercial;
import relacion_4.ej5_17.Empleado;
import relacion_4.ej5_17.Guardia;

import static org.junit.jupiter.api.Assertions.*;
public class Test_17 {
    Empleado miEmpleado;
    Guardia miGuardia;
    Comercial miComercial;
    @BeforeEach
    void arrange(){
        miGuardia= new Guardia("Pepe",500);
        miComercial = new Comercial("Pepe",500);
        miEmpleado = new Empleado("Pepe",500);
    }
    @Test
    void test_empleado(){
        assertEquals(500,miEmpleado.cobrar());
        assertEquals("Pepe",miEmpleado.getNombre());
        miEmpleado.setSueldo(1000);
        assertEquals(1000,miEmpleado.getSueldo());
        assertEquals("Empleado{nombre='Pepe', sueldo=1000.0}",miEmpleado.toString());
    }
    @Test
    void test_guardia(){
        miGuardia= new Guardia("Pepe",500,60);
        miGuardia.setExtranoche(30);
        assertEquals(30,miGuardia.getExtranoche());
        miGuardia.trabajar();
        assertEquals(1,miGuardia.getNoches());
        miGuardia.trabajar();
        assertEquals(560,miGuardia.cobrar());
        assertEquals("Guardia{nombre='Pepe', sueldo=500.0, noches=0, extranoche=30.0}",miGuardia.toString());
    }
    @Test
    void test_comercial(){
        miComercial = new Comercial("Pepe",500,30);
        miComercial.setComision(50);
        assertEquals(50,miComercial.getComision());
        miComercial.vende(800);
        assertEquals(800,miComercial.getVentas());
        assertEquals(900,miComercial.cobrar());
        assertEquals("Comercial{ventas=0.0, comision=50.0, nombre='Pepe', sueldo=500.0}",miComercial.toString());
    }

}