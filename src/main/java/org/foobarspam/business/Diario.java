package org.foobarspam.business;

import java.util.ArrayList;

public class Diario {
	
	//Attributes
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	
	//Getters & Setters
	public ArrayList<Registro> getRegistro(){
		return this.registros;
	}
	
	public void incluirRegistro(Registro registro) {
		getRegistro().add(registro);
	}
	
	//Methods
	public void mostrarDiario() {
		for(Registro registro : getRegistro()) {
			System.out.print(registro);
		}
		
	}

}
