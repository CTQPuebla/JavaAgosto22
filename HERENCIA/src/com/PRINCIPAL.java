package com;

public class PRINCIPAL {
public static void main(String[] args) {
	persona p = new persona("Omar",20,"masculino","mexa");
	empleado e = new empleado();
	p.pensar();
	e.pensar();
	p.setEdad(20);
	p.nombre="";
	e.trabajar();
	System.out.println();
	System.out.println(e);
	
	
	
}
}

