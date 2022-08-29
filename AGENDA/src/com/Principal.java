package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {
public static void main(String[] args) {
	/*List<String> lista = new ArrayList<String>();
	lista.add("hola");
	lista.add("ayuda");
	lista.add("vete");
	lista.add("a la");
	lista.add("mierda");
	System.out.println(lista.size());
	System.out.println("Dedicatoria a Daniela "+lista.get(2)+lista.get(3)+lista.get(4));
	System.out.println(lista.get(2));
	lista.clear();
	System.out.println(lista.size());
	System.out.println(lista);
	*/
	HashMap<Integer,String> stock = new HashMap<Integer,String>();
   stock.put(100,"Astra, chevrolet, sedan, puertas");
   stock.put(200, "Covette, chevrolet, coupe, 2 puertas");
   stock.put(600, "Tsuru, nissan, sedan, 4 puertas");
   stock.put(3000,"t500, audi, exotico, 5 puertas");
   System.out.println(stock);
   stock.remove(200);
   System.out.println(stock);
   System.out.println(stock.get(600));
   stock.replace(3000, "f-50, bmw, gala, 2 puertas");
   System.out.println(stock);
   
}

}
