package org.foobarspam.main;

import java.util.ArrayList;

import org.foobarspam.business.Registro;

public class Main {

	public static void main(String[] args) {
		
		//Init
		Registro registro = new Registro();
		ArrayList<String> arrayEventos = new ArrayList<String>();
		Boolean estadoPulpo;
		
		arrayEventos.add("Trabajar");
		arrayEventos.add("Tocar un árbol");
		arrayEventos.add("Hamburguesa");
		arrayEventos.add("Correr");
		arrayEventos.add("Percebes");
		
		estadoPulpo = true;
		
		registro.setArrayEventos(arrayEventos);
		registro.setEstadoPulpo(estadoPulpo);
		
		registro.printEventos(registro.getArrayEventos());

	}


}
