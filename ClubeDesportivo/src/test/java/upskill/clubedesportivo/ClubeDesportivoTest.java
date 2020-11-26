/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

import java.util.ArrayList;
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
     * Test of equals method, of class ClubeDesportivo same attributes.
     */
    @Test
    public void testEqualsSameAtt() {
        Object obj = new ClubeDesportivo("PortoFC","24/11/1986");
        ClubeDesportivo instance = new ClubeDesportivo("PortoFC","24/11/1986");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class ClubeDesportivo same instance.
     */
    @Test
    public void testEqualsSameInstance() {
        ClubeDesportivo instance = new ClubeDesportivo("PortoFC");
        boolean expResult = true;
        boolean result = instance.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ClubeDesportivo different class.
     */
    @Test
    public void testEqualsDifClass() {
        Object obj = new AtletaPro(600, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        ClubeDesportivo instance = new ClubeDesportivo("PortoFC");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of equals method, of class ClubeDesportivo different attributes.
//     */
//    @Test
//    public void testEqualsDifAtt() {
//        Object obj = new ClubeDesportivo("VizelaFC");
//        ClubeDesportivo instance = new ClubeDesportivo("FC Porto");
//        boolean expResult = false;
//        boolean result = instance.equals(obj);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of inserirAtleta method, of class ClubeDesportivo.
     */
    @Test
    public void testInserirAtleta() {
        Atleta atleta = new AtletaAmador(22, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        ClubeDesportivo instance = new ClubeDesportivo("FC Porto");
        instance.inserirAtleta(atleta);
        ArrayList<Atleta> result = instance.getAtletas();
        ArrayList<Atleta> expResult = new ArrayList<>();
        expResult.add(atleta);

        result.equals(expResult);
    }
    
    /**
     * Test of calcularTotalIRS method, of class ClubeDesportivo.
     */
    @Test
    public void testCalcularTotalIRS() {
        ClubeDesportivo instance2 = new ClubeDesportivo("Arouca FC");

        instance2.inserirAtleta(new AtletaPro(600, "A", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200));
        instance2.inserirAtleta(new AtletaSemiPro(7, "B", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800));
        instance2.inserirAtleta(new AtletaAmador(22, "C", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600));
        instance2.inserirAtleta(new AtletaPro(400, "D", 345452889, "Masculino", 21, 68, "corrida", "QueimaGordura", 2400));
        System.out.println(instance2.getAtletas());
        double expResult = 150;
        double result = instance2.calcularTotalIRS();
        
        assertEquals(expResult, result);
    }

}
