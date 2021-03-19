package relacion_4.ej5_18.test;
import org.junit.jupiter.api.*;
import relacion_4.ej5_18.Flauta;
import relacion_4.ej5_18.Guitarra;
import relacion_4.ej5_18.Nota;

import static org.junit.jupiter.api.Assertions.*;
public class Test_18 {
    Guitarra miguitarra;
    Flauta miFlauta;
    @BeforeEach
    void arrange(){
        miguitarra = new Guitarra(5);
        miFlauta = new Flauta(5);
    }
    @Test
    void test_Instrumento(){
        miFlauta.tocarNota();
        assert (miFlauta.tocarNota(1) == Nota.Do);
    }
    @Test
    void test_guitarra(){
        miguitarra.setCuerdas(7);
        assertEquals(7,miguitarra.getCuerdas());
    }
    @Test
    void test_Flauta(){
        miFlauta.setOrificios(7);
        assertEquals(7,miFlauta.getOrificios());
    }
}
