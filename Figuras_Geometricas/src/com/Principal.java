package com;

public class Principal {
public static void main(String[] args) {
	
	
	Circulo c1= new Circulo(30);
	c1.getPerimetro();
	System.out.println(c1.perimetro());
	
	c1.getArea();
	System.out.println(c1.area());
	
	c1.getVolumen();
	System.out.println(c1.volumen());
	
	
	
	Cuadrado c2= new Cuadrado(30);
	c2.getPerimetro();
	System.out.println(c2.perimetro());
	
	c2.getArea();
	System.out.println(c2.area());
	
	c2.getVolumen();
	System.out.println(c2.volumen());
	
	

	Triangulo c3= new Triangulo(30,80);
	c3.getPerimetro();
	System.out.println(c3.perimetro());
	
	c3.getArea();
	System.out.println(c3.area());
	
	c3.getVolumen();
	System.out.println(c3.volumen());
}
}
