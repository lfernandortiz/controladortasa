package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * DetallefacturaId generated by hbm2java
 */
public class DetallefacturaId implements java.io.Serializable {

	private String numfactura;
	private String refproducto;
	private String codigounico;

	public DetallefacturaId() {
	}

	public DetallefacturaId(String numfactura, String refproducto, String codigounico) {
		this.numfactura = numfactura;
		this.refproducto = refproducto;
		this.codigounico = codigounico;
	}

	public String getNumfactura() {
		return this.numfactura;
	}

	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
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
		if (!(other instanceof DetallefacturaId))
			return false;
		DetallefacturaId castOther = (DetallefacturaId) other;

		return ((this.getNumfactura() == castOther.getNumfactura()) || (this.getNumfactura() != null
				&& castOther.getNumfactura() != null && this.getNumfactura().equals(castOther.getNumfactura())))
				&& ((this.getRefproducto() == castOther.getRefproducto())
						|| (this.getRefproducto() != null && castOther.getRefproducto() != null
								&& this.getRefproducto().equals(castOther.getRefproducto())))
				&& ((this.getCodigounico() == castOther.getCodigounico())
						|| (this.getCodigounico() != null && castOther.getCodigounico() != null
								&& this.getCodigounico().equals(castOther.getCodigounico())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumfactura() == null ? 0 : this.getNumfactura().hashCode());
		result = 37 * result + (getRefproducto() == null ? 0 : this.getRefproducto().hashCode());
		result = 37 * result + (getCodigounico() == null ? 0 : this.getCodigounico().hashCode());
		return result;
	}

}