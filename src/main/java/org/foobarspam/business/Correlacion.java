package org.foobarspam.business;

import java.util.ArrayList;
import java.lang.Math;

public class Correlacion {

	// Atributes
	private Integer[] tabla = {76, 9, 4, 1};
	private Double phi = 0.0;
	
	private Integer n00 = getTabla()[0];
	private Integer n01 = getTabla()[1];
	private Integer n10 = getTabla()[2];
	private Integer n11 = getTabla()[3];
	
	
	//Getters & setters
	public Integer[] getTabla(){
		return this.tabla;
	}
	
	public Double getPhi() {
		return this.phi;
	}
	public void setPhi(Double phi) {
		this.phi = phi;
	}

	
	//Methods
	public void phi() {		
		Integer divisor = calcularDivisor();
		Double resultado = calcularPhi(calcularDividendo(), calcularRaiz(divisor));
		setPhi(resultado);
		
		System.out.println(calcularDividendo());
		System.out.println(divisor);
		System.out.println(calcularRaiz(divisor));
		System.out.println(getPhi());
	
	}
	
	public void phi(Integer[] tabla) {
		try {
			phi();
		} catch (Exception e) {
			System.out.println("Se ha producido un error en el cálculo de phi.");
		}
	}
	
	
	public Integer calcularDividendo() {
		Integer dividendo = (n11 * n00) - (n10 * n01);		
		return dividendo;
	}
	public Integer calcularDivisor() {
		Integer Divisor = (n10 + n11) * (n00 + n01) * (n01 + n11) * (n00 + n10);		
		return Divisor;
	}
	public Double calcularRaiz(Integer numero) {
		Double raiz = Math.sqrt(numero);
		return raiz;
	}
	public Double calcularPhi(Integer dividendo, Double raiz) {
		Double resultado = dividendo / raiz;
		return resultado;
	}

}
