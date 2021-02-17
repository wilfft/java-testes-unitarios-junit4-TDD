package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSomar() {
	Calculadora calc = new Calculadora();
	int soma = calc.somar("1+2+3");
	assertEquals(6, soma);
    }

}
