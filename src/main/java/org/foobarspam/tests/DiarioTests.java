package org.foobarspam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.business.Diario;
import org.foobarspam.business.Registro;
import org.junit.Test;

public class DiarioTests {

	@Test
	public void Diario_getPulpo_False() {
		Diario diario = new Diario();
	
		assertEquals(false, diario.getPulpo());		
	}
	
	@Test
	public void Diario_setPulpo_True() {
		Diario diario = new Diario();
		diario.setPulpo(true);
	
		assertEquals(true, diario.getPulpo());		
	}

}
