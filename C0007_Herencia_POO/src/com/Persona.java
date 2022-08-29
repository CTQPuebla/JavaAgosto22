package com;

public class Persona {
	// Atributos
	public String nombre;
	private int edad;
	protected String sexo;
	protected String nacionalidad;

	// Constructores
	public Persona() {
	}

	public Persona(String nombre, int edad, String sexo, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
	}

	// Getter & Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad
				+ "]";
	}

	// Metodos propios
	public void caminar() {
	}

	public void hablar() {
	}

	public void pensar() {
	}
}
