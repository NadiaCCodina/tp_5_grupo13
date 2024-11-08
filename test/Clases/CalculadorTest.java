/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 *
 * @author pablo
 */
public class CalculadorTest {
    private static Calculador calculadora;
    
    @Rule
    public TestName testName = new TestName();
    
    public CalculadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calculadora = new Calculador();
        System.out.println("Bienvenido al test de clase Calculador");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println("Ejecutando: " + testName.getMethodName());
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @Test
    public void testSuma2mas2() {
        assertEquals(4,calculadora.suma(2, 2),0.001);   
    }
    
    @Test
    public void testResta2menos2() {
        assertEquals(0,calculadora.resta(2, 2),0.001);   
    }
    
}
