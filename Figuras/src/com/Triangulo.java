package com;


public class Triangulo  extends Figuras{

	@Override
	public void calcArea() {
		
	}
	
	@Override
	public void calcArea(double d1, double d2) {
		
		System.out.println("El area del triangulo es: "+((d1*d2)/2));
	}
	

	@Override
	public void calcPerimetro() {

	}
	
	@Override
	public void calcPerimetro(double d1, double d2, double outro) {
		
		System.out.println("El perimetro del triangulo es: "+(d1+d2+outro));

	}
	
	@Override
	public void calcV() {
		
	}
	
	@Override
	public void calcV(double d1, double d2, double outro) {
		
		System.out.println("El volumen del prisma triangular es: "+((d1*d2)/2)*outro);
		
	}


}
