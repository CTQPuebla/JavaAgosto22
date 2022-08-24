package com;

import java.util.Date;

public class CajeroPo_kimg {

	int foliotransaccion;
	int idcajero;
	Date fechatransaccion;

	public CajeroPo_kimg() {

	}

	public CajeroPo_kimg(int foliotransaccion, int idcajero, Date fechatransaccion) {
		super();
		this.foliotransaccion = foliotransaccion;
		this.idcajero = idcajero;
		this.fechatransaccion = fechatransaccion;
	}

	public int getFoliotransaccion() {
		return foliotransaccion;
	}

	public void setFoliotransaccion(int foliotransaccion) {
		this.foliotransaccion = foliotransaccion;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	public Date getFechatransaccion() {
		return fechatransaccion;
	}

	public void setFechatransaccion(Date fechatransaccion) {
		this.fechatransaccion = fechatransaccion;
	}

	@Override
	public String toString() {
		return "CajeroPo [foliotransaccion=" + foliotransaccion + ", idcajero=" + idcajero + ", fechatransaccion="
				+ fechatransaccion + "]";
	}

	// comportamiento propio
	// 50 000
	// 30 000
	// 20 000
	// metodo que genera aleatoriamente un folio de la transaccion
	public int generarfolio() {
		foliotransaccion = (int)(Math.random() * 100);

		return foliotransaccion;
		
	}

	// deposito
	public Ticket depositar(double monto, Cuenta cuenta) {
		// 1 valida que el monto por si solo no se pase del maximo

		if (monto > cuenta.getSaldomax()) {

			return new Ticket("monto por el encima por el maximo permitido");

		} else if (monto + cuenta.getSdisponible() > cuenta.getSaldomax()) {
			return new Ticket("el deposito llevaria por encima del maximo permitido");
		} else {

			cuenta.setSdisponible(monto + cuenta.getSdisponible());
			return new Ticket(this.generarfolio(), new Date(), cuenta.getNcuenta(), cuenta.getSdisponible() - monto,
					cuenta.getSdisponible(), monto);
		}

	}

	// retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		// 1 valida que el saldo disponible sea mayor al monto solicitado
		// 2 valida que el retiro no deje por debajo del minimo a la cuenta
		// 3 retiro

		if (cuenta.getSdisponible() < monto) {
			return new Ticket("sin fondos suficientes");
		} else if (cuenta.getSdisponible() - monto < cuenta.getSaldomin()) {
			return new Ticket("el retiro dejaria por debajo del minimo a la cuenta");
		} else {
			cuenta.setSdisponible(cuenta.getSdisponible() - monto);
			return new Ticket(this.generarfolio(), new Date(), cuenta.getNcuenta(), cuenta.getSdisponible() + monto,
					cuenta.getSdisponible(), monto);
		}

	}

	// transferencia
	public Ticket transferencia(double monto, Cuenta cuentaO, Cuenta cuentad) {

		if (cuentaO.getSdisponible() < monto) {
			return new Ticket("Tas jodido");
		} else if (cuentaO.getSdisponible() - monto < cuentaO.getSaldomin()) {
			return new Ticket("el saldo quedaria por dejabo del minimo");
		} else if (monto > cuentad.getSaldomax()) {
			return new Ticket("te pasas del limite");
		} else if (monto + cuentad.getSdisponible() > cuentad.getSaldomax()) {
			return new Ticket("te llevaria por encima del limite");

		} else {
			cuentaO.setSdisponible(cuentaO.getSdisponible() - monto);
			cuentad.setSdisponible(cuentad.getSdisponible() + monto);

			return new Ticket(this.generarfolio(), new Date(), cuentad.getNcuenta(), cuentaO.getNcuenta(),
					cuentaO.getSdisponible() - monto, cuentaO.getSdisponible(), monto);

		}

	}

}
