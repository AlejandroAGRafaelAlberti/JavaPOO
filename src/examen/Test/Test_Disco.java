package examen.Test;

import examen.Disco;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test_Disco {
    Disco midisco;
    @BeforeEach
    void arrange(){
        midisco = new Disco(9);
        midisco = new Disco(9,24);
    }
    @Test
    void test_disco(){
        assertEquals(9,midisco.getNumero_id());
        assertEquals(24,midisco.getPrecio());
    }
}
