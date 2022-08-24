package com;


import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		
		CajeroPo_kimg cajerouno = new CajeroPo_kimg();
		cajerouno.setIdcajero(111150);
		
		Cuenta cuenta1 = new Cuenta("5001", 3000.00, "Debito", 150.00, 20000.00);
		Cuenta cuenta2 = new Cuenta("6001", 5000.00, "Debito", 200.00, 30000.00);
		Cuenta cuenta3 = new Cuenta("7001", 2500.00, "Debito", 100.00, 10000.00);
		Cuenta cuenta4 = new Cuenta("8001", 3500.00, "Debito", 1000.00, 25000.00);
	    Cuenta cuenta5 = new Cuenta("9001", 10000.00, "Credito", 3000.00, 50000.00);
        Cuenta cuenta6 = new Cuenta("1001", 50000.00, "Credito", 5000.00, 100000.00);
		
//        //Registro de los clientes
		Cliente c1 = new Cliente("juan", "dir1", 20, "Masculino");														
		Cliente c2 = new Cliente("Alma", "dir2", 32, "Femenino ");
//		
//		System.out.println(cajerouno.retirar(500, cuenta4));
//		
//		//2 
//		Ticket t = cajerouno.retirar(10000, cuenta6);
//		System.out.println(t);
        
        //deposito
//        System.out.println(cajerouno.depositar(5000, cuenta3));
        
        //tranferencia
        cajerouno.transferencia(5000, cuenta5, cuenta6);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//imprime al cliente antes de añadirle la lista 
//		System.out.println(c1);
		//cuentas de cliente uno
		List<Cuenta> cuentasUno = new ArrayList<Cuenta>();
		//Añade la cuenta a la lista
		cuentasUno.add(cuenta2);
		//Añade la lista al cliente
	    c1.setCuentas(cuentasUno);
//	    System.out.println(c1);
	    
	    //imprime al cliente despues de añadirle la lista
	    System.out.println(c2);
	    
	    //agregar mas de una cuenta a un cliente
	    List<Cuenta> cuentasdos = new ArrayList<Cuenta>();
	    
	    cuentasdos.add(cuenta1);
	    cuentasdos.add(cuenta2);
	    cuentasdos.add(cuenta3);
	    
	    c2.setCuentas(cuentasdos);
	    
	    //despues de agregar las cuentas 
	    System.out.println(c2);
	    //imprime el total del saldo de todas sus cuentas
	    System.out.println(c2.getSaldototal()); 
	    
	    
	    
	    
	    
	    
	}

}
