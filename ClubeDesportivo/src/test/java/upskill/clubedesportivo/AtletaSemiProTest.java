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
public class AtletaSemiProTest {
    
    public AtletaSemiProTest() {
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
     * Test of calcularValorMensal method, of class AtletaSemiPro.
     */
    @Test
    public void testCalcularValorMensalMin() {
        AtletaSemiPro instance = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 510;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularValorMensal method, of class AtletaSemiPro.
     */
    @Test
    public void testCalcularValorMensalMed() {
        AtletaSemiPro instance = new AtletaSemiPro(12, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 540;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularValorMensal method, of class AtletaSemiPro.
     */
    @Test
    public void testCalcularValorMensalMax() {
        AtletaSemiPro instance = new AtletaSemiPro(22, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 600;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }
    
}
