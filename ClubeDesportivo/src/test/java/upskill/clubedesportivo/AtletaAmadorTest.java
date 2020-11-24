/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marco
 */
public class AtletaAmadorTest {

    public AtletaAmadorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularValorMensal method, of class AtletaAmador.
     */
    @Test
    public void testCalcularValorMensalMenorQueMin() {
        AtletaAmador instance = new AtletaAmador(7, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 1);
        double expResult = 5;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularValorMensal method, of class AtletaAmador.
     */
    @Test
    public void testCalcularValorMensalMenorMin() {
        AtletaAmador instance = new AtletaAmador(7, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600);
        double expResult = 54;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of calcularValorMensal method, of class AtletaAmador.
     */
    @Test
    public void testCalcularValorMensalMenorMed() {
        AtletaAmador instance = new AtletaAmador(12, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600);
        double expResult = 90;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularValorMensal method, of class AtletaAmador.
     */
    @Test
    public void testCalcularValorMensalMenorMax() {
        AtletaAmador instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600);
        double expResult = 162;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }

}
