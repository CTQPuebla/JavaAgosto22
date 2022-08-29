package com;

public class Empleado extends Persona {
	
	
	int idEmpleaso;
	String nss;
	double salario;
	
	public Empleado() {
		
	}

	public Empleado(int idEmpleaso, String nss, double salario) {
		super();
		this.idEmpleaso = idEmpleaso;
		this.nss = nss;
		this.salario = salario;
	}

	public int getIdEmpleaso() {
		return idEmpleaso;
	}

	public void setIdEmpleaso(int idEmpleaso) {
		this.idEmpleaso = idEmpleaso;
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
		return "Empleado [idEmpleaso=" + idEmpleaso + ", nss=" + nss + ", salario=" + salario + "]";
	}
	
	public void trabajar() {
		
	}

	
}
