package org.foobarspam.main;

import java.util.ArrayList;

import org.foobarspam.business.Correlacion;
import org.foobarspam.business.Diario;
import org.foobarspam.business.Registro;

public class Main {

	public static void main(String[] args) {
		
		//Clase I. Registro
		System.out.println("///////////////////");
		System.out.println("Clase I. Registro\n");
		
		//Init
		Registro registro = new Registro();
		ArrayList<String> arrayEventos = new ArrayList<String>();
		Boolean estadoPulpo;
		
		//Arrange
		arrayEventos.add("Trabajar");
		arrayEventos.add("Tocar un árbol");
		arrayEventos.add("Hamburguesa");
		arrayEventos.add("Correr");
		arrayEventos.add("Percebes");		
		estadoPulpo = true;
		
		registro.setArrayEventos(arrayEventos);
		registro.setEstadoPulpo(estadoPulpo);
		
		//Print
		registro.printEventos(registro.getArrayEventos());
		
		

		//Clase II. Diario
		System.out.println("\n\n///////////////////");
		System.out.println("Clase II. Diario\n");
		
		//Init
		Diario diario = new Diario();		
		
		//Array1
		Registro registroDiario1 = new Registro();
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Trabajar");
		array1.add("Tocar un árbol");
		array1.add("Percebes");
		array1.add("Correr");
		array1.add("Television");		
		registroDiario1.setEstadoPulpo(false);
		
		registroDiario1.setArrayEventos(array1);		
		diario.incluirRegistro(registroDiario1);
		
		//Array2
		Registro registroDiario2 = new Registro();
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Trabajar");
		array2.add("Helado");
		array2.add("Colifrol");
		array2.add("Lasaña");
		array2.add("Lavarse los dientes");
		registroDiario2.setEstadoPulpo(false);
		registroDiario2.setArrayEventos(array2);
		diario.incluirRegistro(registroDiario2);
		
		//Array3
		Registro registroDiario3 = new Registro();
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("Finde");
		array3.add("Bicicleta");
		array3.add("Descansar");
		array3.add("Cacahuetes");
		array3.add("Cerveza");
		registroDiario3.setEstadoPulpo(true);
		registroDiario3.setArrayEventos(array3);
		diario.incluirRegistro(registroDiario3);
		diario.mostrarDiario();
		

		//Clase III. Correlacion
		System.out.println("\n\n///////////////////");
		System.out.println("Clase III. Correlacion\n");
		
		Correlacion correlacion = new Correlacion();	
		correlacion.phi();
		

	}

}
