package org.foobarspam.business;

import java.util.ArrayList;

public class TablaEvento {

	// Attributes
	private Integer[] vectorTabla = { 76, 9, 4, 1 };
	private String evento = "";

	Registro registro;

	// Constructor
	public TablaEvento() {
		registro = new Registro();
	}

	// Getters & setters
	public Integer[] getVectorTabla() {
		return this.vectorTabla;
	}

	public String getEvento() {
		return this.evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	// Methods
	public Boolean contieneEvento(String evento, Registro registro) {
		for (String eventoDelDia : registro.getArrayEventos()) {
			if (evento == eventoDelDia) {
				return true;
			}
		}
		return false;
	}

	public void tablaPara(String evento, Diario diario) {
		for (Registro registro : diario.getRegistro()) {
			if (contieneEvento(evento, registro)) {
				if (registro.getEstadoPulpo() == false) {
					// sumer 1 segunda posicion
					getVectorTabla()[1] = +1;
				} else {
					// sumar 1 cuarta posicion
					getVectorTabla()[3] = +1;
				}
			} else {
				if (registro.getEstadoPulpo() == false) {
					// sumar 1 primera posicion
					getVectorTabla()[0] = +1;
				} else {
					// sumar 1 tercera posicioin
					getVectorTabla()[2] = +1;
				}
			}
		}
	}

	public void mostrarTabla() {
		String valor = "";
		for (Integer posicion : getVectorTabla()) {
			valor = valor + " " + posicion;
		}
		System.out.println("La tabla para Percebes es [" + valor + " ]");
	}

}
