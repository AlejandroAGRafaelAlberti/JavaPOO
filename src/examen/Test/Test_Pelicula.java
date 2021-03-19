package examen.Test;

import examen.Disco;
import examen.Pelicula;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test_Pelicula {
    Pelicula mipelicula;
    @BeforeEach
    void arrange(){
        mipelicula = new Pelicula(9);
        mipelicula = new Pelicula(9,24);
    }
    @Test
    void test_disco(){
        assertEquals(9,mipelicula.getNumero_id());
        assertEquals(24,mipelicula.getPrecio());
    }
}
