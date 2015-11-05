package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Gravamen generated by hbm2java
 */
public class Gravamen implements java.io.Serializable {

	private String codigo;
	private Boolean iva;
	private String nombre;
	private BigDecimal porcentaje;
	private Set gravamenestablecimientos = new HashSet(0);

	public Gravamen() {
	}

	public Gravamen(String codigo) {
		this.codigo = codigo;
	}

	public Gravamen(String codigo, Boolean iva, String nombre, BigDecimal porcentaje, Set gravamenestablecimientos) {
		this.codigo = codigo;
		this.iva = iva;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.gravamenestablecimientos = gravamenestablecimientos;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Boolean getIva() {
		return this.iva;
	}

	public void setIva(Boolean iva) {
		this.iva = iva;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Set getGravamenestablecimientos() {
		return this.gravamenestablecimientos;
	}

	public void setGravamenestablecimientos(Set gravamenestablecimientos) {
		this.gravamenestablecimientos = gravamenestablecimientos;
	}

}
