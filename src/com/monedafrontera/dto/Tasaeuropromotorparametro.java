package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Tasaeuropromotorparametro generated by hbm2java
 */
public class Tasaeuropromotorparametro implements java.io.Serializable {

	private int consecutivo;
	private Banco banco;
	private Establecimiento establecimiento;
	private Franquicia franquicia;
	private Pais pais;
	private Promotor promotor;
	private String tipocupo;
	private BigDecimal tasaeuro;
	private Date fechainicio;
	private Date fechafin;

	public Tasaeuropromotorparametro() {
	}

	public Tasaeuropromotorparametro(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Tasaeuropromotorparametro(int consecutivo, Banco banco, Establecimiento establecimiento,
			Franquicia franquicia, Pais pais, Promotor promotor, String tipocupo, BigDecimal tasaeuro, Date fechainicio,
			Date fechafin) {
		this.consecutivo = consecutivo;
		this.banco = banco;
		this.establecimiento = establecimiento;
		this.franquicia = franquicia;
		this.pais = pais;
		this.promotor = promotor;
		this.tipocupo = tipocupo;
		this.tasaeuro = tasaeuro;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Franquicia getFranquicia() {
		return this.franquicia;
	}

	public void setFranquicia(Franquicia franquicia) {
		this.franquicia = franquicia;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public String getTipocupo() {
		return this.tipocupo;
	}

	public void setTipocupo(String tipocupo) {
		this.tipocupo = tipocupo;
	}

	public BigDecimal getTasaeuro() {
		return this.tasaeuro;
	}

	public void setTasaeuro(BigDecimal tasaeuro) {
		this.tasaeuro = tasaeuro;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

}
