package com;

import java.util.ArrayList;
import java.util.List;

public class PRINCIPAL2 {
	public static void main(String[] args) {

		CajeroPOO_CFFI cajeroUno = new CajeroPOO_CFFI();

		cajeroUno.setIdCAjero(111150);

		Cuenta cuenta1 = new Cuenta("5001", 3000.00, "Debito", 150.00, 20000.00);
		Cuenta cuenta2 = new Cuenta("6001", 5000.00, "Debito", 200.00, 30000.00);
		Cuenta cuenta3 = new Cuenta("7001", 2500.00, "Debito", 100.00, 10000.00);
		Cuenta cuenta4 = new Cuenta("8001", 3500.00, "Debito", 1000.00, 25000.00);
		Cuenta cuenta5 = new Cuenta("9001", 10000.00, "Credito", 3000.00, 50000.00);
		Cuenta cuenta6 = new Cuenta("1001", 50000.00, "Credito", 5000.00, 100000.00);

		// registro delos clientes

		Cliente c1 = new Cliente("juan", "diri", 28, "masculino");
		Cliente c2 = new Cliente("alma", "diri2", 32, "femenino");

		// 1
		// System.out.println(cajeroUno.retirar (500, cuenta4));

		// 2
		// Ticket t = cajeroUno.retirar (10000, cuenta6);
		// System.out.println(t);

		// deposito

		// System.out.println(cajeroUno.depositar(5000, cuenta3));

		// tranferencia

		System.out.println(cajeroUno.transferencia(5000, cuenta5, cuenta6));

		// imprime al cliente antes de añadirle a la lista
		// System.out.println(c1);

		// ceuntas del cliente uno

		List<Cuenta> cuentaUno = new ArrayList<Cuenta>();

		// añade la cuenta a la lista
		cuentaUno.add(cuenta2);

		// añade la lista a la cuenta
		c1.setCuentas(cuentaUno);

		// imprime al cliente despues de anañadirle a la lista
		// System.out.println(c1);

		// agregar mas de una cuenta a un cliente
		List<Cuenta> cuentaDos = new ArrayList<Cuenta>();

		// antes de agregar las cuenta
		System.out.println(c2);

		cuentaDos.add(cuenta1);
		cuentaDos.add(cuenta2);
		cuentaDos.add(cuenta3);

		c2.setCuentas(cuentaDos);

		// despues de agregar la cuenta
		System.out.println(c2);
        // imprime el total del saldo de todas sus ceuntas
		System.out.println(c2.getSaldoTotal());

		
		
		
		
		
		
		
		
		
	}
}
