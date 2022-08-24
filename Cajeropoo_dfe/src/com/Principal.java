package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdcajero(334555);
		
		Cuenta cuenta1 = new Cuenta("5968", 3000.00, "Debito", 150.00, 20000.00);
		Cuenta cuenta2 = new Cuenta("3456", 5000.00, "Debito", 200.00, 30000.00);
	    Cuenta cuenta3 = new Cuenta("9843", 2500.00, "Debito", 100.00, 10000.00);
	    Cuenta cuenta4 = new Cuenta("2356", 3500.00, "Debito", 1000.00, 25000.00);	
	    Cuenta cuenta5 = new Cuenta("7898", 10000.00, "Credito", 3000.00, 50000.00);
	    Cuenta cuenta6 = new Cuenta("3456", 50000.00, "Credito", 5000.00, 100000.00);
	    
//	    //Registro de los clientes
	    Cliente c1 = new Cliente ("Nicolas", "dir1", 25, "Masculino");
	    Cliente c2 = new Cliente ("Diana", "dir2", 37, "Femenino");
//	    
//	    //Retiro 1
//	   System.out.println(cajeroUno.retirar(567,cuenta4));
//	    //Retiro 2
//	   
//	    Ticket t = cajeroUno.retirar(10000, cuenta6);
//	    System.out.println(t);
	    
	    //Deposito
//	   System.out.println(cajeroUno.depositar(1501, cuenta3));
	    
	   
	   //Transferencia
//	  System.out.println(cajeroUno.tranferencia(5689, cuenta5, cuenta6));
	    
	  
	    //Imprime al cliente antes de añadirle a la lista
	    System.out.println(c1);
	    //Cuentas del cliente uno
	    List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
	    //Añade la cuenta a la lista
	    cuentasUno.add(cuenta2);
	    //Añade la lista al cliente
	    c1.setCuentas(cuentasUno);
	    //Imprime al cliente despues de añadirle la lista
	    System.out.println(c1);
	    
	    //Agregar mas de una cuenta a un cliente
	    List<Cuenta>cuentaDos = new ArrayList<Cuenta>();
	    cuentaDos.add(cuenta1);
	    cuentaDos.add(cuenta3);
	    cuentaDos.add(cuenta5);
	    c2.setCuentas(cuentaDos);
	    
	    //DESPUES DE AGREGAR LAS CUENTAS
	    System.out.println(c2);;
	    //Imprime el total del saldo de todas sus cuentas
	    System.out.println(c2.getSaldoTotal());
	    
	}
	
	
	
	
}
