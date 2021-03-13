package relacion_3.ej5_14.test;

import org.junit.jupiter.api.*;
import relacion_3.ej5_13.Circulo;
import relacion_3.ej5_13.Punto;
import relacion_3.ej5_14.Bola;

import static org.junit.jupiter.api.Assertions.*;

public class Test_14 {
    Punto miPunto1;
    Circulo miCirculo1;
    Bola miBola1;
    @BeforeEach
    void Arrange() {
        miPunto1 = new Punto(0, 0);
        miCirculo1 = new Circulo(miPunto1, 2);
        miBola1 = new Bola(miCirculo1);
    }
    @Test
    void Test_to_String(){
        String s ="Bola{circulo=Circulo{radio=2, centro=Punto{x=0, y=0}}}";
        assertEquals(s,miBola1.toString());

    }
    @Test
    void Test_setter(){
        Circulo miCirculo2 = new Circulo(miPunto1,6);
        miBola1.setCirculo(miCirculo2);
        assertEquals(miCirculo2, miBola1.getCirculo());
    }
    @Test
    void Test_colision(){
        Punto miPunto2 = new Punto(2, 0);
        Circulo miCirculo2 = new Circulo(miPunto2, 2);
        Bola miBola2 = new Bola(miCirculo2);
        assert miBola1.colision(miBola2);
        miPunto2 = new Punto(9, 0);
        miCirculo2 = new Circulo(miPunto2, 2);
        miBola2 = new Bola(miCirculo2);
        assert !(miBola1.colision(miBola2));
    }
}