package relacion_3.ej5_13.test;

import org.junit.jupiter.api.*;
import relacion_3.ej5_13.Circulo;
import relacion_3.ej5_13.Punto;

import static org.junit.jupiter.api.Assertions.*;

public class Test_13 {
    Punto miPunto;
    Circulo miCirculo;
    @BeforeEach
    void Arrange(){
        miPunto = new Punto(2,-2);
        miCirculo = new Circulo(miPunto,5);
    }
    /**
     * TEST PUNTOS
     */
    @Test
    void Test_Puntos(){
        assertEquals(2,miPunto.getX());
        assertEquals(-2,miPunto.getY());
        miPunto = new Punto();
        assertEquals(0,miPunto.getX());
        assertEquals(0,miPunto.getY());
        miPunto.setX(6);
        miPunto.setY(9);
        assertEquals(6,miPunto.getX());
        assertEquals(9,miPunto.getY());
        assertEquals("Punto{x=6, y=9}",miPunto.toString());
    }
    @Test
    void Test_puntos_distancia(){
        Punto miPunto2 = new Punto(2,-6);
        assertEquals(0,miPunto.distancia(miPunto));
        assertEquals(4,miPunto.distancia(miPunto2));
    }
    /**
     *  TEST Circulos
     */
    @Test
    void Test_Circulos(){
        assertEquals(miPunto,miCirculo.getCentro());
        assertEquals(5,miCirculo.getRadio());
        miCirculo = new Circulo(miPunto);
        assertEquals(1,miCirculo.getRadio());
        Punto miPunto2 = new Punto(2,3);
        miCirculo.setCentro(miPunto2);
        miCirculo.setRadio(9);
        assertEquals(miPunto2,miCirculo.getCentro());
        assertEquals(9,miCirculo.getRadio());
        assertEquals("Circulo{radio=9, centro=Punto{x=2, y=3}}",miCirculo.toString());
    }
}