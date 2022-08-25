package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(111150);
		
		Cuenta cuenta1 = new Cuenta("5001", 3000.00, "Debito", 150.00, 20000.00);
		Cuenta cuenta2= new Cuenta("6001", 5000.00, "Debito", 200.00, 30000.00);
		Cuenta cuenta3 = new Cuenta("7001", 2000.00, "Debito", 100.00, 10000.00);
		Cuenta cuenta4 = new Cuenta("8001", 3500.00, "Debito", 1000.00, 25000.00);
		Cuenta cuenta5 = new Cuenta("9001", 10000.00, "Credito", 3000.00, 50000.00);
		Cuenta cuenta6 = new Cuenta("1001", 50000.00, "Credito", 5000.00, 100000.00);
		
		//registro (creacion)de los clientes
		Cliente cliente1 = new Cliente("Juan", "Dir1", 20, "Masculino");
		Cliente cliente2 = new Cliente("Alma", "Dir2", 32, "Femenino");
		
		//1
		//System.out.println(cajeroUno.retirar(500, cuenta6));
		
		//2
		//Ticket t = cajeroUno.retirar(10000, cuenta6);
		//System.out.println(t);
		
		//deposito
		//System.out.println(cajeroUno.depositar(5000, cuenta3));
		
		
		
		//tranferencia
		System.out.println(cajeroUno.transferencia(500, cuenta5, cuenta6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//imprime al cliente antes de anadir la lista
			//System.out.println(cliente1);
		//cuenta del cliente uno
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		//anade la cuenta a la lista 
		cuentasUno.add(cuenta2);
		//anade la lista al cliente
		cliente1.setCuentas(cuentasUno);
		//imprime al cliente despues de anadirle la lista
			//System.out.println(cliente1);
		
		System.out.println(cliente2);
		//agregar mas de una cuenta a un cliente
		List<Cuenta>cuentasDos = new ArrayList<Cuenta>();
		
		cuentasDos.add(cuenta1);
		cuentasDos.add(cuenta3);
		cuentasDos.add(cuenta5);
		
		cliente2.setCuentas(cuentasDos);
		
		//despues de agragr las cuentas
		System.out.println(cliente2);
		System.out.println(cliente2.getSaldoTotal());
	}
}
