package com;

public class Principal {
	
	public static void main(String[] args) {
		 
		Persona p = new Persona("kevin", 20, "Masculino", "mexa");
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar(); 
		
		//accedo a traves del seter a un atributo que es privado
		p.setEdad(20);
		
		//accedo directamente a un atributo publico
		p.nombre="";
		
		//es inaccesible que la herencia no funciona desde nodos superiores a inferiores
		//(no hay acceso a miembros de nodos inferiores desde nodos superiores)
		//p.trabajar();
		
		//si es alcanzable por ser un metodo propio de la clase
		e.toString();
		
		
		System.out.println(p);
		System.out.println(e);
        
		//encapsulamiento : modificadores de acceso
	    /* private: delimita al acceso directo solo dentro de la propia clase
	     * public:acceso de cualquier lugar
		 * protected:
		 */
		
		
		Gerente g = new Gerente();
		
		
		
		
		
		
		
		
		
		
	}

}
