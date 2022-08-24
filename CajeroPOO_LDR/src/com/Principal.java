package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	
	public static void main(String[] args) {
		


	Cajero cajeroUno = new Cajero(); 
	   
	  Cuenta cuenta1 = new Cuenta("159159", 3000, "debito", 150, 20000); 
	  Cuenta cuenta2 = new Cuenta("123123", 5000, "debito", 200, 30000); 
	  Cuenta cuenta3 = new Cuenta("987987", 2500, "debito", 100, 100000); 
	  Cuenta cuenta4 = new Cuenta("963963", 3500, "debito", 1000, 250000); 
	  Cuenta cuenta5 = new Cuenta("741741", 1000000, "credito", 3000, 500000); 
	  Cuenta cuenta6 = new Cuenta("154154", 5000000, "credito", 5000, 100000); 
	   
	  //Registro(creacion) de los clientes
	  Cliente c1 = new Cliente("Alex", "dir1", 20, "Masculino"); 
	  Cliente c2 = new Cliente("Alma", "dir2", 32, "Femenino"); 
	  
	  //RETIRO
//--------------------------------------------------------------------------
	  //Retirando dinero de la cuenta4
	  //cajeroUno.retirar(2501, cuenta4);
	  //cajeroUno.retirar(3501, cuenta4);
	  
	  //Imprimiendo al objeto
	  //Forma 1:
	//  System.out.println(cajeroUno.retirar(500, cuenta4));
	  
	  //Forma 2:
	//  Ticket t = cajeroUno.retirar(10000, cuenta6);
	//  System.out.println(t);			//un objeto de tipo ticket

	  //DEPOSITO
//-----------------------------------------------------------
	//  cajeroUno.retirar(3501, cuenta3);
	//  System.out.println(cajeroUno.depositar(5000, cuenta3));
	  
	  //TRANSFERENCIA
//-----------------------------------------------------------
	  cajeroUno.trasnferir(7001, cuenta1, cuenta6);
	  //System.out.println(cajeroUno.transferir(7001, cuenta5, cuenta6));
	  //imprime al cliente antes de añadir la lista  
	  //System.out.println(c1); 
	  
	   //cuentas del cliente uno
	  List<Cuenta> cuentasUno = new ArrayList<Cuenta>(); 
	   
	  // añade la cuenta a la lista 
	  cuentasUno.add(cuenta2); 
	  // añade a la lista del cliente 
	  c1.setCuentas(cuentasUno);
	  
	  //Imprime al cliente despues de añadirle la lista
	//  System.out.println(c1);
	  
	  //Agregar mas de una cuenta a un cliente
	  List<Cuenta> cuentasDos = new ArrayList<Cuenta>();
	  //Imprimiendo al cliente antes de agregar las cuentas	
	  //System.out.println(c2);
	  
	  cuentasDos.add(cuenta1);
	  cuentasDos.add(cuenta3);
	  cuentasDos.add(cuenta5);
	  
	  c2.setCuentas(cuentasDos);
	  
	  
	  //Despues de agregar las cuentas
	 // System.out.println(c2);
	  
	  
	  //Imprime el total del saldo de todas sus cuentas
	 System.out.println(c2.getSaldoTotal());
	  System.out.println(c1.getSaldoTotal());
	  
	  
	  
	}
}
