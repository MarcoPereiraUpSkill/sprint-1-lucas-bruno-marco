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
public class OrdenarCategoriaModalidadeNomeTest {
    
    public OrdenarCategoriaModalidadeNomeTest() {
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
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, modalidade diferente
     */
    @Test
    public void testCompareMesmaCatDifModNegative() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result < 0);
    }

    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, modalidade diferente
     */
    @Test
    public void testCompareMesmaCatDifModPositive() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result > 0);
    }

    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, modalidade diferente
     */
    @Test
    public void testCompareMesmaCatDifModEquals() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result == 0);
    }

    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, mesma modalidade, nome diferente
     */
    @Test
    public void testCompareMesmaCatMesmaModDifNomeNegative() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Diana", 123456789, "Feminino", 32, 70, "corrida", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result < 0);
    }

    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, mesma modalidade, nome diferente
     */
    @Test
    public void testCompareMesmaCatMesmaModDifNomePositive() {
        Atleta atleta1 = new AtletaPro(600, "Diana", 123456789, "Feminino", 32, 70, "corrida", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result > 0);
    }

    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome mesma categoria, mesma modalidade, nome diferente
     */
    @Test
    public void testCompareMesmaCatMesmaModDifNomeEquals() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result == 0);
    }
    
    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome categoria diferente
     */
    @Test
    public void testCompareDifCatPositive() {
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta2 = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result < 0);
    }
    
    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome categoria diferente
     */
    @Test
    public void testCompareDifCatNegative() {
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta1 = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result > 0);
    }
    
    /**
     * Test of compare method, of class OrdenarCategoriaModalidadeNome categoria diferente
     */
    @Test
    public void testCompareAllEqual() {
        Atleta atleta2 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        Atleta atleta1 = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "natacao", "QueimaGordura", 1200);
        OrdenarCategoriaModalidadeNome instance = new OrdenarCategoriaModalidadeNome();
        int result = instance.compare(atleta1, atleta2);
        assertTrue(result == 0);
    }
    
}
