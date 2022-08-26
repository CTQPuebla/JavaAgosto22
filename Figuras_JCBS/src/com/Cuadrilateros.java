package com;

public class Cuadrilateros extends FBase {
	
	public Cuadrilateros(double lado1, double lado2) {
		setAlto(lado1);
		setLado(lado2);
	}

	@Override
	public double calculaArea(double lado, double alto) {
		// TODO Auto-generated method stub
		setArea(lado*alto);
		return getArea();
	}

	@Override
	public double calculaPerimetro(double lado, double alto) {
		// TODO Auto-generated method stub
		setArea(lado*2 + alto*2);
		return getArea();
	}
	
	

	
}


