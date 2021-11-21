package com.mycart.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NseDtoMoneyArray {
	
	NseDtoMoneyControl nseArray;
		public NseDtoMoneyArray() {
		super();
	}
	@Override
	public String toString() {
		return "NseDtoArray [nseArray=" + nseArray + "]";
	}

	/**
	 * @return the nseArray
	 */
	public NseDtoMoneyControl getNseArray() {
		return nseArray;
	}

	/**
	 * @param nseArray the nseArray to set
	 */
	public void setNseArray(NseDtoMoneyControl nseArray) {
		this.nseArray = nseArray;
	}
	
}
