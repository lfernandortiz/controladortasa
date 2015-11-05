package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Actestado generated by hbm2java
 */
public class Actestado implements java.io.Serializable {

	private String codestado;
	private String descripcion;
	private Set estadoactivacions = new HashSet(0);
	private Set activacions = new HashSet(0);

	public Actestado() {
	}

	public Actestado(String codestado) {
		this.codestado = codestado;
	}

	public Actestado(String codestado, String descripcion, Set estadoactivacions, Set activacions) {
		this.codestado = codestado;
		this.descripcion = descripcion;
		this.estadoactivacions = estadoactivacions;
		this.activacions = activacions;
	}

	public String getCodestado() {
		return this.codestado;
	}

	public void setCodestado(String codestado) {
		this.codestado = codestado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getEstadoactivacions() {
		return this.estadoactivacions;
	}

	public void setEstadoactivacions(Set estadoactivacions) {
		this.estadoactivacions = estadoactivacions;
	}

	public Set getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set activacions) {
		this.activacions = activacions;
	}

}
