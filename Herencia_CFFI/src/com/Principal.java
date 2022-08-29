package com;

public class Principal {
	public static void main(String[] args) {
		
		
		Persona p = new Persona ("Don Omar", 20, "Masculino","Mexa");
		
		Empleado e = new Empleado();
		
		
		p.pensar();
		e.pensar();
		
		//Accedos a treves del setter a un atributo que es privado
		p.setEdad(20);
		
		//Accedo directamente a un atributo publico
		p.nombre="monollo";
		
		// Es inaccesible porque las herencia no funciona desde superiors a inferiores
        // (no hay acceso a miemnbros de nodos inferriores desde nodos superiores)
		// p.trabajar();
		
		// si es alcanzable por ser un metodo propio de la clase
		e.trabajar("");
		
		
		System.out.println(p);
		System.out.println(e);
		
		//Encapsulamiento - Modificador de acceso
         /*
         *private - delimita el acceso directo solo dentor de la propia clase
         *public - acceso desde cualquier lugar 
         *protected - visibilidad entre clases del mismo paquete3
         *
         */
		
		Gerente g = new Gerente ();
		

		
		
		
	}

}
