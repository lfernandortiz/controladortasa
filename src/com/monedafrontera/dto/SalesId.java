package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * SalesId generated by hbm2java
 */
public class SalesId implements java.io.Serializable {

	private Integer year;
	private Integer month;
	private Integer qty;

	public SalesId() {
	}

	public SalesId(Integer year, Integer month, Integer qty) {
		this.year = year;
		this.month = month;
		this.qty = qty;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalesId))
			return false;
		SalesId castOther = (SalesId) other;

		return ((this.getYear() == castOther.getYear()) || (this.getYear() != null && castOther.getYear() != null
				&& this.getYear().equals(castOther.getYear())))
				&& ((this.getMonth() == castOther.getMonth()) || (this.getMonth() != null
						&& castOther.getMonth() != null && this.getMonth().equals(castOther.getMonth())))
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null
						&& this.getQty().equals(castOther.getQty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result + (getMonth() == null ? 0 : this.getMonth().hashCode());
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		return result;
	}

}