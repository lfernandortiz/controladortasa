package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Bindb generated by hbm2java
 */
public class Bindb implements java.io.Serializable {

	private String bin;
	private String nombrebanco;
	private String pais;
	private String ciudad;
	private String producto;

	public Bindb() {
	}

	public Bindb(String bin) {
		this.bin = bin;
	}

	public Bindb(String bin, String nombrebanco, String pais, String ciudad, String producto) {
		this.bin = bin;
		this.nombrebanco = nombrebanco;
		this.pais = pais;
		this.ciudad = ciudad;
		this.producto = producto;
	}

	public String getBin() {
		return this.bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getNombrebanco() {
		return this.nombrebanco;
	}

	public void setNombrebanco(String nombrebanco) {
		this.nombrebanco = nombrebanco;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProducto() {
		return this.producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

}