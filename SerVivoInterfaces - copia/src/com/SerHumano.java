package com;

public class SerHumano extends SerVivo implements Nadar, Moverse{

	@Override
	public void moverse() {
		System.out.println("Juan caminado");
		
	}

	@Override
	public void nadar() {
		System.out.println("Juan nadando");
		
	}

	@Override
	public void nombre() {
		System.out.println("Juan");
		
	}

	@Override
	public void peso() {
		System.out.println("Juan pesa");
		
	}

	
	
}
