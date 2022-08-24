package com;

public class Motor {
	
	int numCulindros;
	double caballosFuerza;
	double torque;
	String disposicion;

	public Motor() {
	
	}

	public Motor(int numCulindros, double caballosFuerza, double torque, String disposicion) {
		this.numCulindros = numCulindros;
		this.caballosFuerza = caballosFuerza;
		this.torque = torque;
		this.disposicion = disposicion;
	}

	public int getNumCulindros() {
		return numCulindros;
	}

	public void setNumCulindros(int numCulindros) {
		this.numCulindros = numCulindros;
	}

	public double getCaballosFuerza() {
		return caballosFuerza;
	}

	public void setCaballosFuerza(double caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	public String getDisposicion() {
		return disposicion;
	}

	public void setDisposicion(String disposicion) {
		this.disposicion = disposicion;
	}

	@Override
	public String toString() {
		return "motor [numCulindros=" + numCulindros + ", caballosFuerza=" + caballosFuerza + ", torque=" + torque
				+ ", disposicion=" + disposicion + "]";
	}
	
	

	
	
}
