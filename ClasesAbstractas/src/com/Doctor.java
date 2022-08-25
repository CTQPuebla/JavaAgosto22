package com;

public class Doctor extends Profesionista {

	String especialidad;
	String area;
	
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}


	public Doctor(String especialidad, String area) {
		super();
		this.especialidad = especialidad;
		this.area = area;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Doctor [especialidad=" + especialidad + ", area=" + area + "]";
	}


	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("consultas,cirujias,diagnostico,analisis,curaciones");
		
	}
	

	
}
