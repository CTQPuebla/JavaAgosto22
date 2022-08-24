package com;

public class Auto {

	// Estado
	String modelo;
	int numeroPuertas;
	String marca;
	double costo;
	Motor motor;
	String gama;
	String transmision;

	double velocidadActual=0;
	double distanciaRecorrida = 0;

	// metodo constructor
	public Auto() {
	}

//metodo constructor con todos los parametros
	public Auto(String modelo, int numeroPuertas, String marca, double costo, Motor motor, String gama,
			String transmision) {

		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.marca = marca;
		this.costo = costo;
		this.motor = motor;
		this.gama = gama;
		this.transmision = transmision;
	}

	// constructor
	public Auto(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}

	// Getter & Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
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
		return "Auto [modelo=" + modelo + ", numeroPuertas=" + numeroPuertas + ", marca=" + marca + ", costo=" + costo
				+ ", motor=" + motor + ", gama=" + gama + ", transmision=" + transmision + ", velocidadActual="
				+ velocidadActual + ", distanciaRecorrida=" + distanciaRecorrida + "]";
	}
	
	// comportamiento propiop del objeto
	
	public void avanzar(int segundos) {
		//avanzar
		for (int i = 0; i <=segundos ; i++) {
			this.distanciaRecorrida++;
			this.velocidadActual++;
			
		}
		
	}
	
	public void frenar(int segundos) {
		
		for (int i = 0; i <=segundos; i++) {
			this.velocidadActual--;
			this.distanciaRecorrida=this.distanciaRecorrida + 0.5;
		}
	}

	
	
	
	
	
	
	// comportamineto

	// avanzar
	// frenar
	// reversa
	// encender

	// miembros por default
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
