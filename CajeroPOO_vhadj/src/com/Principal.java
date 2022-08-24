package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero cajeroUno = new Cajero();
		cajeroUno.setIdCajero(111150);
Cuenta cuenta1 = new Cuenta("5001", 3000.00, "debito", 150.00, 20000.00);
Cuenta cuenta2 = new Cuenta("6001", 5000.00, "debito", 200.00, 30000.00);
Cuenta cuenta3 = new Cuenta("7001", 2500.00, "debito", 100.00, 10000.00);
Cuenta cuenta4 = new Cuenta("8001", 3500.00, "debito", 1000.00, 25000.00);
Cuenta cuenta5 = new Cuenta("9001", 10000.00, "credito", 3000.00, 50000.00);
Cuenta cuenta6 = new Cuenta("1001", 50000.00, "credito", 5000.00, 100000.00);

//creacion de los clientes
Cliente c1 = new Cliente("juan","dir1",20,"Masculino" );
Cliente c2 = new Cliente("alma","dir1",20,"Femenino" );

//1
//System.out.println( cajeroUno.retirar(2501, cuenta4));

//2
//Ticket t = cajeroUno.retirar(10000, cuenta6);
//System.out.println(t);
//deposito
//System.out.println(cajeroUno.depositar(5000, cuenta3));

//tranferencia
System.out.println( cajeroUno.Transferir(7001, cuenta5, cuenta6)) ;









//imprime el cliente antes de añadir a la lista
//System.out.println("c1");
//cuentas del cliente uno

List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
//añade la cuenta a la lista
cuentasUno.add(cuenta2);
//añade la lista al cliente
 
c1.setCuentas(cuentasUno);
 
// imprime el cliente despues de añadirle la lista
//System.out.println(c1);

//agregar mas de una cuenta a un cliente
List<Cuenta> cuentasDos = new ArrayList<Cuenta>();
//antes de agregar a las cuentas
//System.out.println(c2);

cuentasDos.add(cuenta1);
cuentasDos.add(cuenta3);
cuentasDos.add(cuenta5);

c2.setCuentas(cuentasDos);

	}

}
