package org.foobarspam.business;

import java.util.ArrayList;

public class Registro {
	
	//Attributes	
	private ArrayList<String> eventos = new ArrayList<String>();	
	private Boolean pulpo = false;
	
	//Getters & setters
	public ArrayList<String> getArrayEventos(){
		return this.eventos;
	}
	public void setArrayEventos(ArrayList<String> arrayEventos) {
		for(String evento : arrayEventos) {
			getArrayEventos().add(evento);
		}
	}
	
	public Boolean getEstadoPulpo() {
		return this.pulpo;
	}
	public void setEstadoPulpo(Boolean estadoPulpo) {
		this.pulpo = estadoPulpo;
	}

	
	//Methods
	public void printEventos(ArrayList<String> eventos) {
		String event = "Lista de eventos:";
		
		for(String evento : eventos) {
			event = event + " " + evento + ",";
		}
		System.out.println(event);

		System.out.println("\nEstado de pulpo: " + getEstadoPulpo());	
	}
}
