package com;

public class Gerente extends Empleado{
	
	private final double BONO = 3500.00;
	private final double DIAS_VACACIONES = 20;
	//modificador final 
	
	public Gerente() {
		
		
	}

	public double getBONO() {
		return BONO;
	}

	public double getDIAS_VACACIONES() {
		return DIAS_VACACIONES;
	}

	@Override
	public String toString() {
		return "Gerente [BONO=" + BONO + ", DIAS_VACACIONES=" + DIAS_VACACIONES + "]";
	}
	
	@Override
	public void trabajar(String area) {
		System.out.println("Supervisado: "+area);
	}

}
