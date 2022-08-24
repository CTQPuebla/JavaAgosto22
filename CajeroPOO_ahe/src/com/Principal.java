package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		
		
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(111150);
		
		Cuenta cuenta1= new Cuenta("5001", 3000.00, "debito", 150.00, 2000.00);
		Cuenta cuenta2= new Cuenta("6001", 5000.00, "debito", 200.00, 3000.00);
		Cuenta cuenta3= new Cuenta("7001", 2500.00, "debito", 100.00, 10000.00);
		Cuenta cuenta4= new Cuenta("8001", 3500.00, "debito", 1000.00, 25000.00);
		Cuenta cuenta5= new Cuenta("9001", 10000.00, "credito", 3000.00, 50000.00);
		Cuenta cuenta6= new Cuenta("1001", 50000.00, "credito", 5000.00, 100000.00);
		
		Cliente c1 = new Cliente("Juan", "dir1", 20, "masculino");
		Cliente c2 = new Cliente("Alma", "dir2", 32, "femenino");
		
		// retiro 
		// forma 1
//		System.out.println(cajeroUno.retirar(500, cuenta4));
//		
//		//forma 2
//		Ticket t = cajeroUno.retirar(10000, cuenta6);
//		System.out.println(t);
		
		
		//deposito
		//System.out.println(cajeroUno.depositar(5000, cuenta3));
		
		
		
		
		//transferir
		System.out.println(cajeroUno.tranferencia(5000, cuenta5, cuenta6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Imprime al cliente antes de añadirle la lista
		//System.out.println(c1);
		
		//cuentas del cliente uno
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		//Añade la cuenta a la lista 
		cuentasUno.add(cuenta2);
		//Añade la lista al cliente
		c1.setCuentas(cuentasUno);
		
		//imprime al cliente despues de añadirle la lista
		//System.out.println(c1);
		
		System.out.println(c2);
		
		//Agregar mas de una cuenta a un cliente
		List<Cuenta>cuentasDos = new ArrayList<Cuenta>();
		cuentasDos.add(cuenta1);
		cuentasDos.add(cuenta3);
		cuentasDos.add(cuenta5);
		c2.setCuentas(cuentasDos);
		
		//despues de agregar las cuentas
		System.out.println(c2);
		
		
		//imprime el total delsaldo de todas sus cuentas
		System.out.println(c2.getSaldoTotal());
		
		
	}

}
