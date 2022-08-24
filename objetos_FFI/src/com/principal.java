package com;

public class principal {
	public static void main(String[] args) {

		// crear un objeto de cualuier clase

//		Auto a1 = new Auto();
//
//		
//		a1.setModelo("modelo 1");
//		a1.setCosto(23.8);
//		a1.setMarca("marca1");
//		
//		
//		motor m1= new motor(6, 15, 200, "V");
//		
//		a1.setMotor(m1);
//		
//	//motor m1 =new motor(numCulindros, caballosFuerza, torque, disposicion)
//		
//			
//		
//		Auto a2 = new Auto("m2", 4, "astra", 100.50, m1, "baja", "manual");
//		
//		
//		System.out.println(a2); //imprimo al objeto antes de avanzar
//		
//		a2.avanzar(30);
//		
//		System.out.println(a2); //imprime el objeto despuesde avanzar
		
		Ropa m1 =  new Ropa();
		
		m1.setColor("rojo");
		m1.setMarca("gucci");
		m1.setPrecio(100000.50);
		m1.setTalla(22);
		
		Ropa m2 = new Ropa("azul", "delmer", 50, 30 );
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		
	}

}
