/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;


import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author pablo
 */
@RunWith(value=Parameterized.class)
public class ParameterTest {
    
    private int n1;
    private int n2;
    private int resultadoEsperado;
    
    public ParameterTest(int n1, int n2, int resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultadoEsperado = resultado;
    }
    
    @Parameterized.Parameters
     public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {8, 7, 15},  // 8 + 7 = 15
            {2, 0, 20},   
            {10, -1, -9},  

        });
    }
    @Test
    public void testSumaArrays(){
        int resultado = n1 + n2;
        assertEquals(resultadoEsperado, resultado);
    }

}
