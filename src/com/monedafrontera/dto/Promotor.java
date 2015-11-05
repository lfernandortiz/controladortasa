package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Promotor generated by hbm2java
 */
public class Promotor implements java.io.Serializable {

	private String documento;
	private Arrastrador arrastrador;
	private Asesor asesor;
	private Personal personal;
	private BigDecimal comisionviajero;
	private BigDecimal comisionarrastrador;
	private Boolean tac;
	private Set tasabolivarnegociados = new HashSet(0);
	private Set promotorcomisiontxes = new HashSet(0);
	private Set tarjetas = new HashSet(0);
	private Set activacions = new HashSet(0);
	private Set tasadolarpromotorparametros = new HashSet(0);
	private Set tasaeuropromotorparametros = new HashSet(0);
	private Set porcentcomisiontxparampromos = new HashSet(0);
	private Set cuentapromotors = new HashSet(0);
	private Set promotorfranquicias = new HashSet(0);
	private Set envioses = new HashSet(0);
	private Set saldodiariopromotors = new HashSet(0);
	private Set promotortasas = new HashSet(0);

	public Promotor() {
	}

	public Promotor(Personal personal) {
		this.personal = personal;
	}

	public Promotor(Arrastrador arrastrador, Asesor asesor, Personal personal, BigDecimal comisionviajero,
			BigDecimal comisionarrastrador, Boolean tac, Set tasabolivarnegociados, Set promotorcomisiontxes,
			Set tarjetas, Set activacions, Set tasadolarpromotorparametros, Set tasaeuropromotorparametros,
			Set porcentcomisiontxparampromos, Set cuentapromotors, Set promotorfranquicias, Set envioses,
			Set saldodiariopromotors, Set promotortasas) {
		this.arrastrador = arrastrador;
		this.asesor = asesor;
		this.personal = personal;
		this.comisionviajero = comisionviajero;
		this.comisionarrastrador = comisionarrastrador;
		this.tac = tac;
		this.tasabolivarnegociados = tasabolivarnegociados;
		this.promotorcomisiontxes = promotorcomisiontxes;
		this.tarjetas = tarjetas;
		this.activacions = activacions;
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
		this.cuentapromotors = cuentapromotors;
		this.promotorfranquicias = promotorfranquicias;
		this.envioses = envioses;
		this.saldodiariopromotors = saldodiariopromotors;
		this.promotortasas = promotortasas;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Arrastrador getArrastrador() {
		return this.arrastrador;
	}

	public void setArrastrador(Arrastrador arrastrador) {
		this.arrastrador = arrastrador;
	}

	public Asesor getAsesor() {
		return this.asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public BigDecimal getComisionviajero() {
		return this.comisionviajero;
	}

	public void setComisionviajero(BigDecimal comisionviajero) {
		this.comisionviajero = comisionviajero;
	}

	public BigDecimal getComisionarrastrador() {
		return this.comisionarrastrador;
	}

	public void setComisionarrastrador(BigDecimal comisionarrastrador) {
		this.comisionarrastrador = comisionarrastrador;
	}

	public Boolean getTac() {
		return this.tac;
	}

	public void setTac(Boolean tac) {
		this.tac = tac;
	}

	public Set getTasabolivarnegociados() {
		return this.tasabolivarnegociados;
	}

	public void setTasabolivarnegociados(Set tasabolivarnegociados) {
		this.tasabolivarnegociados = tasabolivarnegociados;
	}

	public Set getPromotorcomisiontxes() {
		return this.promotorcomisiontxes;
	}

	public void setPromotorcomisiontxes(Set promotorcomisiontxes) {
		this.promotorcomisiontxes = promotorcomisiontxes;
	}

	public Set getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(Set tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Set getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set activacions) {
		this.activacions = activacions;
	}

	public Set getTasadolarpromotorparametros() {
		return this.tasadolarpromotorparametros;
	}

	public void setTasadolarpromotorparametros(Set tasadolarpromotorparametros) {
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
	}

	public Set getTasaeuropromotorparametros() {
		return this.tasaeuropromotorparametros;
	}

	public void setTasaeuropromotorparametros(Set tasaeuropromotorparametros) {
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
	}

	public Set getPorcentcomisiontxparampromos() {
		return this.porcentcomisiontxparampromos;
	}

	public void setPorcentcomisiontxparampromos(Set porcentcomisiontxparampromos) {
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
	}

	public Set getCuentapromotors() {
		return this.cuentapromotors;
	}

	public void setCuentapromotors(Set cuentapromotors) {
		this.cuentapromotors = cuentapromotors;
	}

	public Set getPromotorfranquicias() {
		return this.promotorfranquicias;
	}

	public void setPromotorfranquicias(Set promotorfranquicias) {
		this.promotorfranquicias = promotorfranquicias;
	}

	public Set getEnvioses() {
		return this.envioses;
	}

	public void setEnvioses(Set envioses) {
		this.envioses = envioses;
	}

	public Set getSaldodiariopromotors() {
		return this.saldodiariopromotors;
	}

	public void setSaldodiariopromotors(Set saldodiariopromotors) {
		this.saldodiariopromotors = saldodiariopromotors;
	}

	public Set getPromotortasas() {
		return this.promotortasas;
	}

	public void setPromotortasas(Set promotortasas) {
		this.promotortasas = promotortasas;
	}

}
