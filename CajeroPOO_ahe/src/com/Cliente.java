package com;

import java.util.List;

public class Cliente {
	String nombre;
	String direccion;
	int edad;
	String sexo;
	
	//Coleccion para almacenar de manera dinamica
	List<Cuenta>cuentas;
	
	
	public Cliente() {
		
	}

	public Cliente(String nombre, String direccion, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", sexo=" + sexo
				+ ", cuentas=" + cuentas + "]";
	}
	
	//Devuelve el total del dinero del cliente entre sus cuentas
	public double getSaldoTotal() {
		double total =0;
		for (int i = 0; i < cuentas.size(); i++) {
			
			total = total + cuentas.get(i).getSaldoDisponible();
			
		}
		
		return total;
		
	}


}
