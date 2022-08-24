package com;

public class motor {
	
	int ncilindros;
	double hp;
	double torque;
	String disposicion;
	
	public motor() {
	
	}

	public motor(int ncilindros, double hp, double torque, String disposicion) {
		super();
		this.ncilindros = ncilindros;
		this.hp = hp;
		this.torque = torque;
		this.disposicion = disposicion;
	}

	public int getNcilindros() {
		return ncilindros;
	}

	public void setNcilindros(int ncilindros) {
		this.ncilindros = ncilindros;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
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
		return "motor [ncilindros=" + ncilindros + ", hp=" + hp + ", torque=" + torque + ", disposicion=" + disposicion
				+ "]";
	}
	
	
	
	

}
