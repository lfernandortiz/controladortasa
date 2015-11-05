package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * InventarioId generated by hbm2java
 */
public class InventarioId implements java.io.Serializable {

	private String refproducto;
	private String codigounico;

	public InventarioId() {
	}

	public InventarioId(String refproducto, String codigounico) {
		this.refproducto = refproducto;
		this.codigounico = codigounico;
	}

	public String getRefproducto() {
		return this.refproducto;
	}

	public void setRefproducto(String refproducto) {
		this.refproducto = refproducto;
	}

	public String getCodigounico() {
		return this.codigounico;
	}

	public void setCodigounico(String codigounico) {
		this.codigounico = codigounico;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InventarioId))
			return false;
		InventarioId castOther = (InventarioId) other;

		return ((this.getRefproducto() == castOther.getRefproducto()) || (this.getRefproducto() != null
				&& castOther.getRefproducto() != null && this.getRefproducto().equals(castOther.getRefproducto())))
				&& ((this.getCodigounico() == castOther.getCodigounico())
						|| (this.getCodigounico() != null && castOther.getCodigounico() != null
								&& this.getCodigounico().equals(castOther.getCodigounico())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRefproducto() == null ? 0 : this.getRefproducto().hashCode());
		result = 37 * result + (getCodigounico() == null ? 0 : this.getCodigounico().hashCode());
		return result;
	}

}