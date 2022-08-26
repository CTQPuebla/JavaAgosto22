package com;

public class Principal {
	public static void main(String[] args) {
		
		Circulo c = new Circulo(5, 10);
		Triangulo t = new Triangulo(10, 10, 10, 10);
		Cuadrilateros cu = new Cuadrilateros(20, 50);
		
		System.out.println("Circulo");
		System.out.println(c.calculaArea(c.getAlto(), c.getLado()));
		System.out.println(c.calculaPerimetro(c.getAlto(), c.getLado()));
		
		System.out.println("\nTriangulo");
		System.out.println(t.calculaArea(t.getLado(), t.getAlto()));
		System.out.println(t.calculaPerimetro(t.getLado(), t.getAlto()));
		
		System.out.println("\nCuadrilatero");
		System.out.println(cu.calculaArea(cu.getLado(), cu.getAlto()));
		System.out.println(cu.calculaPerimetro(cu.getLado(), cu.getAlto()));
	}
}
