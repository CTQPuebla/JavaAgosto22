package com;

public class Animal extends SerVivo {
	
	String cazar;
	String especie;
	String comunicarse;
	
	public Animal() {
		
	}

	public Animal(String cazar, String especie, String comunicarse) {
		super();
		this.cazar = cazar;
		this.especie = especie;
		this.comunicarse = comunicarse;
	}

	public String getCazar() {
		return cazar;
	}

	public void setCazar(String cazar) {
		this.cazar = cazar;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getComunicarse() {
		return comunicarse;
	}

	public void setComunicarse(String comunicarse) {
		this.comunicarse = comunicarse;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reproducirse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return null;
	}

}
