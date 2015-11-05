package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cuentapromotor generated by hbm2java
 */
public class Cuentapromotor implements java.io.Serializable {

	private CuentapromotorId id;
	private Banco banco;
	private Promotor promotor;
	private String nombre;
	private Set transferencias = new HashSet(0);

	public Cuentapromotor() {
	}

	public Cuentapromotor(CuentapromotorId id, Banco banco, Promotor promotor) {
		this.id = id;
		this.banco = banco;
		this.promotor = promotor;
	}

	public Cuentapromotor(CuentapromotorId id, Banco banco, Promotor promotor, String nombre, Set transferencias) {
		this.id = id;
		this.banco = banco;
		this.promotor = promotor;
		this.nombre = nombre;
		this.transferencias = transferencias;
	}

	public CuentapromotorId getId() {
		return this.id;
	}

	public void setId(CuentapromotorId id) {
		this.id = id;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getTransferencias() {
		return this.transferencias;
	}

	public void setTransferencias(Set transferencias) {
		this.transferencias = transferencias;
	}

}