package com;

public class Cuadrado extends Figuras{

	@Override
	public void calcArea() {
		
	}
	
	@Override
	public void calcArea(double d1) {	
		System.out.println("El area del cuadrado: es "+(d1*d1));
	}

	@Override
	public void calcPerimetro() {
		
	}

	@Override
	public void calcPerimetro(double d1) {
		
		System.out.println("El perimetro del cuadrado es: "+(d1*4));
		
	}
	
	@Override
	public void calcV() {
		
	}
	
	@Override
	public void calcV(double d1) {
		System.out.println("El volumen del cubo es: "+(Math.pow(d1, 3)));
	}

	
}
