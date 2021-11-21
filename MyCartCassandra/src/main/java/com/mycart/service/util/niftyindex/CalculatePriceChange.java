package com.mycart.service.util.niftyindex;

import com.mycart.entity.NseDtoArray;

public class CalculatePriceChange {

	public static Double getPrice(NseDtoArray neDtoArray) {
		
		return neDtoArray.getNseArray().stream().map(map -> map.getPriceChange()).mapToDouble(Double::doubleValue).sum();
	}
}
