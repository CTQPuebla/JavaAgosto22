package com;

public class Gerente extends Empleado {

	private final double BONO = 3500.00;
	private final int DIAS_VACACIONES = 20;

	//Constructor
	public Gerente() {
	}

	//Getter
	public double getBONO() {
		return BONO;
	}

	public int getDIAS_VACACIONES() {
		return DIAS_VACACIONES;
	}

	@Override
	public void trabajar(String area) {
		System.out.println("Trabaja en un "+ area);
	}
	
	
	
	

}
