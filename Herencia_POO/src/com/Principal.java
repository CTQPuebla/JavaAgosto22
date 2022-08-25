package com;

public class Principal {
	public static void main(String[] args) {
		
		Persona p = new Persona("omar",20,"masculino","mexa");
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar();
		
		//accede a traves del setter a un atributo que es privado
		 p.setEdad(20); 
		 
		  //accede directamente a unatributopublico
		 
	      p.nombre=" ";
	      
	      
		//es inaccesible por que la herencia no funciona desde nodos superiores a inferiores
		//no hay acceso a miembros de nodos inferiores desde nodos superiores
		//p.trabajar();  
		
		//si es alcanzable por ser un metodo propio de la clase
		e.trabajar("");
		
		 System.out.println(p);
		 System.out.println(e);
		 
		
		//encapsulamiento- modificadores de acceso
		/*private -- delimita el acceso directo solo dentro de la propia clase
		 * public- acceso desde cualquier lugar
		 * protected- ?
		 */
		Gerente g = new Gerente();
		 
	}
 
}
