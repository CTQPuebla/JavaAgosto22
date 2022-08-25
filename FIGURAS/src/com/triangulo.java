package com;


public class triangulo extends figurasgeo{

	@Override
	public void area() {
	
	}

	@Override
	public void area(double dato1,double dato2){
		System.out.println("EL AREA DEL TRIANGULO ES:"+(dato1*dato2)/2);
	}
	
	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		
	}
	public void perimetro(double dato1, double dato2, double dato3) {
		System.out.println("EL PERIMETRO DEL TRIANGULO ES: "+ (dato1+dato2+dato3));
		
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		
	}
	
	public void volumen(double dato1, double dato2, double dato3) {
	System.out.println("EL COLJUMEN DE SU POLIGONO ES:"+((dato1*dato2)/2)*dato3);
	}
	
	
	
}
