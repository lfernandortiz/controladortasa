package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * TasabolivarnegociadoId generated by hbm2java
 */
public class TasabolivarnegociadoId implements java.io.Serializable {

	private Date fecha;
	private String documento;
	private String tipo;

	public TasabolivarnegociadoId() {
	}

	public TasabolivarnegociadoId(Date fecha, String documento, String tipo) {
		this.fecha = fecha;
		this.documento = documento;
		this.tipo = tipo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TasabolivarnegociadoId))
			return false;
		TasabolivarnegociadoId castOther = (TasabolivarnegociadoId) other;

		return ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null && castOther.getFecha() != null
				&& this.getFecha().equals(castOther.getFecha())))
				&& ((this.getDocumento() == castOther.getDocumento()) || (this.getDocumento() != null
						&& castOther.getDocumento() != null && this.getDocumento().equals(castOther.getDocumento())))
				&& ((this.getTipo() == castOther.getTipo()) || (this.getTipo() != null && castOther.getTipo() != null
						&& this.getTipo().equals(castOther.getTipo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result + (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		result = 37 * result + (getTipo() == null ? 0 : this.getTipo().hashCode());
		return result;
	}

}
