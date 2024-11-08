/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.Test;

/**
 *
 * @author pablo
 */
public class DivisionTest {
    
    public DivisionTest() {
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        int resultado = 2 / 0;
    }
}
