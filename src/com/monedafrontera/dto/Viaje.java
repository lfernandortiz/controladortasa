package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Viaje generated by hbm2java
 */
public class Viaje implements java.io.Serializable {

	private int consecutivo;
	private Date fechainicio;
	private Date fechafin;
	private Integer cupoinicialviajero;
	private Integer cupoinicialinternet;
	private Integer cupoviajero;
	private Integer cupointernet;
	private String cedulatarjetahabiente;
	private Date fechamod;
	private String usuariomod;
	private Set auditTarjetaviajes = new HashSet(0);
	private Set tarjetaviajes = new HashSet(0);
	private Set activacions = new HashSet(0);

	public Viaje() {
	}

	public Viaje(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Viaje(int consecutivo, Date fechainicio, Date fechafin, Integer cupoinicialviajero,
			Integer cupoinicialinternet, Integer cupoviajero, Integer cupointernet, String cedulatarjetahabiente,
			Date fechamod, String usuariomod, Set auditTarjetaviajes, Set tarjetaviajes, Set activacions) {
		this.consecutivo = consecutivo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.cupoinicialviajero = cupoinicialviajero;
		this.cupoinicialinternet = cupoinicialinternet;
		this.cupoviajero = cupoviajero;
		this.cupointernet = cupointernet;
		this.cedulatarjetahabiente = cedulatarjetahabiente;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
		this.auditTarjetaviajes = auditTarjetaviajes;
		this.tarjetaviajes = tarjetaviajes;
		this.activacions = activacions;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
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

	public Integer getCupoinicialviajero() {
		return this.cupoinicialviajero;
	}

	public void setCupoinicialviajero(Integer cupoinicialviajero) {
		this.cupoinicialviajero = cupoinicialviajero;
	}

	public Integer getCupoinicialinternet() {
		return this.cupoinicialinternet;
	}

	public void setCupoinicialinternet(Integer cupoinicialinternet) {
		this.cupoinicialinternet = cupoinicialinternet;
	}

	public Integer getCupoviajero() {
		return this.cupoviajero;
	}

	public void setCupoviajero(Integer cupoviajero) {
		this.cupoviajero = cupoviajero;
	}

	public Integer getCupointernet() {
		return this.cupointernet;
	}

	public void setCupointernet(Integer cupointernet) {
		this.cupointernet = cupointernet;
	}

	public String getCedulatarjetahabiente() {
		return this.cedulatarjetahabiente;
	}

	public void setCedulatarjetahabiente(String cedulatarjetahabiente) {
		this.cedulatarjetahabiente = cedulatarjetahabiente;
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

	public Set getAuditTarjetaviajes() {
		return this.auditTarjetaviajes;
	}

	public void setAuditTarjetaviajes(Set auditTarjetaviajes) {
		this.auditTarjetaviajes = auditTarjetaviajes;
	}

	public Set getTarjetaviajes() {
		return this.tarjetaviajes;
	}

	public void setTarjetaviajes(Set tarjetaviajes) {
		this.tarjetaviajes = tarjetaviajes;
	}

	public Set getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set activacions) {
		this.activacions = activacions;
	}

}