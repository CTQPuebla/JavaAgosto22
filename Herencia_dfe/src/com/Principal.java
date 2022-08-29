package com;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona("David", 25, "Masculino", "mexican");
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar();
		
		//Accedo a traves de l setter a un atributo que es privado
		p.setEdad(25);

		//Accedo directamente a un atributo publico
		
		p.nombre="";
		
		
		//Es inaccesioble por que la herencia no funciona desde nodos superiores a inferiores
		//(no hay acceso a miembros de nodos inferiores desde nodos superiores)
		// p.trabajar();
		
		//Si es alcanzable por ser un metodo propio de la clase
//		e.trabajar();
		
		System.out.println(p);
		System.out.println(e);
		
		//Encapsulamiento-------Modificadores de acceso
		//*private-Delimita el acceso directo solo dentro de la propia clase
		//*public-Acceso desde cualquier lugar
		//*protected-Tiene visibilidad entre clases del mismo paquete, permite la visibilidad directa de los atributos de una clase a otra 
		// cuando existe una relacion de herencia 
		//*final-indica que a esa variable solo se le puede asignar un valor u objeto una única vez
		//.los protege de la sobre escritura, los protege de clases, etodos y atributos
		Gerente g = new Gerente();
		
		
		
		
	}
	
	
	
}
