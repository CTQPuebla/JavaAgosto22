package com;

public class Humano extends SerVivo implements IComportamientos {
	
	String razonar;
	String bailar;
	String cantar;
	
	public Humano() {
		
	}

	public Humano(String razonar, String bailar, String cantar) {
		super();
		this.razonar = razonar;
		this.bailar = bailar;
		this.cantar = cantar;
	}

	public String getRazonar() {
		return razonar;
	}

	public void setRazonar(String razonar) {
		this.razonar = razonar;
	}

	public String getBailar() {
		return bailar;
	}

	public void setBailar(String bailar) {
		this.bailar = bailar;
	}

	public String getCantar() {
		return cantar;
	}

	public void setCantar(String cantar) {
		this.cantar = cantar;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "el humano come";
	}

	@Override
	public String reproducirse() {
		// TODO Auto-generated method stub
		return ("el humano se reproduce");
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return ("el humano respira");
	}

	@Override
	public void adaptarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sobrevivir(String sobrevivir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sobrevivir() {
		// TODO Auto-generated method stub
		
	}
	
	

}
