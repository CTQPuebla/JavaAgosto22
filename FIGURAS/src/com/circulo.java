package com;
public class circulo extends figurasgeo{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	public void area(double dato1) {
		System.out.println("EL AREA DEL CIRCULO ES: "+(3.14*(dato1/2)));
		
		
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		
	}
	public void perimetro(double dato1) {
	System.out.println("EL PERIMETRO DEL CIRCULO ES: "+(dato1*3.1416));
		
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		
	}
	public void volumen(double dato1, double dato2) {
		System.out.println("EL VOLUMEN DEL CIRCULO ES: "+(dato1*3.1416)*dato2);
		
	}
	
}