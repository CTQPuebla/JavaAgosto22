package com;

public class Gerente extends Empleado {

	private final double BONO = 3500;
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
	public void trabajar(String herramienta) {
		System.out.println("suervisando con :"+herramienta);
	}
}
