package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
//		List<String> lista = new ArrayList<String>();
//		
//		//Añadir elementos a la lista
//		
//		lista.add("hola");
//		lista.add("help me");
//		lista.add("hola");
//		lista.add("help me");
//		lista.add("hola");
//		lista.add("help me");
//		
////		//Ver su tamaño
//		System.out.println(lista.size());
////		
////		//Vaciar la lista
////		lista.clear();
//		
//		//Pedirle un elemento especifico a la lista 
//		System.out.println(lista.get(2));
//		
//		//Antes de eliminar---Estado de la lista
//		System.out.println("Antes de aliminar"+lista);
//		
//		//Remover un elemento de la lista
////		lista.remove(1);
//		lista.remove("help me");
//		
//		//Pregunta a la lista si contiene un elemento especifico
//		System.out.println(lista.contains("help me"));
//		
//		//Imprimir el contenido de la lista
//		System.out.println(lista);
//
//		//

//---------------------------------------------------------------------------------------------
	//Conjunto
		HashMap<Integer, String> stock = new HashMap<Integer, String>();
		
		stock.put(100, "Chi mi amor??");
		stock.put(200, "Chale mi amorcito??");
		stock.put(300, "Chaleco m1 amorsote??");
		stock.put(400, "Chanclas mi amortiguar??");
		stock.put(500, "Chutty mi amorir??");
		
//		System.out.println(stock);
		
		
		//Las actualizaciones se realizan mediante el metodo put
		
		
		//ELiminar un elemento del hashmap
//		stock.remove(200);
		
		//Pedirle valores al hashmap
//		System.out.println(stock.get(200));
		stock.replace(300, "Chaleco m1 amorsote??", "Chalequito m2 amorsote??");
		//
	
		
		System.out.println(stock);
//		
	
	}
}
