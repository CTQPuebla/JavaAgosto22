package com;

public class Principal {
	public static void main(String[] args) {
	
		Persona p = new Persona("Omar", "Masculino", "mexa", 20);
		Empleado e = new Empleado();
		
		//El método pensar puede ser utilizado por "Persona"y los herederos
		p.pensar();
		e.pensar();
		
		//El método trabajar solo puede ser utilizado por "Empleado" ya que la herencia no funciona en ambos sentidos, únicamente a los herederos
		e.trabajar("");
		
		
		//Accedo a través del setter a un atrubuto que es privado
		p.setEdad(20);
		
		//Accedo directamente a un atributo público
		p.nombre="";
		
		System.out.println(p);
		System.out.println(e);
		
//		Encapsulamiento - Modificadores de acceso
//		
//		Limita el acceso por medio de las siguientes palabras: 
//		
//		private - delimita el acceso directo solo dentro de la propia clase
//		public - acceso desde cualquier lugar
//		protected - visibilidad etre clases del mismo paquete, y la visibilidad directa de los atributos de una clase a otra cuando existe una relacion de herencia
		
		Gerente g = new Gerente();
		
	}
}