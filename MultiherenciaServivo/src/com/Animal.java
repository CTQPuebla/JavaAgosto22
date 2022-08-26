package com;

public class Animal extends SerVivo implements ICaminar,ICrecer{
	

	@Override
	public void Crecer() {
		System.out.println("crece alto y ancho");	
		
	}

	@Override
	public void caminar() {
		System.out.println("el animal camina con 4 patas");	
		
	}

	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	
 
 
	
}
