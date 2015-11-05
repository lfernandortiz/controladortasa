package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * SolicitudtarjetaId generated by hbm2java
 */
public class SolicitudtarjetaId implements java.io.Serializable {

	private int consecutivo;
	private String numerotarjeta;

	public SolicitudtarjetaId() {
	}

	public SolicitudtarjetaId(int consecutivo, String numerotarjeta) {
		this.consecutivo = consecutivo;
		this.numerotarjeta = numerotarjeta;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getNumerotarjeta() {
		return this.numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SolicitudtarjetaId))
			return false;
		SolicitudtarjetaId castOther = (SolicitudtarjetaId) other;

		return (this.getConsecutivo() == castOther.getConsecutivo())
				&& ((this.getNumerotarjeta() == castOther.getNumerotarjeta())
						|| (this.getNumerotarjeta() != null && castOther.getNumerotarjeta() != null
								&& this.getNumerotarjeta().equals(castOther.getNumerotarjeta())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getConsecutivo();
		result = 37 * result + (getNumerotarjeta() == null ? 0 : this.getNumerotarjeta().hashCode());
		return result;
	}

}
