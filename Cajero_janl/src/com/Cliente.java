package com;

import java.util.List;

public class Cliente {
	String nombre;
	String direecion;
	int edad;
	
	// Coleccion para almacenar objetos de manera dinamica
	
	List<Cuenta>cuentas;
	
	public Cliente(){
		
	}
	public Cliente(String nombre, String direecion, int edad) {
		super();
		this.nombre = nombre;
		this.direecion = direecion;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireecion() {
		return direecion;
	}
	public void setDireecion(String direecion) {
		this.direecion = direecion;
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
		return "Cliente [nombre=" + nombre + ", direecion=" + direecion + ", edad=" + edad + ", cuentas=" + cuentas
				+ "]";
	}
    public double getSaldoTotal() {
    	double total=0;
    	for (int i = 0; i < cuentas.size(); i++) {
			total = total+cuentas.get(i).getSaldoDisponible();
		}
    	return total;
    }

	
}
