package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		// añadir elementos a la lista

//		lista.add("hola");
//		lista.add("ayuda");
//		lista.add("esto no es");
//		lista.add("una broma");
//
//		// ver su tamaño
//		System.out.println(lista.size());
//
//		// vaciar lista
////		lista.clear();
////		System.out.println(lista.size());
//
//		// pedirle unos elementos especificos a la lista
//		System.out.println(lista.get(2));
//
//		// antes de eliminar
//		System.out.println("antes de eliminar : " + lista);
//
//		// remover un elemento de la lista
////		lista.remove(1);
//		lista.remove("una broma");
//
//		// pregunta a la lista si contiene un elemento en especifico
//		lista.contains("ayuda");
//
//		// imprimir el contenido de la lista
//		System.out.println(lista);
//
//		// pregunta a la lista si contiene un elemento en especifico
//		System.out.println(lista.contains("ayuda"));
		
		//----------------------------------------------------------------------
		
		HashMap<Integer,String> stock = new HashMap<Integer,String>();
		
		stock.put(100, "Astra, chevrolet, sedan, 4puertas");
		stock.put(10, "Corvette, chevrolet, coupe, 2puertas");
		stock.put(106, "tsuro, nissan, sedan, 4puertas");
		stock.put(1, "jetta, vw, sedan, 4puertas");
		stock.put(13, "xk-220, jaguar, etzotiko, 2puertas");
		//imprimir
		System.out.println(stock);
		
		//las actualizaciones se realizan mediante el
		
		//eliminar un elemento del hasmap
		stock.remove(100,  "Astra, chevrolet, sedan, 4puertas");
		
		
		//pedir le valores al hashmap
//		System.out.println(stock.get(106));
		
		stock.replace(1 , "f-50, ferrari, etzotiko, 2puertas");
		stock.replace(13,"xk-220, jaguar, etzotiko, 2puertas" , "mercedes");
		
		
		System.out.println(stock);
		
		

	}

}
