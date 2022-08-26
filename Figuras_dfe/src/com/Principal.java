package com;

public class Principal {

	public static void main(String[] args) {
		 
			Circulo c1 = new Circulo(5);
			c1.getPerimmetro();
			System.out.println("El resultado es "+c1.perimetro());
			
			c1.getArea();
			System.out.println("El resultado es "+c1.area());
			
			c1.getVolumen();
			System.out.println("El resultado es "+c1.volumen());
			
			Cuadrado c2 = new Cuadrado(5);
			c2.getPerimmetro();
			System.out.println("El resultado es "+c2.perimetro());
			
			c2.getArea();
			System.out.println("El resultado es "+c2.area());
			
			c2.getVolumen();
			System.out.println("El resultado es "+c2.volumen());
			
			Triangulo t1 = new Triangulo(90,90);
			t1.getPerimmetro();
			System.out.println("El resultado es "+t1.perimetro());
			
			t1.getArea();
			System.out.println("El resultado es "+t1.area());
			
			t1.getVolumen();
			System.out.println("El resultado es "+t1.volumen());
	}
}
