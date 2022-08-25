package com;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Omar", 20, "Masculino", "Mexa"); 
		Empleado e = new Empleado();
		Gerente g = new Gerente();
		p.pensar();
		e.pensar();
		
		e.trabajar("pala");
		g.trabajar("pico");
		
		System.out.println(p.nombre);
		System.out.println(p.getEdad());
		
		/*
		 * Modificadores de acceso
		 * Private - delimita el acceso directo solo dentro de la propia clase
		 * public - acceso desde cualquier lugar
		 * protect - tiene visibilidad solo dentro del mismo paquete a menos que se herede a una clase
		 * */
	}

}
