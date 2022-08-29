package com;

public abstract class Calculadora {
	
	
	int numDigitosDisplay;
	int numBotones;
	
	public Calculadora () { 
	}

	public Calculadora(int numDigitosDisplay, int numBotones) {
		super();
		this.numDigitosDisplay = numDigitosDisplay;
		this.numBotones = numBotones;
	}

	public int getNumDigitosDisplay() {
		return numDigitosDisplay;
	}

	public void setNumDigitosDisplay(int numDigitosDisplay) {
		this.numDigitosDisplay = numDigitosDisplay;
	}

	public int getNumBotones() {
		return numBotones;
	}

	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}

	public abstract double sumar (double a, double b);
	public abstract double restar (double a, double b);
	public abstract double multiplicar (double a, double b);
	
	
	
}
