package com;

public class Planta extends SerVivo implements Fotosintesis {

	@Override
	public void nombre() {
		System.out.println("Orquidia");
		
	}

	@Override
	public void peso() {
		System.out.println(34);
		
	}

	@Override
	public void fotosintesis() {
		System.out.println("Soy una planta haciendo fotosintesis");
		
	}
	

}
