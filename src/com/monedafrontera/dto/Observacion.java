package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Observacion generated by hbm2java
 */
public class Observacion implements java.io.Serializable {

	private ObservacionId id;
	private Activacion activacion;
	private String observacion;

	public Observacion() {
	}

	public Observacion(ObservacionId id, Activacion activacion) {
		this.id = id;
		this.activacion = activacion;
	}

	public Observacion(ObservacionId id, Activacion activacion, String observacion) {
		this.id = id;
		this.activacion = activacion;
		this.observacion = observacion;
	}

	public ObservacionId getId() {
		return this.id;
	}

	public void setId(ObservacionId id) {
		this.id = id;
	}

	public Activacion getActivacion() {
		return this.activacion;
	}

	public void setActivacion(Activacion activacion) {
		this.activacion = activacion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
