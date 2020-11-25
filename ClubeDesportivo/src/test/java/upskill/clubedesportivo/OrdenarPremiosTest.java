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
public class OrdenarPremiosTest {
    
    public OrdenarPremiosTest() {
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
     * Test of compare method, of class OrdenarPremios.
     */
    @Test
    public void testComparePositive() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 600);
        OrdenarPremios instance = new OrdenarPremios();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result > 0);
    }
    
    /**
     * Test of compare method, of class OrdenarPremios.
     */
    @Test
    public void testCompareNegative() {
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 600);
        OrdenarPremios instance = new OrdenarPremios();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result < 0);
    }
    
    /**
     * Test of compare method, of class OrdenarPremios.
     */
    @Test
    public void testCompareEqual() {
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        OrdenarPremios instance = new OrdenarPremios();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result == 0);
    }
    
}
