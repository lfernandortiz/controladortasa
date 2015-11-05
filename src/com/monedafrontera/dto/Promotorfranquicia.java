package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Promotorfranquicia generated by hbm2java
 */
public class Promotorfranquicia implements java.io.Serializable {

	private PromotorfranquiciaId id;
	private Franquicia franquicia;
	private Promotor promotor;
	private BigDecimal porcentaje;

	public Promotorfranquicia() {
	}

	public Promotorfranquicia(PromotorfranquiciaId id, Franquicia franquicia, Promotor promotor) {
		this.id = id;
		this.franquicia = franquicia;
		this.promotor = promotor;
	}

	public Promotorfranquicia(PromotorfranquiciaId id, Franquicia franquicia, Promotor promotor,
			BigDecimal porcentaje) {
		this.id = id;
		this.franquicia = franquicia;
		this.promotor = promotor;
		this.porcentaje = porcentaje;
	}

	public PromotorfranquiciaId getId() {
		return this.id;
	}

	public void setId(PromotorfranquiciaId id) {
		this.id = id;
	}

	public Franquicia getFranquicia() {
		return this.franquicia;
	}

	public void setFranquicia(Franquicia franquicia) {
		this.franquicia = franquicia;
	}

	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

}
