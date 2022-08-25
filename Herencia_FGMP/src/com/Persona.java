package com;

public class Persona {
	
	//Atributos
	public String nombre;
	private int edad;
	String nacionalidad;
	protected String sexo;
	
	public Persona() {
		
	}

	public Persona(String nombre, String sexo, String nacionalidad, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad + ", edad=" + edad
				+ "]";
	}
	
	
	public void caminar() {
		
	}
	
	public void hablar() {
		
	}
	
	public void pensar() {
		
	}
	
	
	
}
