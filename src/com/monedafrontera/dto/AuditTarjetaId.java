package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * AuditTarjetaId generated by hbm2java
 */
public class AuditTarjetaId implements java.io.Serializable {

	private String numerotarjeta;
	private String bancoemisor;
	private String franquicia;
	private String documento;
	private int limite;
	private Date fechainicio;
	private Date fechafin;
	private String fechavencimiento;
	private String codseguridad;
	private String tarjetahabiente;
	private String direcciontarjetahabiente;
	private String cedulatarjetahabiente;
	private String telefonotarjetahabiente;
	private Date fechamod;
	private String usuariomod;
	private Boolean tac;

	public AuditTarjetaId() {
	}

	public AuditTarjetaId(String numerotarjeta, String bancoemisor, String franquicia, String documento, int limite,
			String fechavencimiento, String codseguridad, String tarjetahabiente, String direcciontarjetahabiente,
			String cedulatarjetahabiente, String telefonotarjetahabiente) {
		this.numerotarjeta = numerotarjeta;
		this.bancoemisor = bancoemisor;
		this.franquicia = franquicia;
		this.documento = documento;
		this.limite = limite;
		this.fechavencimiento = fechavencimiento;
		this.codseguridad = codseguridad;
		this.tarjetahabiente = tarjetahabiente;
		this.direcciontarjetahabiente = direcciontarjetahabiente;
		this.cedulatarjetahabiente = cedulatarjetahabiente;
		this.telefonotarjetahabiente = telefonotarjetahabiente;
	}

	public AuditTarjetaId(String numerotarjeta, String bancoemisor, String franquicia, String documento, int limite,
			Date fechainicio, Date fechafin, String fechavencimiento, String codseguridad, String tarjetahabiente,
			String direcciontarjetahabiente, String cedulatarjetahabiente, String telefonotarjetahabiente,
			Date fechamod, String usuariomod, Boolean tac) {
		this.numerotarjeta = numerotarjeta;
		this.bancoemisor = bancoemisor;
		this.franquicia = franquicia;
		this.documento = documento;
		this.limite = limite;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.fechavencimiento = fechavencimiento;
		this.codseguridad = codseguridad;
		this.tarjetahabiente = tarjetahabiente;
		this.direcciontarjetahabiente = direcciontarjetahabiente;
		this.cedulatarjetahabiente = cedulatarjetahabiente;
		this.telefonotarjetahabiente = telefonotarjetahabiente;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
		this.tac = tac;
	}

