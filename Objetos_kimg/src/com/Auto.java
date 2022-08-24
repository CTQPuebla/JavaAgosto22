package com;


public class Auto {
	
	//Estado
	String modelo;
	int numpuertas;
	String marca;
	double costo;
	motor motor;    //Modificar
	String gama;
	String transmision;
	double velocidadactual=0;
	double distanciarecorrida = 0;
	
	//Metodo constructor
	public Auto() {
	
	}
      // metodo constructor con todos los parametros
	public Auto(String modelo, int numpuertas, String marca, double costo, motor motor, String gama,
			String transmision) {
		super();
		this.modelo = modelo;
		this.numpuertas = numpuertas;
		this.marca = marca;
		this.costo = costo;
		this.motor = motor;
		this.gama = gama;
		this.transmision = transmision;
	}
	
	public Auto(String modelo, motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	
	//Getter & Setters
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumpuertas() {
		return numpuertas;
	}
	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public motor getMotor() {
		return motor;
	}
	public void setMotor(motor motor) {
		this.motor = motor;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	
	
	
		@Override
		public String toString() {
			return "Auto [modelo=" + modelo + ", numpuertas=" + numpuertas + ", marca=" + marca + ", costo=" + costo
					+ ", motor=" + motor + ", gama=" + gama + ", transmision=" + transmision + ", velocidadactual="
					+ velocidadactual + ", distanciarecorrida=" + distanciarecorrida + "]";
		}
		
public void avanzar(int segundos) {
	
	for (int i = 0; i <=segundos; i++) {
		this.distanciarecorrida++;
	}
}
	
	public void frenar(int segundos) {
		for (int i = 0; i<=segundos; i--) {
			this.velocidadactual--;
			this.distanciarecorrida = this.distanciarecorrida + 0.5;
			
			
		}
	
	}
	
	
	
	
	}
	
	
	
	
	//Comportamiento
	//Avanzar
	//Frenar
	//Reversa
	
	//Miembros por default
	
	


