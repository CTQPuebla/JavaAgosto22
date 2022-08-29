package com;

public class Doctor extends Profesionista{
	
	String especialidades;
	String area;
	
	public Doctor() {
		
	}

	public Doctor(String especialidades, String area) {
		super();
		this.especialidades = especialidades;
		this.area = area;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Doctor [especialidades=" + especialidades + ", area=" + area + "]";
	}

	@Override
	public void trabajar() {
		System.out.println("consultas, cirujia, diagnostico, analisis, curaciones");
		
	}
	

}
