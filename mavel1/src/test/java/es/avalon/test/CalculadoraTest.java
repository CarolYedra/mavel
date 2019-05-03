package es.avalon.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.avalon.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSuma() {

		assertEquals(4.0, Calculadora.testSuma(2, 2), 0.0);
	}

	@Test
	public void testResta() {

		assertEquals(0.0, Calculadora.testResta(2, 2), 0.0);
	}

	@Test
	public void testProducto() {

		assertEquals(4.0, Calculadora.testProducto(2, 2), 0.0);
	}
	@Test
	public void testDivision() {

		assertEquals(1.0, Calculadora.testDivision(2, 2), 0.0);
	}
	
}
