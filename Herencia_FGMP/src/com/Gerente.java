package com;

public class Gerente extends Empleado {
	
	private final double BONO=3500.00;
	private final int DIAS_VACACIONES=20;
	
	public Gerente(){
		
	}
	
	
	public double getBONO() {
		return BONO;
	}



	public int getDIAS_VACACIONES() {
		return DIAS_VACACIONES;
	}

	
	@Override
	public String toString() {
		return "Gerente [BONO=" + BONO + ", DIAS_VACACIONES=" + DIAS_VACACIONES + "]";
	}


	//Métodos
	
	//Aquí tiene que colocarse el "Override" ya que el método empleado tiene el mismo nombre que otro método existente, sirve para sobrescribir
	@Override
	public void trabajar(String area) {
			System.out.println("Supervisando: "+area);
	}

}
