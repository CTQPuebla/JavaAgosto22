package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(123456);
		
		Cuenta cuenta1 = new Cuenta("5001", "Debito", 3000.00, 150.00, 20000.00);
		Cuenta cuenta2 = new Cuenta("6001", "Debito", 5000.00, 200.00, 30000.00);
		Cuenta cuenta3 = new Cuenta("7001", "Debito", 2500.00, 100.00, 10000.00);
		Cuenta cuenta4 = new Cuenta("8001", "Debito", 3500.00, 1000.00, 25000.00);
		Cuenta cuenta5 = new Cuenta("9001", "Credito", 10000.00, 3000.00, 50000.00);
		Cuenta cuenta6 = new Cuenta("1001", "Credito", 50000.00, 5000.00, 100000.00);
		
		
		//Registro (creación) de los clientes
		Cliente c1 = new Cliente("Juan", "dir1", "Masculino", 20);
		Cliente c2 = new Cliente("Alma", "dir2", "Femenino", 32);
			
	
		//Imprime al cliente antes de añadirle la lista
		//System.out.println(c1);
		
		//Cuentas del cliente uno
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		
		//Añade la cuenta a la lista
		cuentasUno.add(cuenta2);
		
		//Añade la lista al cliente
		c1.setCuentas(cuentasUno);
		
		//Imprime al cliente despues de añadirle la lista
		//System.out.println(c1);
		
		//Agregar más de una cuenta a un cliente
		List<Cuenta> cuentaDos = new ArrayList<Cuenta>();
		
		//Antes de agregar las cuentas
		//System.out.println(c2);
		
		//Añade la cuenta a la lista
		cuentaDos.add(cuenta1);
		cuentaDos.add(cuenta3);
		cuentaDos.add(cuenta5);
		
		c2.setCuentas(cuentaDos);
		
		//Después de agregar las cuentas
		//System.out.println(c2);
		
		
		
		//Retiros
/*		//1) Primera forma de impressión de resultados
		System.out.println(cajeroUno.retirar(500, cuenta4));
		
		//2) Segunda forma de impressión de resultados
		Ticket t = cajeroUno.retirar(500, cuenta4);
		System.out.println(t);
*/		
		
		//Depósitos
/*		System.out.println(cajeroUno.depositar(5000, cuenta3));
*/		
		
		//Transferencia
/*		System.out.println(cajeroUno.transferencia(3000, cuenta5, cuenta6));
*/		
		
		//Saldo Total
/*		System.out.println("El saldo total es de: "+c2.getSaldoTotal()+" MXN");
*/		
		
	}
}