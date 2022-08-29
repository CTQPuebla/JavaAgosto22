package com;

public class Triangulo extends Figura {

	double base;
	double altura;
	
	public Triangulo() {
		
	}



	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public double perimetro() {
		return(base+altura+base); 
		
	}

	@Override
	public double area() {
		return (((base*altura))/2);
		
	}

	@Override
	public double volumen() {
		return ((1/3)*(base*altura));
		
	}
	
	
}
