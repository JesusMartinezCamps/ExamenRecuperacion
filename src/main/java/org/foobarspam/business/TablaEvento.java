package org.foobarspam.business;

public class TablaEvento {
	
	//Attributes
	private Integer[] vectorTabla = {76, 9, 4, 1};
	private String evento = "";
	
	Registro registro;
	
	//Constructor
	public TablaEvento() {
		registro = new Registro();
	}
	
	//Getters & setters
	public Integer[] getVectorTabla() {
		return this.vectorTabla;
	}
	
	public String getEvento() {
		return this.evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	//Methos
	public Boolean contieneEvento(String evento, Registro registro) {
		for(String eventoDelDia : registro.getArrayEventos()) {
			if(evento == eventoDelDia) {
				return true;
			}
		}
		return false;
	}

}
