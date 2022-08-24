package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(111150);

		// Creacion de cuentas
		Cuenta cuenta1 = new Cuenta("5001", 3000.00, "Debito", 150.00, 20000.00);
		Cuenta cuenta2 = new Cuenta("6001", 5000.00, "Debito", 200.00, 30000.00);
		Cuenta cuenta3 = new Cuenta("7001", 2500.00, "Debito", 100.00, 10000.00);
		Cuenta cuenta4 = new Cuenta("8001", 3500.00, "Debito", 1000.00, 25000.00);
		Cuenta cuenta5 = new Cuenta("9001", 10000.00, "Credito", 3000.00, 50000.00);
		Cuenta cuenta6 = new Cuenta("1001", 50000.00, "Credito", 5000.00, 100000.00);

		// Creacion de clientes
		Cliente cliente1 = new Cliente("Juan", "Dir1", 20, "Masculino");
		Cliente cliente2 = new Cliente("Alma", "Dir2", 32, "Femenino");

		Ticket t;
		System.out.println(cuenta6);
		System.out.println("");
		t = cajeroUno.retirar(400, cuenta6);
		System.out.println(t);
		System.out.println("");
		t = cajeroUno.retirar(800, cuenta6);
		System.out.println(t);
		System.out.println("");
		t = cajeroUno.depositar(250, cuenta6);
		System.out.println(t);
		System.out.println("\n*******\n");
		System.out.println(cuenta6);
		System.out.println(cuenta1);
		System.out.println("");
		t = cajeroUno.transferir(5000, cuenta6, cuenta1);
		System.out.println(t);
		System.out.println("");
		System.out.println(cuenta6);
		System.out.println(cuenta1);
		

		// System.out.println(cuenta4);

		// Imprime al cliente antes de añadirle la lista
		// System.out.println(cliente1);

		// Cuentas del cliente 1
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		// Agregar cuentas a la lista
		cuentasUno.add(cuenta6);
		// Asignar la lista de cuentas al cliente 1
		cliente1.setCuentas(cuentasUno);
		// Imprime al cliente despues de añadirle la lista
		// System.out.println(cliente1);

		/// Cuentas del cliente 2
		List<Cuenta> cuentasDos = new ArrayList<Cuenta>();
		cuentasDos.add(cuenta1);
		cuentasDos.add(cuenta3);
		// System.out.println("\n"+cliente2);
		cliente2.setCuentas(cuentasDos);
		// System.out.println(cliente2);
		System.out.println("\nHola " + cliente1.getNombre()+ " el saldo de todas tus cuentas es de: "+cliente1.getSaldoTotal() + " pesos");
	}
}
