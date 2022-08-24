package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		// crear un objeto de cualquier clase
//
//		Auto a1 = new Auto();
//
//		a1.setModelo("modelo1");
//		a1.setCosto(23.8);
//		a1.setMarca("Marca1");
//
//		motor m1 = new motor(6, 150, 200.0, "V");
//
//		a1.setMotor(m1);
//
////		System.out.println(a1);
//
//		Auto a2 = new Auto("m2", 4, "acme", 900.50, m1, "basica", "manual");
//		System.out.println(a2);// imprimo el objeto antes que avance
//
//		a2.avanzar(30);
//
//		System.out.println(a2);

		
		Tenis t1 = new Tenis();
		t1.setColor("azul");
		t1.setMarca("nike");
		t1.setPrecio(450);
		t1.setTalla(27.5);
		
		Tenis t2 = new Tenis(21.5, "rosa", 790, "Adidas");
				
		System.out.println(t1);
		System.out.println(t2);
		
		
		
		
		
		
		
		
	}
}
