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
public class AtletaTest {

    public AtletaTest() {
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
     * Test of validarAtividade method, of class Atleta.
     */
    @Test
    public void testValidarAtividade() {
        Atleta instance = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 300);
        boolean expResult = true;
        boolean result = instance.validarAtividade();
        assertEquals(expResult, result);
    }

    /**
     * Test of invalid validarAtividade method, of class Atleta.
     */
    @Test
    public void testValidarAtividadeInvalido() {
        Atleta instance = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "patinagem", "QueimaGordura", 400);
        boolean expResult = false;
        boolean result = instance.validarAtividade();
        assertEquals(expResult, result);
    }

    /**
     * Test of validarObjetivo method, of class Atleta.
     */
    @Test
    public void testValidarObjetivo() {
        Atleta instance = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 200);
        boolean expResult = true;
        boolean result = instance.validarObjetivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of validarObjetivo method, of class Atleta.
     */
    @Test
    public void testValidarObjetivoInvalido() {
        Atleta instance = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "futebol", "Força", 300);
        boolean expResult = false;
        boolean result = instance.validarObjetivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterIT method, of class Atleta.
     */
    @Test
    public void testObterIT() {
        System.out.println("obterIT");
        Atleta instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 400);
        double expResult = 0.6;
        double result = instance.obterIT();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularFCM method, of class Atleta for caminhada and corrida.
     */
    @Test
    public void testCalcularFCMCaminhadaCorrida() {
        System.out.println("calcularFCM");
        Atleta instance = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 500);;
        double expResult = 185.39;
        double result = instance.calcularFCM();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularFCM method, of class Atleta for ciclismo feminino.
     */
    @Test
    public void testCalcularFCMCiclismoFeminino() {
        System.out.println("calcularFCM");
        Atleta instance = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 200);
        double expResult = 173.88;
        double result = instance.calcularFCM();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularFCM method, of class Atleta for ciclismo masculino.
     */
    @Test
    public void testCalcularFCMCiclismoMasculino() {
        System.out.println("calcularFCM");
        Atleta instance = new AtletaSemiPro(7, "Miguel", 345373123, "Masculino", 40, 65, "ciclismo", "CapacidadeCardio", 600);
        double expResult = 173.2;
        double result = instance.calcularFCM();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularFCM method, of class Atleta for ciclismo masculino.
     */
    @Test
    public void testCalcularFCMNatacao() {
        System.out.println("calcularFCM");
        Atleta instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        double expResult = 144.5;
        double result = instance.calcularFCM();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularFCT method, of class Atleta.
     */
    @Test
    public void testCalcularFCT() {
        System.out.println("calcularFCT");
        Atleta instance = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 35, 55, "natação", "QueimaGordura", 700);
        double expResult = 108.7;
        double result = instance.calcularFCT();
        assertEquals(expResult, result, 0.1);
    }

}