	public String getNumerotarjeta() {
		return this.numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getBancoemisor() {
		return this.bancoemisor;
	}

	public void setBancoemisor(String bancoemisor) {
		this.bancoemisor = bancoemisor;
	}

	public String getFranquicia() {
		return this.franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getLimite() {
		return this.limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
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

	public String getFechavencimiento() {
		return this.fechavencimiento;
	}

	public void setFechavencimiento(String fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getCodseguridad() {
		return this.codseguridad;
	}

	public void setCodseguridad(String codseguridad) {
		this.codseguridad = codseguridad;
	}

	public String getTarjetahabiente() {
		return this.tarjetahabiente;
	}

	public void setTarjetahabiente(String tarjetahabiente) {
		this.tarjetahabiente = tarjetahabiente;
	}

	public String getDirecciontarjetahabiente() {
		return this.direcciontarjetahabiente;
	}

	public void setDirecciontarjetahabiente(String direcciontarjetahabiente) {
		this.direcciontarjetahabiente = direcciontarjetahabiente;
	}

	public String getCedulatarjetahabiente() {
		return this.cedulatarjetahabiente;
	}

	public void setCedulatarjetahabiente(String cedulatarjetahabiente) {
		this.cedulatarjetahabiente = cedulatarjetahabiente;
	}

	public String getTelefonotarjetahabiente() {
		return this.telefonotarjetahabiente;
	}

	public void setTelefonotarjetahabiente(String telefonotarjetahabiente) {
		this.telefonotarjetahabiente = telefonotarjetahabiente;
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

	public Boolean getTac() {
		return this.tac;
	}

	public void setTac(Boolean tac) {
		this.tac = tac;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuditTarjetaId))
			return false;
		AuditTarjetaId castOther = (AuditTarjetaId) other;

		return ((this.getNumerotarjeta() == castOther.getNumerotarjeta())
				|| (this.getNumerotarjeta() != null && castOther.getNumerotarjeta() != null
						&& this.getNumerotarjeta().equals(castOther.getNumerotarjeta())))
				&& ((this.getBancoemisor() == castOther.getBancoemisor())
						|| (this.getBancoemisor() != null && castOther.getBancoemisor() != null
								&& this.getBancoemisor().equals(castOther.getBancoemisor())))
				&& ((this.getFranquicia() == castOther.getFranquicia()) || (this.getFranquicia() != null
						&& castOther.getFranquicia() != null && this.getFranquicia().equals(castOther.getFranquicia())))
				&& ((this.getDocumento() == castOther.getDocumento()) || (this.getDocumento() != null
						&& castOther.getDocumento() != null && this.getDocumento().equals(castOther.getDocumento())))
				&& (this.getLimite() == castOther.getLimite())
				&& ((this.getFechainicio() == castOther.getFechainicio())
						|| (this.getFechainicio() != null && castOther.getFechainicio() != null
								&& this.getFechainicio().equals(castOther.getFechainicio())))
				&& ((this.getFechafin() == castOther.getFechafin()) || (this.getFechafin() != null
						&& castOther.getFechafin() != null && this.getFechafin().equals(castOther.getFechafin())))
				&& ((this.getFechavencimiento() == castOther.getFechavencimiento())
						|| (this.getFechavencimiento() != null && castOther.getFechavencimiento() != null
								&& this.getFechavencimiento().equals(castOther.getFechavencimiento())))
				&& ((this.getCodseguridad() == castOther.getCodseguridad())
						|| (this.getCodseguridad() != null && castOther.getCodseguridad() != null
								&& this.getCodseguridad().equals(castOther.getCodseguridad())))
				&& ((this.getTarjetahabiente() == castOther.getTarjetahabiente())
						|| (this.getTarjetahabiente() != null && castOther.getTarjetahabiente() != null
								&& this.getTarjetahabiente().equals(castOther.getTarjetahabiente())))
				&& ((this.getDirecciontarjetahabiente() == castOther.getDirecciontarjetahabiente())
						|| (this.getDirecciontarjetahabiente() != null
								&& castOther.getDirecciontarjetahabiente() != null
								&& this.getDirecciontarjetahabiente().equals(castOther.getDirecciontarjetahabiente())))
				&& ((this.getCedulatarjetahabiente() == castOther.getCedulatarjetahabiente())
						|| (this.getCedulatarjetahabiente() != null && castOther.getCedulatarjetahabiente() != null
								&& this.getCedulatarjetahabiente().equals(castOther.getCedulatarjetahabiente())))
				&& ((this.getTelefonotarjetahabiente() == castOther.getTelefonotarjetahabiente())
						|| (this.getTelefonotarjetahabiente() != null && castOther.getTelefonotarjetahabiente() != null
								&& this.getTelefonotarjetahabiente().equals(castOther.getTelefonotarjetahabiente())))
				&& ((this.getFechamod() == castOther.getFechamod()) || (this.getFechamod() != null
						&& castOther.getFechamod() != null && this.getFechamod().equals(castOther.getFechamod())))
				&& ((this.getUsuariomod() == castOther.getUsuariomod()) || (this.getUsuariomod() != null
						&& castOther.getUsuariomod() != null && this.getUsuariomod().equals(castOther.getUsuariomod())))
				&& ((this.getTac() == castOther.getTac()) || (this.getTac() != null && castOther.getTac() != null
						&& this.getTac().equals(castOther.getTac())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumerotarjeta() == null ? 0 : this.getNumerotarjeta().hashCode());
		result = 37 * result + (getBancoemisor() == null ? 0 : this.getBancoemisor().hashCode());
		result = 37 * result + (getFranquicia() == null ? 0 : this.getFranquicia().hashCode());
		result = 37 * result + (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		result = 37 * result + this.getLimite();
		result = 37 * result + (getFechainicio() == null ? 0 : this.getFechainicio().hashCode());
		result = 37 * result + (getFechafin() == null ? 0 : this.getFechafin().hashCode());
		result = 37 * result + (getFechavencimiento() == null ? 0 : this.getFechavencimiento().hashCode());
		result = 37 * result + (getCodseguridad() == null ? 0 : this.getCodseguridad().hashCode());
		result = 37 * result + (getTarjetahabiente() == null ? 0 : this.getTarjetahabiente().hashCode());
		result = 37 * result
				+ (getDirecciontarjetahabiente() == null ? 0 : this.getDirecciontarjetahabiente().hashCode());
		result = 37 * result + (getCedulatarjetahabiente() == null ? 0 : this.getCedulatarjetahabiente().hashCode());
		result = 37 * result
				+ (getTelefonotarjetahabiente() == null ? 0 : this.getTelefonotarjetahabiente().hashCode());
		result = 37 * result + (getFechamod() == null ? 0 : this.getFechamod().hashCode());
		result = 37 * result + (getUsuariomod() == null ? 0 : this.getUsuariomod().hashCode());
		result = 37 * result + (getTac() == null ? 0 : this.getTac().hashCode());
		return result;
	}

}
