package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Porcentajebancopais generated by hbm2java
 */
public class Porcentajebancopais implements java.io.Serializable {

	private PorcentajebancopaisId id;
	private Short porcentajeCliente;
	private Short porcentajeOficina;

	public Porcentajebancopais() {
	}

	public Porcentajebancopais(PorcentajebancopaisId id) {
		this.id = id;
	}

	public Porcentajebancopais(PorcentajebancopaisId id, Short porcentajeCliente, Short porcentajeOficina) {
		this.id = id;
		this.porcentajeCliente = porcentajeCliente;
		this.porcentajeOficina = porcentajeOficina;
	}

	public PorcentajebancopaisId getId() {
		return this.id;
	}

	public void setId(PorcentajebancopaisId id) {
		this.id = id;
	}

	public Short getPorcentajeCliente() {
		return this.porcentajeCliente;
	}

	public void setPorcentajeCliente(Short porcentajeCliente) {
		this.porcentajeCliente = porcentajeCliente;
	}

	public Short getPorcentajeOficina() {
		return this.porcentajeOficina;
	}

	public void setPorcentajeOficina(Short porcentajeOficina) {
		this.porcentajeOficina = porcentajeOficina;
	}

}
