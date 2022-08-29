package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Instancia de clase que solo aplica herencia
		CalculadoraBasica cb = new CalculadoraBasica();
		
		cb.sumar(2, 6);
		cb.restar(3, 6);
		cb.multiplicar(5, 8);
		
		CalculadoraCientifica cc = new CalculadoraCientifica();
		
		cc.sumar(2, 6);
		cc.restar(3, 6);
		cc.multiplicar(5, 8);
		cc.coseno(20);
		cc.seno(10);
		cc.raiz(20);
		
		
		
		
	}

}
