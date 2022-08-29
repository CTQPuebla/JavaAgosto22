package com;

public class Planta  extends SerVivo{
	
	String fotosintesis;
	
	public Planta() {
		
	}

	public Planta(String fotosintesis) {
		super();
		this.fotosintesis = fotosintesis;
	}

	public String getFotosintesis() {
		return fotosintesis;
	}

	public void setFotosintesis(String fotosintesis) {
		this.fotosintesis = fotosintesis;
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