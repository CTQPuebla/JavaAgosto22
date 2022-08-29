package com;

public class Animal extends SerVivo implements IBranquial, ICarnivoro{

	public Animal() {
		
	}

	

	@Override
	public String Alimentacion(String a) {
		
		return a;
	}

	@Override
	public String Adaptacion(String b) {
		
		return b;
	}

	@Override
	public String Respiracion(String c) {

		return c;
	}



	@Override
	public String Branquial( String branquias) {
		
		return branquias;
	}



	@Override
	public String Carnivoro(String carne) {
		// TODO Auto-generated method stub
		return carne;
	}
}
