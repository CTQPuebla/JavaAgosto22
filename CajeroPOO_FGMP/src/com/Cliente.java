package com;

import java.util.List;

public class Cliente {
	
	String nombre, direccion, sexo;
	int edad;
	
	//Coleccion para almacenar objetos de manera dinámica
	List<Cuenta> cuentas;
	
	public Cliente(){
		
	}

	public Cliente(String nombre, String direccion, String sexo, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.sexo = sexo;
		this.edad = edad;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", sexo=" + sexo + ", edad=" + edad
				+ ", cuentas=" + cuentas + "]";
	}

	
	
	
	//Método para mostrar el total del saldo disponible entre todas las cuentas
	public double getSaldoTotal() {
		
		double total=0;
		
		for (int i = 0; i < cuentas.size(); i++) {
			total += cuentas.get(i).getSaldoDisponible();
		}
		return total;
	}
	
}
