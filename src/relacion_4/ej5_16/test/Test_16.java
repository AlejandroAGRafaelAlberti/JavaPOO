package relacion_4.ej5_16.test;
import org.junit.jupiter.api.*;
import relacion_4.ej5_16.*;

import static org.junit.jupiter.api.Assertions.*;
public class Test_16 {
    Arma miArma;
    ArmaBlanca miArmaBlanca;
    ArmaFuego miArmaFuego;
    Cullicho miCullicho;
    Escopeta miEscopeta;
    Hacha miHacha;
    Pistola miPistola;
    Rifle miRifle;
    @BeforeEach
    void arrange(){
        miArma = new Arma(5);
        miArmaBlanca = new ArmaBlanca(5);
        miArmaFuego = new ArmaFuego(5);
        miCullicho = new Cullicho(5);
        miEscopeta = new Escopeta(5);
        miHacha = new Hacha(5);
        miPistola = new Pistola(5);
        miRifle = new Rifle(5);
    }
    @Test
    void test_arma(){
        assertEquals(5,miArma.atacar());
        miArma.setPotencia(10);
        assertEquals(10,miArma.getPotencia());
        assertEquals("Arma{potencia=10.0}",miArma.toString());
    }
    @Test
    void test_armablanca(){
        miArmaBlanca.afilar();
        assertTrue(miArmaBlanca.isAfilada());
        assertEquals(5,miArmaBlanca.atacar());
        assertEquals(0,miArmaBlanca.atacar());
        miArmaBlanca = new ArmaBlanca(5,4);
        assertEquals(4,miArmaBlanca.getReduccionSinAfilar());
        miArmaBlanca.setReduccionSinAfilar(10);
        assertEquals(10,miArmaBlanca.getReduccionSinAfilar());
        assertEquals("ArmaBlanca{potencia=5.0, afilada=false, reduccionSinAfilar=10.0}",miArmaBlanca.toString());
    }
    @Test
    void test_armafuego(){
        miArmaFuego.cargar();
        assertTrue(miArmaFuego.isCargada());
        assertEquals(15,miArmaFuego.disparar());
        assertEquals(0,miArmaFuego.disparar());
        assertEquals("ArmaFuego{potencia=5.0, cargada=false}",miArmaFuego.toString());
    }
    @Test
    void test_cullicho(){
        miCullicho = new Cullicho(5,7);
        assertEquals("Cullicho{potencia=5.0, afilada=false, reduccionSinAfilar=7.0}",miCullicho.toString());
    }
    @Test
    void test_escopeta(){
        miEscopeta = new Escopeta(5,true);
        assertTrue(miEscopeta.isRecortada());
        miEscopeta = new Escopeta(7,false,20);
        miEscopeta.setRecortada(true);
        assertEquals(0,miEscopeta.disparar());
        miEscopeta.cargar();
        assertEquals(41,miEscopeta.disparar());
        miEscopeta.setAumentorecortada(10);
        assertEquals(10,miEscopeta.getAumentorecortada());
        assertEquals("Escopeta{potencia=7.0, cargada=false, recortada=true, aumentorecortada=10.0}",miEscopeta.toString());
    }
    @Test
    void test_hacha(){
        miHacha = new Hacha(5,3);
        miHacha.setFilos(2);
        assertEquals(2,miHacha.getFilos());
        miHacha.afilar();
        assertEquals(10,miHacha.atacar());
        assertEquals(4,miHacha.atacar());
        assertEquals("Hacha{potencia=5.0, afilada=false, reduccionSinAfilar=3.0, filos=2}",miHacha.toString());
    }
    @Test
    void test_pistola(){
        miPistola = new Pistola(10,22);
        miPistola.cargar(22);
        miPistola.setCalibre(9);
        assertEquals(9,miPistola.getCalibre());
        assertEquals("Pistola{potencia=10.0, cargada=true, calibre=9}",miPistola.toString());
    }
    @Test
    void test_rifle(){
        miRifle = new Rifle(10,100);
        miRifle.cargar();
        assertEquals(0,miRifle.disparar(200));
        miRifle.setAlcance(200);
        assertEquals(200,miRifle.getAlcance());
        miRifle.cargar();
        assertEquals(30,miRifle.disparar(200));
        assertEquals("Rifle{potencia=10.0, cargada=false, alcance=200.0}",miRifle.toString());
    }
}

