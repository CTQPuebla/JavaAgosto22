package com;

public class Principal {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		
		cuadrado.setLado(2);
		
		cuadrado.area();
		cuadrado.perimetro();
		cuadrado.volumen();
		
		System.out.println("Area de cuadrado: " + cuadrado.getArea());
		System.out.println("Perimetro de cuadrado: " + cuadrado.getPerimetro());
		System.out.println("Volumen de cuadrado: " + cuadrado.getVolumen());
		
		//
		Triangulo triangulo = new Triangulo();
		
		triangulo.setAltura(5);
		triangulo.setBase(3);
		triangulo.setLargo(9);
		
		triangulo.area();
		triangulo.perimetro();
		triangulo.volumen();
		
		System.out.println("Area de triangulo: " + triangulo.getArea());
		System.out.println("Perimetro de triangulo: " + triangulo.getPerimetro());
		System.out.println("Volumen de triangulo: " + triangulo.getVolumen());
		
		//
		
		Circulo circulo = new Circulo();
		circulo.setDiametro(6);
		circulo.setRadio(3);
		circulo.area();
		circulo.perimetro();
		circulo.volumen();
		System.out.println("Area de circulo: " + circulo.getArea());
		System.out.println("Perimetro de circulo: " + circulo.getPerimetro());
		System.out.println("Volumen de circulo: " + circulo.getVolumen());
		
		
	}

}
