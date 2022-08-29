package com;

public class Principal 
{
	public static void main(String[] args) 
	{
		Animal a1 = new Animal();
		a1.comer();
		a1.crecer();
		
		Planta p1 = new Planta();
		p1.aroma("lavanda");
		p1.fotosintesis("simon");
		
		SerHumano sh1 = new SerHumano();
		sh1.cantar("pop");
		sh1.crecer();
	}

}
