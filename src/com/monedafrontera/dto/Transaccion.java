package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Transaccion generated by hbm2java
 */
public class Transaccion implements java.io.Serializable {

	private int consecutivo;
	private Establecimiento establecimiento;
	private Tarjeta tarjeta;
	private Date fechatx;
	private String tipotx;
	private BigDecimal valortxpesos;
	private BigDecimal valortxdolares;
	private String numfactura;
	private BigDecimal valorcomision;
	private BigDecimal asesorcomision;
	private BigDecimal arrastradorcomision;
	private BigDecimal establecimientocomision;
	private BigDecimal porcentajecomision;
	private Date fechamod;
	private String usuariomod;
	private String asesor;
	private String promotor;
	private String arrastrador;
	private String digitador;
	private BigDecimal valortxeuros;
	private BigDecimal paridad;
	private Set deduccioneses = new HashSet(0);
	private Set facturas = new HashSet(0);
	private Set bauchers = new HashSet(0);

	public Transaccion() {
	}

	public Transaccion(int consecutivo, Establecimiento establecimiento, Tarjeta tarjeta, Date fechatx) {
		this.consecutivo = consecutivo;
		this.establecimiento = establecimiento;
		this.tarjeta = tarjeta;
		this.fechatx = fechatx;
	}

	public Transaccion(int consecutivo, Establecimiento establecimiento, Tarjeta tarjeta, Date fechatx, String tipotx,
			BigDecimal valortxpesos, BigDecimal valortxdolares, String numfactura, BigDecimal valorcomision,
			BigDecimal asesorcomision, BigDecimal arrastradorcomision, BigDecimal establecimientocomision,
			BigDecimal porcentajecomision, Date fechamod, String usuariomod, String asesor, String promotor,
			String arrastrador, String digitador, BigDecimal valortxeuros, BigDecimal paridad, Set deduccioneses,
			Set facturas, Set bauchers) {
		this.consecutivo = consecutivo;
		this.establecimiento = establecimiento;
		this.tarjeta = tarjeta;
		this.fechatx = fechatx;
		this.tipotx = tipotx;
		this.valortxpesos = valortxpesos;
		this.valortxdolares = valortxdolares;
		this.numfactura = numfactura;
		this.valorcomision = valorcomision;
		this.asesorcomision = asesorcomision;
		this.arrastradorcomision = arrastradorcomision;
		this.establecimientocomision = establecimientocomision;
		this.porcentajecomision = porcentajecomision;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
		this.asesor = asesor;
		this.promotor = promotor;
		this.arrastrador = arrastrador;
		this.digitador = digitador;
		this.valortxeuros = valortxeuros;
		this.paridad = paridad;
		this.deduccioneses = deduccioneses;
		this.facturas = facturas;
		this.bauchers = bauchers;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Date getFechatx() {
		return this.fechatx;
	}

	public void setFechatx(Date fechatx) {
		this.fechatx = fechatx;
	}

	public String getTipotx() {
		return this.tipotx;
	}

	public void setTipotx(String tipotx) {
		this.tipotx = tipotx;
	}

	public BigDecimal getValortxpesos() {
		return this.valortxpesos;
	}

	public void setValortxpesos(BigDecimal valortxpesos) {
		this.valortxpesos = valortxpesos;
	}

	public BigDecimal getValortxdolares() {
		return this.valortxdolares;
	}

	public void setValortxdolares(BigDecimal valortxdolares) {
		this.valortxdolares = valortxdolares;
	}

	public String getNumfactura() {
		return this.numfactura;
	}

	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
	}

	public BigDecimal getValorcomision() {
		return this.valorcomision;
	}

	public void setValorcomision(BigDecimal valorcomision) {
		this.valorcomision = valorcomision;
	}

	public BigDecimal getAsesorcomision() {
		return this.asesorcomision;
	}

	public void setAsesorcomision(BigDecimal asesorcomision) {
		this.asesorcomision = asesorcomision;
	}

	public BigDecimal getArrastradorcomision() {
		return this.arrastradorcomision;
	}

	public void setArrastradorcomision(BigDecimal arrastradorcomision) {
		this.arrastradorcomision = arrastradorcomision;
	}

	public BigDecimal getEstablecimientocomision() {
		return this.establecimientocomision;
	}

	public void setEstablecimientocomision(BigDecimal establecimientocomision) {
		this.establecimientocomision = establecimientocomision;
	}

	public BigDecimal getPorcentajecomision() {
		return this.porcentajecomision;
	}

	public void setPorcentajecomision(BigDecimal porcentajecomision) {
		this.porcentajecomision = porcentajecomision;
	}

	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	public String getUsuariomod() {
		return this.usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}

	public String getAsesor() {
		return this.asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public String getPromotor() {
		return this.promotor;
	}

	public void setPromotor(String promotor) {
		this.promotor = promotor;
	}

	public String getArrastrador() {
		return this.arrastrador;
	}

	public void setArrastrador(String arrastrador) {
		this.arrastrador = arrastrador;
	}

	public String getDigitador() {
		return this.digitador;
	}

	public void setDigitador(String digitador) {
		this.digitador = digitador;
	}

	public BigDecimal getValortxeuros() {
		return this.valortxeuros;
	}

	public void setValortxeuros(BigDecimal valortxeuros) {
		this.valortxeuros = valortxeuros;
	}

	public BigDecimal getParidad() {
		return this.paridad;
	}

	public void setParidad(BigDecimal paridad) {
		this.paridad = paridad;
	}

	public Set getDeduccioneses() {
		return this.deduccioneses;
	}

	public void setDeduccioneses(Set deduccioneses) {
		this.deduccioneses = deduccioneses;
	}

	public Set getFacturas() {
		return this.facturas;
	}

	public void setFacturas(Set facturas) {
		this.facturas = facturas;
	}

	public Set getBauchers() {
		return this.bauchers;
	}

	public void setBauchers(Set bauchers) {
		this.bauchers = bauchers;
	}

}
