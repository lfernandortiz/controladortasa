package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Bancocol generated by hbm2java
 */
public class Bancocol implements java.io.Serializable {

	private String codbanco;
	private String nombre;
	private Set establecimientos = new HashSet(0);

	public Bancocol() {
	}

	public Bancocol(String codbanco) {
		this.codbanco = codbanco;
	}

	public Bancocol(String codbanco, String nombre, Set establecimientos) {
		this.codbanco = codbanco;
		this.nombre = nombre;
		this.establecimientos = establecimientos;
	}

	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getEstablecimientos() {
		return this.establecimientos;
	}

	public void setEstablecimientos(Set establecimientos) {
		this.establecimientos = establecimientos;
	}

}
