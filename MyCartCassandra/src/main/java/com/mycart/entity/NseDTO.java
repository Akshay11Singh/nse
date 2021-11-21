package com.mycart.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class NseDTO {

	@JsonProperty("Company Name (M.Cap)")
	String companyName;
	@JsonProperty("Is it a Right Stock?")
	String isRightStock;
	@JsonProperty("CMP")
	String cmp;
	@JsonProperty("Price Change")
	String priceChange;
	double pchange;
	@JsonProperty("Market Cap (Cr)")
	String marketCap;
	@JsonProperty("52W High")
	String weekHigh;
	@JsonProperty("52W Low")
	String weekLow;
	@JsonProperty("ROE")
	String ROE;
	@JsonProperty("P/E")
	String PE;
	@JsonProperty("P/BV")
	String PBV;
	@JsonProperty("EV/EBITDA")
	String ev;
	
	public NseDTO() {
		super();
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the isRightStock
	 */
	public String getIsRightStock() {
		return isRightStock;
	}
	/**
	 * @param isRightStock the isRightStock to set
	 */
	public void setIsRightStock(String isRightStock) {
		this.isRightStock = isRightStock;
	}
	/**
	 * @return the cmp
	 */
	public String getCmp() {
		return cmp;
	}
	/**
	 * @param cmp the cmp to set
	 */
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	/**
	 * @return the priceChange
	 */
	public Double getPriceChange() {
		return this.pchange;
	}
	/**
	 * @param priceChange the priceChange to set
	 */
	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
		priceChange = this.priceChange.replaceAll("%", "");
		this.pchange = Double.valueOf(priceChange);
	}
	/**
	 * @return the marketCap
	 */
	public String getMarketCap() {
		return marketCap;
	}
	/**
	 * @param marketCap the marketCap to set
	 */
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}
	/**
	 * @return the weekHigh
	 */
	public String getWeekHigh() {
		return weekHigh;
	}
	/**
	 * @param weekHigh the weekHigh to set
	 */
	public void setWeekHigh(String weekHigh) {
		this.weekHigh = weekHigh;
	}
	/**
	 * @return the weekLow
	 */
	public String getWeekLow() {
		return weekLow;
	}
	/**
	 * @param weekLow the weekLow to set
	 */
	public void setWeekLow(String weekLow) {
		this.weekLow = weekLow;
	}
	/**
	 * @return the rOE
	 */
	public String getROE() {
		return ROE;
	}
	/**
	 * @param rOE the rOE to set
	 */
	public void setROE(String rOE) {
		ROE = rOE;
	}
	/**
	 * @return the pE
	 */
	public String getPE() {
		return PE;
	}
	/**
	 * @param pE the pE to set
	 */
	public void setPE(String pE) {
		PE = pE;
	}
	/**
	 * @return the pBV
	 */
	public String getPBV() {
		return PBV;
	}
	/**
	 * @param pBV the pBV to set
	 */
	public void setPBV(String pBV) {
		PBV = pBV;
	}
	/**
	 * @return the ev
	 */
	public String getEv() {
		return ev;
	}
	/**
	 * @param ev the ev to set
	 */
	public void setEv(String ev) {
		this.ev = ev;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NseDTO [companyName=" + companyName + ", isRightStock=" + isRightStock + ", cmp=" + cmp
				+ ", priceChange=" + priceChange + ", marketCap=" + marketCap + ", weekHigh=" + weekHigh + ", weekLow="
				+ weekLow + ", ROE=" + ROE + ", PE=" + PE + ", PBV=" + PBV + ", ev=" + ev + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PBV == null) ? 0 : PBV.hashCode());
		result = prime * result + ((PE == null) ? 0 : PE.hashCode());
		result = prime * result + ((ROE == null) ? 0 : ROE.hashCode());
		result = prime * result + ((cmp == null) ? 0 : cmp.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((ev == null) ? 0 : ev.hashCode());
		result = prime * result + ((isRightStock == null) ? 0 : isRightStock.hashCode());
		result = prime * result + ((marketCap == null) ? 0 : marketCap.hashCode());
		result = prime * result + ((priceChange == null) ? 0 : priceChange.hashCode());
		result = prime * result + ((weekHigh == null) ? 0 : weekHigh.hashCode());
		result = prime * result + ((weekLow == null) ? 0 : weekLow.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NseDTO other = (NseDTO) obj;
		if (PBV == null) {
			if (other.PBV != null)
				return false;
		} else if (!PBV.equals(other.PBV))
			return false;
		if (PE == null) {
			if (other.PE != null)
				return false;
		} else if (!PE.equals(other.PE))
			return false;
		if (ROE == null) {
			if (other.ROE != null)
				return false;
		} else if (!ROE.equals(other.ROE))
			return false;
		if (cmp == null) {
			if (other.cmp != null)
				return false;
		} else if (!cmp.equals(other.cmp))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (ev == null) {
			if (other.ev != null)
				return false;
		} else if (!ev.equals(other.ev))
			return false;
		if (isRightStock == null) {
			if (other.isRightStock != null)
				return false;
		} else if (!isRightStock.equals(other.isRightStock))
			return false;
		if (marketCap == null) {
			if (other.marketCap != null)
				return false;
		} else if (!marketCap.equals(other.marketCap))
			return false;
		if (priceChange == null) {
			if (other.priceChange != null)
				return false;
		} else if (!priceChange.equals(other.priceChange))
			return false;
		if (weekHigh == null) {
			if (other.weekHigh != null)
				return false;
		} else if (!weekHigh.equals(other.weekHigh))
			return false;
		if (weekLow == null) {
			if (other.weekLow != null)
				return false;
		} else if (!weekLow.equals(other.weekLow))
			return false;
		return true;
	}
		
}
