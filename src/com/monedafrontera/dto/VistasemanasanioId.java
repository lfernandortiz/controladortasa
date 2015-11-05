package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * VistasemanasanioId generated by hbm2java
 */
public class VistasemanasanioId implements java.io.Serializable {

	private String numsemana;
	private Date fechaini;
	private Date fechafin;

	public VistasemanasanioId() {
	}

	public VistasemanasanioId(String numsemana, Date fechaini, Date fechafin) {
		this.numsemana = numsemana;
		this.fechaini = fechaini;
		this.fechafin = fechafin;
	}

	public String getNumsemana() {
		return this.numsemana;
	}

	public void setNumsemana(String numsemana) {
		this.numsemana = numsemana;
	}

	public Date getFechaini() {
		return this.fechaini;
	}

	public void setFechaini(Date fechaini) {
		this.fechaini = fechaini;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VistasemanasanioId))
			return false;
		VistasemanasanioId castOther = (VistasemanasanioId) other;

		return ((this.getNumsemana() == castOther.getNumsemana()) || (this.getNumsemana() != null
				&& castOther.getNumsemana() != null && this.getNumsemana().equals(castOther.getNumsemana())))
				&& ((this.getFechaini() == castOther.getFechaini()) || (this.getFechaini() != null
						&& castOther.getFechaini() != null && this.getFechaini().equals(castOther.getFechaini())))
				&& ((this.getFechafin() == castOther.getFechafin()) || (this.getFechafin() != null
						&& castOther.getFechafin() != null && this.getFechafin().equals(castOther.getFechafin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumsemana() == null ? 0 : this.getNumsemana().hashCode());
		result = 37 * result + (getFechaini() == null ? 0 : this.getFechaini().hashCode());
		result = 37 * result + (getFechafin() == null ? 0 : this.getFechafin().hashCode());
		return result;
	}

}
