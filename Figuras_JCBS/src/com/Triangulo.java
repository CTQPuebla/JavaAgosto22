package com;

public class Triangulo extends FBase{
	
	private double lado1;
	private double lado2;
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public Triangulo(double base, double altura, double lado1, double lado2) {
		setAlto(altura);
		setLado(base);
		
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double calculaArea(double base, double altura) {
		// TODO Auto-generated method stub
		
		
		setArea((base*altura)/2);
		
		return getArea();
	}

	@Override
	public double calculaPerimetro(double base, double alto) {
		// TODO Auto-generated method stub

		setPerimetro(base + getLado1() + getLado2());
		
		return getPerimetro();
	}
	
	
	
	
}
