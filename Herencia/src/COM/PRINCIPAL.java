package COM;

public class PRINCIPAL {
	public static void main(String[] args) {
		
		Persona p = new Persona("Omar",20,"Masculino","mexa");
		
		Empleado e = new Empleado();
		
		p.pensar();
		e.pensar();
		//Es inaccesible por que la herencia no funciona desde nodos superiores a inferiores
		//(no hay acceso a miembros de nodos inferiores a superiores)
		//p.trabajar();
		//acceso a travrs del setter a un atributo que es privado 
		p.setEdad(20);
		//aacedo directamente a un atributo publico
		p.nombre="";
		
		
		
		
		
		
		e.trabajar(null);
		
		System.out.println(p);
		System.out.println(e);
		
		
		//encapsulamiento - modificadores de acceso
		/*
		 * private: delimita el acceso directo solo de la propia clase
		 * public: acceso desde 
		 * protected
		 */
		
		Gerente g = new Gerente();
	
		
		
		
		
		
		
	}

}
