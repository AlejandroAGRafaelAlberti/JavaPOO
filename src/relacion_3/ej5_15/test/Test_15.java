package relacion_3.ej5_15.test;

import relacion_3.ej5_15.Escuadron;
import relacion_3.ej5_15.Soldado;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test_15 {
    Soldado miSoldado;
    Escuadron miEscuadron;
    @BeforeEach
    void arrange(){
        miSoldado = new Soldado(99,"PEPE","Infanteria");
        miEscuadron = new Escuadron(miSoldado);
    }

    /**
     * Test Soldado
     */
    @Test
    void Test_Soldado(){
        assertEquals("PEPE",miSoldado.getNombre());
        assertEquals("Infanteria",miSoldado.getTipo());
        assertEquals(99,miSoldado.getP_fuego());
        miSoldado = new Soldado(99,"PEPE");
        assertEquals("PEPE",miSoldado.getNombre());
        assertEquals("Unknown",miSoldado.getTipo());
        assertEquals(99,miSoldado.getP_fuego());
        miSoldado = new Soldado(99);
        assertEquals("Unknown",miSoldado.getNombre());
        assertEquals("Unknown",miSoldado.getTipo());
        assertEquals(99,miSoldado.getP_fuego());
        miSoldado.setNombre("PACO");
        miSoldado.setTipo("General");
        miSoldado.setP_fuego(9000);
        assertEquals("PACO",miSoldado.getNombre());
        assertEquals("General",miSoldado.getTipo());
        assertEquals(9000,miSoldado.getP_fuego());
    }
    @Test
    void Test_Soldado_toString(){
        assertEquals("Soldado{nombre='PEPE', tipo='Infanteria', p_fuego=99.0}",miSoldado.toString());
    }
    /**
     * Test Escuadron
     */
    @Test
    void Test_Escuadron(){
        Escuadron miEscuadron2 = new Escuadron(miSoldado);
        assertEquals(miEscuadron.getSoldados(),miEscuadron.getSoldados());
        assert miEscuadron.escuadrones_iguales_potencia(miEscuadron2);
        miEscuadron.anyadirSoldado(miSoldado);
        miEscuadron.anyadirSoldado(miSoldado);
        Soldado[] misSoldados = new Soldado[2];
        misSoldados[0] = miSoldado;
        misSoldados[1] = miSoldado;
        miEscuadron2.anyadirSoldados(misSoldados);
        assert  miEscuadron.escuadrones_iguales_potencia(miEscuadron2);
        assertEquals(99*3,miEscuadron.potencia_fuego());
    }
    @Test
    void Test_Escuadron_toString(){
        assertEquals("Escuadron{soldados=[Soldado{nombre='PEPE', tipo='Infanteria', p_fuego=99.0}]}",miEscuadron.toString());
    }
}
