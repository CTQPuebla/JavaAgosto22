package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
	
		Cajero cajeroUnoCajero = new Cajero();
		cajeroUnoCajero.setIdCajero(323432);
		
		Cuenta cuenta1 = new Cuenta("5755379", 3000.00, "Debito", 150.00, 100000.00);
		Cuenta cuenta2 = new Cuenta("746424", 3000.00, "Debito", 200.00, 100000);
		Cuenta cuenta3 = new Cuenta("76523742654", 7000.00, "Debito", 250.00, 100000);
		Cuenta cuenta4 = new Cuenta("785735653", 2000.00, "Debito", 250.00, 100000);
		Cuenta cuenta5 = new Cuenta("7587357653", 10000.00, "Debito", 250.00, 100000);
		Cuenta cuenta6 = new Cuenta("5375733573653", 3800.00, "Credito", 100.00, 100000);
		
		//Registro de transaccion de los clientes
		Cliente c1 = new Cliente("Juan", "dir1", 20, "Masculino");
		Cliente c2 = new Cliente("Alma", "dir2", 32, "Femenino");
		//System.out.println(c1);
//		
        System.out.println(cajeroUnoCajero.retirar(1090, cuenta4));
//		Ticket t = cajeroUnoCajero.retirar(1000, cuenta6);
//		System.out.println(t);
		System.out.println(cajeroUnoCajero.depositar(100, cuenta3));
		
		
		
		//Anade la cuenta  a la lista
		List<Cuenta> cuentasunoCuentas = new ArrayList<Cuenta>();
		cuentasunoCuentas.add(cuenta2);
		//anade la lista al cliente
		c1.setCuentas(cuentasunoCuentas);
		//Impresion del cliente despues de pasarle la lista
		//System.out.println(c1);
		//Anade la cuenta  a la lista
		List<Cuenta> cuentasdosCuentas = new ArrayList<Cuenta>();
		cuentasdosCuentas.add(cuenta1);
		cuentasdosCuentas.add(cuenta3);
		cuentasdosCuentas.add(cuenta5);
		//anade la lista al cliente
		c2.setCuentas(cuentasdosCuentas);
		//System.out.println(c2);
		
		System.out.println(cajeroUnoCajero.transferencia(400, cuenta5, cuenta6));
		
		System.out.println(c2.getSaldoTotal());
	}

}
