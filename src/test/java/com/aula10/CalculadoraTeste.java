package com.aula10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste{

    @Test
    void testSomar(){
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(-2, 2));
        assertNotEquals(10, calc.somar(4, 5));

    }
}

