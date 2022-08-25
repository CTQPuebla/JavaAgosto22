package com;

public class Principal {
public static void main(String[] args) {

	Persona p = new Persona("jaun",20,"masculino","mexicano");
	Empleado e = new Empleado();
	
	p.pensar();
	e.pensar();
// //una clase padre no puede acceder a los metodos o atributos de una clase hijo
	
	
	// aceceder a un atributo privado
	p.setEdad(21);
	
	// acceder directamente a un atributo
	p.nombre="";
	
	System.out.println(e);
	// encapsulamiento - modificadores de acceso
	// delimitar acceso con palabras restringidas a nuestras clases
	/*
	 * private delimita a la misma clase
	 * public- acceso desde cualquier lugar
	 * protected-
	 * 

	 */
	String herramienta = "scaner";
	Gerente g = new Gerente();
	g.trabajar(herramienta);
}
}
