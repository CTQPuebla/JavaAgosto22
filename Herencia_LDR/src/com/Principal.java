package com;

public class Principal 
{
	public static void main(String[] args) 
	{
		//instanciando un objeto de la clase PERSONA
		Persona p = new Persona("Lizbeth", 24, "Femenino", "Mexicana");
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar();
		
		//Accedo atraves del setter a un atributo que es PRIVADO
		p.setEdad(20);
		
		//Accedo directamente a un atributo publico, si nombre fuera PRIVATE, sería: p.setNombre("Lizbeth");
		p.nombre = "";
		
		//Es inaccesible porque la herencia no funciona desde nodos superiores a inferiores
		//(no hay acceso a miembros de nodos inferiores desde nodos superiores)
		//p.trabajar();			
		
		//Si es alcanzble por ser un metodo propio de la clase
		e.trabajar("");
		
		System.out.println(p);
		System.out.println(e);
		
		//Encapsulamiento - Modificadores de Acceso 
		/**
		 * private   - delimita el acceso directo solo dentro de la propia clase
		 * public    - acceso desde cualquier lugar
		 * protected - ?
		 */
		
		Gerente g = new Gerente();
		g.trabajar(null);
		
	}

}
