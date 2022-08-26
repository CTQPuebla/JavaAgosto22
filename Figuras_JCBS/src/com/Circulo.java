package com;

public class Circulo extends FBase{
	
	final double pi = 3.1416;
	
	public Circulo(double radio, double diametro) {
		setAlto(radio);
		setLado(diametro);
	}

	public double getPi() {
		return pi;
	}

	@Override
	public double calculaArea(double radio, double diametro) {
		// TODO Auto-generated method stub
		setArea(getPi()*Math.pow(radio, 2));
		return getArea();
	}

	@Override
	public double calculaPerimetro(double radio, double diametro) {
		// TODO Auto-generated method stub
		setArea(diametro*getPi());
		return getArea();
	}
	
	

}
