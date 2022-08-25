package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("Omar",20,"Masculino","mexa");
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar();
		
		//accedo a traves del setter a un atributo que es privado
		p.setEdad(20);
		
		//acccedo directamente a un atributo publico
		p.nombre="eeeee";
		
		Gerente g = new Gerente();
	
		g.trabajar("computadora");
	}
}
