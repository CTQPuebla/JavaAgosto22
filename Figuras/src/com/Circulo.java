package com;


public class Circulo extends Figuras{
	

	@Override
	public void calcArea() {	
		
	}
	
	@Override
	public void calcArea(double d1) {	
		System.out.println("El area del circulo es: "+(Math.pow(d1, 2) * Math.PI));
	}
	

	@Override
	public void calcPerimetro() {
		
	}
	
	@Override
	public void calcPerimetro(double d1) {	
		System.out.println("El area del circulo es: "+(d1 * Math.PI));
	}
	

	@Override
	public void calcV() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void calcV(double d1) {	
		System.out.println("El volumen de la esfera es: "+((1.33 * Math.PI)*(Math.pow(d1, 3))));
	}

	
}
