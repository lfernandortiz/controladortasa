package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Clasetarjeta generated by hbm2java
 */
public class Clasetarjeta implements java.io.Serializable {

	private ClasetarjetaId id;
	private String nombretipo;
	private Byte diastransaccion;
	private Byte diasdeposito;

	public Clasetarjeta() {
	}

	public Clasetarjeta(ClasetarjetaId id) {
		this.id = id;
	}

	public Clasetarjeta(ClasetarjetaId id, String nombretipo, Byte diastransaccion, Byte diasdeposito) {
		this.id = id;
		this.nombretipo = nombretipo;
		this.diastransaccion = diastransaccion;
		this.diasdeposito = diasdeposito;
	}

	public ClasetarjetaId getId() {
		return this.id;
	}

	public void setId(ClasetarjetaId id) {
		this.id = id;
	}

	public String getNombretipo() {
		return this.nombretipo;
	}

	public void setNombretipo(String nombretipo) {
		this.nombretipo = nombretipo;
	}

	public Byte getDiastransaccion() {
		return this.diastransaccion;
	}

	public void setDiastransaccion(Byte diastransaccion) {
		this.diastransaccion = diastransaccion;
	}

	public Byte getDiasdeposito() {
		return this.diasdeposito;
	}

	public void setDiasdeposito(Byte diasdeposito) {
		this.diasdeposito = diasdeposito;
	}

}
