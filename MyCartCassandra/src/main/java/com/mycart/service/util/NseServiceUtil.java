package com.mycart.service.util;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mycart.entity.NseDtoArray;
import com.mycart.service.util.niftyindex.CalculatePriceChange;

@Service
public class NseServiceUtil {

	public String calCulateNifty(NseDtoArray neDtoArray) {
		return neDtoArray.getNseArray().stream().map(map -> map.getCmp().replaceAll(",", "")).map(Double::valueOf)
				.collect(Collectors.summarizingDouble(Double::doubleValue)).toString();
	}
	
	public Double calCulateNiftyWithIndexOnly(NseDtoArray neDtoArray) {
		System.out.println(" post construct loaded!!!!");
		return CalculatePriceChange.getPrice(neDtoArray);
	}

}
