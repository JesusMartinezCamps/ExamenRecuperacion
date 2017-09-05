package org.foobarspam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.business.Registro;
import org.junit.Test;

public class RegistroTests {


	@Test
	public void Registro_setArrayEventos() {
		
		//Arrange
		Registro registro = new Registro();
		ArrayList<String> eventos = new ArrayList<String>();
		eventos.add("uno");
		eventos.add("dos");
		
		//Act
		registro.setArrayEventos(eventos);
		
		//Check
		for(String event : registro.getArrayEventos()) {
			System.out.println(event);
		}
		
	}
	
	
	@Test
	public void Registro_getEstadoPulpo_False() {
		//Arrange
		Registro registro = new Registro();
		
		//Assertn
		assertEquals(false, registro.getEstadoPulpo());
	}
	
	@Test
	public void Registro_setEstadoPulpo_True() {
		//Arrange
		Registro registro = new Registro();
		
		//Act
		registro.setEstadoPulpo(true);
		
		//Assert
		assertEquals(true, registro.getEstadoPulpo());
	}

}
