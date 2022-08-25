package com;

public class cuadrado extends figurasgeo{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	public void area(double dato1, double dato2) {
	System.out.println("EL AREA DEL CUADRO ES: "+(dato1*dato2));
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		
	}
	public void perimetro(double dato1) {
		System.out.println("EL PERIMETRO DEL CUADRO ES: "+(dato1*4));
		
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		
	}
	public void volumen(double dato1, double dato2, double dato3) {
		System.out.println("EL VOLUMEN DEL CUBO ES: "+(dato1*dato2*dato3));
		
	}

}
