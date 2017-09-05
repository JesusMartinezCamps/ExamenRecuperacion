package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.business.Correlacion;
import org.junit.Test;

public class CorrelacionTests {

	@Test
	public void Correlacion_CalcularDividendo_True() {
		Correlacion correlacion = new Correlacion();
		
		Integer dividendo = correlacion.calcularDividendo();
		Integer esperado = 40;
		
		assertEquals(esperado, dividendo);
	}
	
	@Test
	public void Correlacion_CalcularDivisor_True() {
		Correlacion correlacion = new Correlacion();
		
		Integer divisor = correlacion.calcularDivisor();
		Integer esperado = 340000;
		
		assertEquals(esperado, divisor);
	}
	
	@Test
	public void Correlacion_CalcularRaiz_True() {
		Correlacion correlacion = new Correlacion();
		
		Integer divisor = correlacion.calcularDivisor();
		Double raiz = correlacion.calcularRaiz(divisor);
		Double esperado = 583.09518948453;
		
		assertEquals(esperado, raiz);
	}
	
	@Test
	public void Correlacion_CalcularPhi_True() {
		Correlacion correlacion = new Correlacion();
		
		Integer divisor = correlacion.calcularDivisor();
		Integer dividendo = correlacion.calcularDividendo();
		Double raiz = correlacion.calcularRaiz(divisor);
		
		Double phi = correlacion.calcularPhi(dividendo, raiz);
		
		Double esperado = 0.06859943405700354;
		
		assertEquals(esperado, phi);
	}

}
