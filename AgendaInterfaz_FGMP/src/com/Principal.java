package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
/*		//EJEMPLO DE LISTA 
 
		List<String> lista = new ArrayList<String>();
		
		lista.add("hola");
		lista.add("ayuda");
		lista.add("esto no es");
		lista.add("broma");
		
		//Ver el tamaño de la lista
		System.out.println(lista.size());
		
		//Ver el contenido de la lista
		System.out.println(lista);
		
		//Vaciar la lista
		lista.clear();
		System.out.println(lista.size());
		System.out.println(lista);
		
		//Ver el contenido especifico de un indice de la lista
		System.out.println(lista.get(3));
		
		//Remover un elemento de la lista
		//De manera exacta por el contenido
		lista.remove("broma");
		//Por medio del indice de posicion del elemento
		lista.remove(3);
		
		//Preguntar si en la lista existe un elemento especificado
		System.out.println(lista.contains("broma"));
		
		
		//Diferencia entre una "list" y un "set" es que el "set" no permite valores repetidos
		
*/		
		
		//Los valores que se encuentran dentro de "<>" son, a la izquierda "llaves" y a la derecha "valores asociados" 
		//Las "llaves" no se pueden repetir (su contenido), los "valores asociados" si pueden repetirse sin conflicto
		HashMap<Integer,String> stock = new HashMap<Integer,String>();
		
		//Agregar valores al "HashMap"
		stock.put(100, " Astra, Chevrolet, sedan, 4 puertas\n");
		stock.put(200000, " Corvette, Chevrolet, coupe, 2 puertas\n");
		stock.put(600, " Tsuru, Nissan, sedan, 4 puertas\n");
		stock.put(30000, " Jetta, VW, sedan, 4 puertas\n");
		stock.put(9000000, " XK-220, Jaguar, exotico, 2 puertas\n");
		stock.put(8000000, " F-150, Ferrari, exotico, 2 puertas\n");
		
		System.out.println(stock);
		
		//Si el valor de una llave se repite, esta sobreescribe (actualiza) el valor asociado por el repetido
		
		//Remover un valor del HashMap por medio de la llave
		stock.remove(600);
		//Remover un valor del Hash si el valor coincide con la llave especificada
		stock.remove(200000, " Jetta, VW, sedan, 4 puertas"); //no lo va a borrar ya que no coincide el valor con la llave existente en el HashMap
		
		//Pedir los valores de una llave específica
		System.out.println(stock.get(100));
		
		//Reemplazar el valor de una llave específica 
		stock.replace(30000, " Wrangler, Jeep, 4x4, 4 puertas\n");
		//Reemplazar el valor de una llave si el valor es el especificado
		stock.replace(9000000, " XK-220, Jaguar, exotico, 2 puertas\n", " SLK-300, Mercedes Benz, sedan, 4 puertas\n");
		
		System.out.println(stock);
		
	}

}
