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
public class AtletaNaoProTest {
    
    public AtletaNaoProTest() {
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
     * Test of obterPercAntiguidade method, of class AtletaNaoPro.
     */
    
    @Test
    public void testObterPercAntiguidadeMin() {
        AtletaNaoPro instance = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 2;
        double result = instance.obterPercAntiguidade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obterPercAntiguidade method, of class AtletaNaoPro.
     */
    
    @Test
    public void testObterPercAntiguidadeMed() {
        AtletaNaoPro instance = new AtletaSemiPro(12, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 8;
        double result = instance.obterPercAntiguidade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obterPercAntiguidade method, of class AtletaNaoPro.
     */
    
    @Test
    public void testObterPercAntiguidadeMax() {
        AtletaNaoPro instance = new AtletaSemiPro(23, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 20;
        double result = instance.obterPercAntiguidade();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of obterPercAntiguidade method, of class AtletaNaoPro.
     */
    
    @Test
    public void testObterPercAntiguidadeInvalida() {
        AtletaNaoPro instance = new AtletaSemiPro(2, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        double expResult = 1;
        double result = instance.obterPercAntiguidade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Atleta.
     */
    @Test
    public void testEquals() {
        Atleta instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        Atleta instance2 = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Atleta.
     */
    @Test
    public void testEqualsInvalido() {
        Atleta instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        Atleta instance2 = new AtletaPro(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
}
