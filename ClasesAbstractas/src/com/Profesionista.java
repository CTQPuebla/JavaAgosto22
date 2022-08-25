package com;

//POJO - plain old java object
public abstract class Profesionista {
	
	//
	String campoTrabajo;
	String carrera;
	String nombre;
	int ahosExperiencia;
	
	public Profesionista() {
		
	}

	public Profesionista(String campoTrabajo, String carrera, String nombre, int ahosExperiencia) {
		super();
		this.campoTrabajo = campoTrabajo;
		this.carrera = carrera;
		this.nombre = nombre;
		this.ahosExperiencia = ahosExperiencia;
	}

	public String getCampoTrabajo() {
		return campoTrabajo;
	}

	public void setCampoTrabajo(String campoTrabajo) {
		this.campoTrabajo = campoTrabajo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAhosExperiencia() {
		return ahosExperiencia;
	}

	public void setAhosExperiencia(int ahosExperiencia) {
		this.ahosExperiencia = ahosExperiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [campoTrabajo=" + campoTrabajo + ", carrera=" + carrera + ", nombre=" + nombre
				+ ", ahosExperiencia=" + ahosExperiencia + "]";
	}
	
	//comportamiento abstracto
	public abstract void trabajar();
	

}
