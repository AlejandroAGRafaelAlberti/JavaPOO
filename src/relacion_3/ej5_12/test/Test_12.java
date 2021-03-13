package relacion_3.ej5_12.test;

import org.junit.jupiter.api.*;
import relacion_3.ej5_12.Autor;
import relacion_3.ej5_12.Libro;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Creo que me he pasado. Perdon.
 **/
class Test_12 {
    Libro miLibro;
    Autor miAutor;
    @BeforeEach
    void Arrange(){
        miAutor = new Autor("Dross","español");
        miLibro = new Libro("Luna de Pluton",miAutor,20,"Poesia");
    }
    @AfterEach
    void Dissasemble(){
    }
    /**
     * TEST LIBRO
     **/
    @Test
    void Test_Libro_constructor_2args(){
        miLibro = new Libro("Luna de Pluton",miAutor);
        assertEquals("Luna de Pluton",miLibro.getTitulo());
        assertEquals("Dross",miLibro.getN_autor());
    }
    @Test
    void Test_Libro_constructor_3args(){
        miLibro = new Libro("Luna de Pluton",miAutor,20);
        assertEquals(20,miLibro.getNumero_pag());
    }
    @Test
    void Test_Libro_constructor_4args(){
        assertEquals("Poesia",miLibro.getGenero());
    }
    @Test
    void Test_Libro_setters(){
        miLibro.setNumero_pag(80);
        miLibro.setGenero("Terror");
        assertEquals(80,miLibro.getNumero_pag());
        assertEquals("Terror",miLibro.getGenero());
    }
    @Test
    void Test_Libro_toString(){
        assertEquals("Libro{titulo='Luna de Pluton', n_autor='Dross', numero_pag=20, genero='Poesia'}",miLibro.toString());
    }
    /**
     * TEST AUTOR
     **/
    @Test
    void Test_Autor_constructor_1args(){
        miAutor = new Autor("Dross");
        assertEquals("Dross",miAutor.getNombre());
    }
    @Test
    void Test_Autor_constructor_2args(){
        assertEquals("español",miAutor.getNacionalidad());
    }
    @Test
    void Test_Autor_setter(){
        miAutor.setNacionalidad("frances");
        assertEquals("frances",miAutor.getNacionalidad());
    }
    @Test
    void Test_Autor_ToString(){
        assertEquals("Autor{nombre='Dross', nacionalidad='español', libros_escritos=[null, null, null, null, null], libros_T_escritos=[null, null, null, null, null]}",miAutor.toString());
    }
    @Test
    void Test_Autor_Arrays_anyadir_true(){
        assert (Arrays.equals(new Libro[5], miAutor.getLibros_escritos()));
        assert (Arrays.equals(new String[5], miAutor.getLibros_T_escritos()));
        miAutor.anyadir_libro(miLibro);
        Libro[] example = new Libro[5];
        example[0] = miLibro;
        assert (Arrays.equals(example, miAutor.getLibros_escritos()));
        String[] example2 = new String[5];
        example2[0] = miLibro.getTitulo();
        assert (Arrays.equals(example2, miAutor.getLibros_T_escritos()));
    }
    @Test
    void Test_Autor_Arrays_anyadir_False(){
        for (int i=0;i<5;i++)
            assert miAutor.anyadir_libro(miLibro);
        assert !(miAutor.anyadir_libro(miLibro));
    }
    @Test
    void Test_Autor_Arrays_elimininar(){
        miAutor.anyadir_libro(miLibro);
        assert miAutor.eliminar_libro(miLibro);
        assert !(miAutor.eliminar_libro(miLibro));
    }
}

