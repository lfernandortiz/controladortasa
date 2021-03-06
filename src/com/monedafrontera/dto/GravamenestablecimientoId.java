package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * GravamenestablecimientoId generated by hbm2java
 */
public class GravamenestablecimientoId implements java.io.Serializable {

	private String codigounico;
	private String gravamen;

	public GravamenestablecimientoId() {
	}

	public GravamenestablecimientoId(String codigounico, String gravamen) {
		this.codigounico = codigounico;
		this.gravamen = gravamen;
	}

	public String getCodigounico() {
		return this.codigounico;
	}

	public void setCodigounico(String codigounico) {
		this.codigounico = codigounico;
	}

	public String getGravamen() {
		return this.gravamen;
	}

	public void setGravamen(String gravamen) {
		this.gravamen = gravamen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GravamenestablecimientoId))
			return false;
		GravamenestablecimientoId castOther = (GravamenestablecimientoId) other;

		return ((this.getCodigounico() == castOther.getCodigounico()) || (this.getCodigounico() != null
				&& castOther.getCodigounico() != null && this.getCodigounico().equals(castOther.getCodigounico())))
				&& ((this.getGravamen() == castOther.getGravamen()) || (this.getGravamen() != null
						&& castOther.getGravamen() != null && this.getGravamen().equals(castOther.getGravamen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodigounico() == null ? 0 : this.getCodigounico().hashCode());
		result = 37 * result + (getGravamen() == null ? 0 : this.getGravamen().hashCode());
		return result;
	}

}
