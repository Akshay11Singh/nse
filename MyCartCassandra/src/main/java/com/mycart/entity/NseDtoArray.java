package com.mycart.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class NseDtoArray {
	
	@JsonProperty("NSE array")
	List <NseDTO> nseArray;

		public NseDtoArray() {
		super();
	}
	@Override
	public String toString() {
		return "NseDtoArray [nseArray=" + nseArray + "]";
	}

	/**
	 * @return the nseArray
	 */
	public List<NseDTO> getNseArray() {
		return nseArray;
	}

	/**
	 * @param nseArray the nseArray to set
	 */
	public void setNseArray(List<NseDTO> nseArray) {
		this.nseArray = nseArray;
	}
	
}
