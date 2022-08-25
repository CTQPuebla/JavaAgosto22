package com;

public class Gerente extends Empleado{
	
	private final double BONO = 3500.00; 
	private final int DIAS_VACACIONES = 20; 
	
	//El modificador final declara constantes, los protege de la sobreescritura 
	
	public Gerente() {
		
	}

	public double getBONO() {
		return BONO;
	}

	public int getDIAS_VACACIONES() {
		return DIAS_VACACIONES;
	}
	
	@Override
	public void trabajar(String herramienta) {
		System.out.println("Trabajando con: "+herramienta);
	}
	
	
	
}
