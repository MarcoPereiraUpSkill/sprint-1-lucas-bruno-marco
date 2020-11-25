/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

import java.util.ArrayList;
import java.util.Date;
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
public class ClubeDesportivoTest {
    
    public ClubeDesportivoTest() {
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
     * Test of getData method, of class ClubeDesportivo.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        ClubeDesportivo instance = new ClubeDesportivo();
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtletas method, of class ClubeDesportivo.
     */
    @Test
    public void testGetAtletas() {
        System.out.println("getAtletas");
        ClubeDesportivo instance = new ClubeDesportivo();
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.getAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ClubeDesportivo.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class ClubeDesportivo.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtletas method, of class ClubeDesportivo.
     */
    @Test
    public void testSetAtletas() {
        System.out.println("setAtletas");
        ArrayList<Atleta> atletas = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setAtletas(atletas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ClubeDesportivo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ClubeDesportivo instance = new ClubeDesportivo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ClubeDesportivo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAtleta method, of class ClubeDesportivo.
     */
    @Test
    public void testInserirAtleta() {
        System.out.println("inserirAtleta");
        Atleta atleta = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.inserirAtleta(atleta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarAlfabeticamenteNome method, of class ClubeDesportivo.
     */
    @Test
    public void testOrdenarAlfabeticamenteNome() {
        System.out.println("ordenarAlfabeticamenteNome");
        ClubeDesportivo instance = new ClubeDesportivo();
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.ordenarAlfabeticamenteNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarInversamentePremios method, of class ClubeDesportivo.
     */
    @Test
    public void testOrdenarInversamentePremios() {
        System.out.println("ordenarInversamentePremios");
        ClubeDesportivo instance = new ClubeDesportivo();
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.ordenarInversamentePremios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarCategoriaModalidadeNome method, of class ClubeDesportivo.
     */
    @Test
    public void testOrdenarCategoriaModalidadeNome() {
        System.out.println("ordenarCategoriaModalidadeNome");
        ClubeDesportivo instance = new ClubeDesportivo();
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.ordenarCategoriaModalidadeNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalIRS method, of class ClubeDesportivo.
     */
    @Test
    public void testCalcularTotalIRS() {
        System.out.println("calcularTotalIRS");
        ClubeDesportivo instance = new ClubeDesportivo();
        double expResult = 0.0;
        double result = instance.calcularTotalIRS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
