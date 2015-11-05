package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Deducciones generated by hbm2java
 */
public class Deducciones implements java.io.Serializable {

	private DeduccionesId id;
	private Transaccion transaccion;
	private BigDecimal valor;
	private String tipo;

	public Deducciones() {
	}

	public Deducciones(DeduccionesId id, Transaccion transaccion, String tipo) {
		this.id = id;
		this.transaccion = transaccion;
		this.tipo = tipo;
	}

	public Deducciones(DeduccionesId id, Transaccion transaccion, BigDecimal valor, String tipo) {
		this.id = id;
		this.transaccion = transaccion;
		this.valor = valor;
		this.tipo = tipo;
	}

	public DeduccionesId getId() {
		return this.id;
	}

	public void setId(DeduccionesId id) {
		this.id = id;
	}

	public Transaccion getTransaccion() {
		return this.transaccion;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
