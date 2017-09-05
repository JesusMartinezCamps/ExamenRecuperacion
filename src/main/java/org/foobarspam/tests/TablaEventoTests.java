package org.foobarspam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.business.Registro;
import org.foobarspam.business.TablaEvento;
import org.junit.Test;

public class TablaEventoTests {

	@Test
	public void TablaEvento_contieneEvento_False() {
		//Arrange
		TablaEvento tabla = new TablaEvento();
		Registro registro = new Registro();
		String evento = "Jugar ajedrez";
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("comer");
		array.add("nadar");
		registro.setArrayEventos(array);
		
		tabla.contieneEvento(evento, registro);
		
		assertEquals(false, tabla.contieneEvento(evento, registro));
	}
	
	@Test
	public void TablaEvento_contieneEvento_True() {
		//Arrange
		TablaEvento tabla = new TablaEvento();
		Registro registro = new Registro();
		String evento = "comer";
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("comer");
		array.add("nadar");
		registro.setArrayEventos(array);
		
		tabla.contieneEvento(evento, registro);
		
		assertEquals(true, tabla.contieneEvento(evento, registro));
	}

}
