package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * PuntoestablecimientoId generated by hbm2java
 */
public class PuntoestablecimientoId implements java.io.Serializable {

	private String codigounico;
	private String codpuntoventa;
	private Date fechainicio;

	public PuntoestablecimientoId() {
	}

	public PuntoestablecimientoId(String codigounico, String codpuntoventa, Date fechainicio) {
		this.codigounico = codigounico;
		this.codpuntoventa = codpuntoventa;
		this.fechainicio = fechainicio;
	}

	public String getCodigounico() {
		return this.codigounico;
	}

	public void setCodigounico(String codigounico) {
		this.codigounico = codigounico;
	}

	public String getCodpuntoventa() {
		return this.codpuntoventa;
	}

	public void setCodpuntoventa(String codpuntoventa) {
		this.codpuntoventa = codpuntoventa;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PuntoestablecimientoId))
			return false;
		PuntoestablecimientoId castOther = (PuntoestablecimientoId) other;

		return ((this.getCodigounico() == castOther.getCodigounico()) || (this.getCodigounico() != null
				&& castOther.getCodigounico() != null && this.getCodigounico().equals(castOther.getCodigounico())))
				&& ((this.getCodpuntoventa() == castOther.getCodpuntoventa())
						|| (this.getCodpuntoventa() != null && castOther.getCodpuntoventa() != null
								&& this.getCodpuntoventa().equals(castOther.getCodpuntoventa())))
				&& ((this.getFechainicio() == castOther.getFechainicio())
						|| (this.getFechainicio() != null && castOther.getFechainicio() != null
								&& this.getFechainicio().equals(castOther.getFechainicio())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodigounico() == null ? 0 : this.getCodigounico().hashCode());
		result = 37 * result + (getCodpuntoventa() == null ? 0 : this.getCodpuntoventa().hashCode());
		result = 37 * result + (getFechainicio() == null ? 0 : this.getFechainicio().hashCode());
		return result;
	}

}
