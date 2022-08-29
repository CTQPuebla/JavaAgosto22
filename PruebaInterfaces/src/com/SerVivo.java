package com;

public abstract class SerVivo {

	String reproducirse;
	String comer;
	String respirar;
	
	public SerVivo() {
		
	}

	public SerVivo(String reproducirse, String comer, String respirar) {
		super();
		this.reproducirse = reproducirse;
		this.comer = comer;
		this.respirar = respirar;
	}

	public String getReproducirse() {
		return reproducirse;
	}

	public void setReproducirse(String reproducirse) {
		this.reproducirse = reproducirse;
	}

	public String getComer() {
		return comer;
	}

	public void setComer(String comer) {
		this.comer = comer;
	}

	public String getRespirar() {
		return respirar;
	}

	public void setRespirar(String respirar) {
		this.respirar = respirar;
	}

	public abstract String comer();
	public abstract String reproducirse();
	public abstract String respirar();
		
	
}
