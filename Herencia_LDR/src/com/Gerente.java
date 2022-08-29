package com;

public class Gerente extends Empleado
{

	private final double BONO = 3500.00;
	private final int DIAS_VACACIONES = 20;
	
	public Gerente() {
		
	}

	public double getBONO() {
		return BONO;
	}

	public int getDIAS_VACACIONES() {
		return DIAS_VACACIONES;
	}

	@Override
	public String toString() {
		return "Gerente [BONO=" + BONO + ", DIAS_VACACIONES=" + DIAS_VACACIONES + "]";
	}
	
	//METODOS PROPIOS
	
	//Sobrecarga de metodos: donde este metodo originalmente
	//viene de la clase EMPLEADO, pero como GERENTE tambien
	//lo cocupará con sus propios atributos entonces se debe 
	//un override, para redifinir mi meotodo. El metodo original
	//NO lleva el override.
	@Override
	public void trabajar(String area) {
		System.out.println("Supervisando con: " + area);
	}

}
