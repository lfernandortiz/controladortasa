package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Bancobin generated by hbm2java
 */
public class Bancobin implements java.io.Serializable {

	private String bin;
	private String codbanco;

	public Bancobin() {
	}

	public Bancobin(String bin) {
		this.bin = bin;
	}

	public Bancobin(String bin, String codbanco) {
		this.bin = bin;
		this.codbanco = codbanco;
	}

	public String getBin() {
		return this.bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

}
