package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo(3, 7.5);
		t1.calcularArea();
		System.out.println(t1.calcularArea());
		
		
		Circulo c1 = new Circulo(5);
		c1.calcularPerimetro();
		System.out.println(c1.calcularPerimetro());
		
		
		Cuadrado a1 = new Cuadrado(8);
		a1.calcularVolumen();
		System.out.println(a1.calcularVolumen());
		
		
	}

}
