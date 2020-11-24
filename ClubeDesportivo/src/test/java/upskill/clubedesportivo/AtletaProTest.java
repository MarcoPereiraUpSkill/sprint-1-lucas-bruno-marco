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
public class AtletaProTest {
    
    public AtletaProTest() {
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
     * Test of calcularValorMensal method, of class AtletaPro.
     */
    @Test
    public void testCalcularValorMensal() {
        AtletaPro instance = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        double expResult = 840;
        double result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
    }
    
}
