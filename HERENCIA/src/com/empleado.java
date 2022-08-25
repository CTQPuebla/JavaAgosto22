package com;

public class empleado extends persona {
	int idempleado;
	String nss;
	double salario;
	
	public empleado() {
		
	}

	public empleado(String nombre, int edad, String sexo, String nacionalidad, int idempleado, String nss,
			double salario) {
		super(nombre, edad, sexo, nacionalidad);
		this.idempleado = idempleado;
		this.nss = nss;
		this.salario = salario;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
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
		return "empleado [idempleado=" + idempleado + ", nss=" + nss + ", salario=" + salario + "]";
	}

public void trabajar() {
	
}
}
