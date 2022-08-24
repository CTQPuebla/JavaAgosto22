package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

//		Cajero t = new Cajero();
//		Cuenta cuenta1 = new Cuenta();
//		cuenta1.setNumeroCuenta("456789");
//		cuenta1.setSaldoDisponible(123);
//		cuenta1.setSaldoMax(10000);
//		Cuenta cuenta2 = new Cuenta();
//		cuenta2.setNumeroCuenta("456789a");
//		cuenta2.setSaldoDisponible(123);
//		cuenta2.setSaldoMin(0);
//		t.trasnferir(100, cuenta1, cuenta2);
//		System.out.println(cuenta1);
//		System.out.println(cuenta2);
		
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(1111150);
		
		Cuenta cuenta1 = new Cuenta("159159", 0003000, "debito", 150, 20000);
		Cuenta cuenta2 = new Cuenta("123123", 0005000, "debito", 200, 30000);
		Cuenta cuenta3 = new Cuenta("987987", 0002500, "debito", 100, 100000);
		Cuenta cuenta4 = new Cuenta("963963", 0003500, "debito", 1000, 250000);
		Cuenta cuenta5 = new Cuenta("741741", 1000000, "credito", 3000, 500000);
		Cuenta cuenta6 = new Cuenta("154154", 5000000, "credito", 5000, 100000);
		
		Cliente c1 = new Cliente("Alex", "dir1", 20);
		Cliente c2 = new Cliente("Alma", "dir2", 32);
		
		
		//System.out.println(cajeroUno.retirar(501, cuenta4));
		
		
		
	      Ticket t = cajeroUno.retirar(1000, cuenta6);
		//System.out.println(t);
		
	//	System.out.println(cajeroUno.depositar(2, cuenta3));
		
		//cajeroUno.depositar(10000000, cuenta3);
		// cuentas del cliente uno
		
		//imprime al cliente antes de añadir la lista 
		//System.out.println(c1);
		
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		
		// añade la cuenta a la lista
		cuentasUno.add(cuenta2);
		// añade a la lista del cliente
		c1.setCuentas(cuentasUno);
		
		// imprime al cliente despues de añadir la lista
		
		//System.out.println(c1);
		
		//agregar mas de na cuanta a un cliente
		List<Cuenta> cuentaDos= new ArrayList<Cuenta>();
		
		
		// imprimir antes de agregar las cuentas
		//System.out.println(c2);
		
		cuentaDos.add(cuenta1);
		cuentaDos.add(cuenta3);
		cuentaDos.add(cuenta5);
		
		c2.setCuentas(cuentaDos);
		//imprimir despues de agregar las cuentas
		//System.out.println(c2);

		
		System.out.println(cajeroUno.trasnferir(10, cuenta1, cuenta2));
		
		//System.out.println(c2.getSaldoTotal());
		
		}
	


}

/*
 * auto a1 = new auto();
 * 
 * a1.setModelo("modelo 1"); a1.setCosto(23.8); a1.setMarca("marca1");
 * 
 * 
 * 
 * Motor m1 = new Motor(6,150,200,"v"); a1.setMotor(m1); //instancia de un auto
 * con todos los parametros auto a2 = new auto("m2", 4, "ACME", 900.50, m1,
 * "basica", "manual"); System.out.println(a2);
 * 
 * System.out.println(a2);//imprimir antes de avanzar a2.avanzar(30);
 * System.out.println(a2);// imprimir despues
 */