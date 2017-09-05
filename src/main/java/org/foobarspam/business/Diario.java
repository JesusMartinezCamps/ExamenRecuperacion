package org.foobarspam.business;

import java.util.ArrayList;

public class Diario {
	
	//Attributes
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	private Boolean pulpo = false;
	
	//Getters & Setters
	public Boolean getPulpo() {
		return this.pulpo;
	}
	public void setPulpo(Boolean pulpo) {
		this.pulpo = pulpo;
	}
	
	public ArrayList<Registro> getRegistro(){
		return this.registros;
	}
	
	public void incluirRegistro(Registro registro) {
		getRegistro().add(registro);
	}
	
	//Methods
	public void mostrarDiario() {		
		for(Registro registro : registros) {
			registro.printEventos(registro.getArrayEventos());
		}		
	}
}
