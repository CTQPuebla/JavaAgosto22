package com;

public class Principal {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Cuadrado cuadrado = new Cuadrado();
		
		circulo.calcArea(23);
		circulo.calcPerimetro(34);
		circulo.calcV(5);
		
		triangulo.calcArea(4,3);
		triangulo.calcPerimetro(3,4,5);
		triangulo.calcV(4, 7,5);
		
		cuadrado.calcArea(4);
		cuadrado.calcPerimetro(8);
		cuadrado.calcV(2);

	}

}
