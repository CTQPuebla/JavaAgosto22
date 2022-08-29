package com;

public class Empleado extends Persona{
	
	int idEmpleado;
	String nss;
	double salario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String sexo, String nacionalidad, int edad, int idEmpleado, String nss,
			double salario) {
		super(nombre, sexo, nacionalidad, edad);
		this.idEmpleado = idEmpleado;
		this.nss = nss;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nss=" + nss + ", salario=" + salario + "]";
	}
	
	
	//Métodos
	
	public void trabajar(String herramienta) {
		
		System.out.println("Trabajando con: "+herramienta);
		
	}
	
	
	
}
