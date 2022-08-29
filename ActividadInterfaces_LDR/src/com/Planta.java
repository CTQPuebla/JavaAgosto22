package com;

public class Planta extends SerVivo implements IPlantasMedicinales{

	@Override
	public void crecer() {
		System.out.println("La planta crece.");
	}

	@Override
	public void mover() {
		System.out.println("La planta se mueve.");
		
	}

	@Override
	public void respirar() {
		System.out.println("La planta respira.");
		
	}

	@Override
	public void comer() {
		System.out.println("La planta come.");
		
	}

	@Override
	public void reproducir() {
		System.out.println("La planta se reproduce.");
	}

	@Override
	public void mueren() {
		System.out.println("Todas las plantas mueren.");
		
	}

	@Override
	public void nacen() {
		System.out.println("Todas las plantas nacen.");
		
	}

	@Override
	public String aroma(String plantita) {
		System.out.println("La plantita: " + plantita + " tiene aroma");
		return plantita;
	}

	@Override
	public String fotosintesis(String plantita) {
		System.out.println("La plantita: " + plantita + " hace fotosintesis.");
		return plantita;
	}

	
	

}
