package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private int idrol;
	private String descripcion;
	private Set usuarios = new HashSet(0);

	public Rol() {
	}

	public Rol(int idrol) {
		this.idrol = idrol;
	}

	public Rol(int idrol, String descripcion, Set usuarios) {
		this.idrol = idrol;
		this.descripcion = descripcion;
		this.usuarios = usuarios;
	}

	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}
