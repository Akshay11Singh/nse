package com.mycart.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class NseDtoMoneyControl {
	@JsonProperty("Company Name")
	String companyName;
	@JsonProperty("Industry")
	String industry;
	@JsonProperty("LastPrice")
	String lastPrice;
	@JsonProperty("Change")
	String change;
	@JsonProperty("%Chg")
	String changeInPercentage;
	@JsonProperty("Mkt Cap(Rs cr):")
	String mktCap;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NseDtoMoneyControl [companyName=" + companyName + ", industry=" + industry + ", lastPrice=" + lastPrice
				+ ", change=" + change + ", changeInPercentage=" + changeInPercentage + ", mktCap=" + mktCap + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((change == null) ? 0 : change.hashCode());
		result = prime * result + ((changeInPercentage == null) ? 0 : changeInPercentage.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((lastPrice == null) ? 0 : lastPrice.hashCode());
		result = prime * result + ((mktCap == null) ? 0 : mktCap.hashCode());
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
		NseDtoMoneyControl other = (NseDtoMoneyControl) obj;
		if (change == null) {
			if (other.change != null)
				return false;
		} else if (!change.equals(other.change))
			return false;
		if (changeInPercentage == null) {
			if (other.changeInPercentage != null)
				return false;
		} else if (!changeInPercentage.equals(other.changeInPercentage))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (lastPrice == null) {
			if (other.lastPrice != null)
				return false;
		} else if (!lastPrice.equals(other.lastPrice))
			return false;
		if (mktCap == null) {
			if (other.mktCap != null)
				return false;
		} else if (!mktCap.equals(other.mktCap))
			return false;
		return true;
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
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * @return the lastPrice
	 */
	public String getLastPrice() {
		return lastPrice;
	}
	/**
	 * @param lastPrice the lastPrice to set
	 */
	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}
	/**
	 * @return the change
	 */
	public String getChange() {
		return change;
	}
	/**
	 * @param change the change to set
	 */
	public void setChange(String change) {
		this.change = change;
	}
	/**
	 * @return the changeInPercentage
	 */
	public String getChangeInPercentage() {
		return changeInPercentage;
	}
	/**
	 * @param changeInPercentage the changeInPercentage to set
	 */
	public void setChangeInPercentage(String changeInPercentage) {
		this.changeInPercentage = changeInPercentage;
	}
	/**
	 * @return the mktCap
	 */
	public String getMktCap() {
		return mktCap;
	}
	/**
	 * @param mktCap the mktCap to set
	 */
	public void setMktCap(String mktCap) {
		this.mktCap = mktCap;
	}
	
	
}
