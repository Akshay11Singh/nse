package com.mycart.service.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mycart.entity.NseDtoArray;
import com.mycart.entity.NseDtoMoneyControl;

@Service
public class MoneyControlNiftyIndex {

	public String calCulateNifty(NseDtoArray neDtoArray) {
		return neDtoArray.getNseArray().stream().map(map -> map.getCmp().replaceAll(",", "")).map(Double::valueOf)
				.collect(Collectors.summarizingDouble(Double::doubleValue)).toString();
	}

	public Double calCulateNiftyWithIndexOnly(List<NseDtoMoneyControl> nseDtoMoneyControl) {
		System.out.println(" post construct loaded!!!!");

		return nseDtoMoneyControl.stream().mapToDouble(mapper -> Double.parseDouble(mapper.getChange())).sum();
	}

	public Map calCulateNiftyWithIndexOnlyPercentageChange(List<NseDtoMoneyControl> nseDtoMoneyControl) {
		System.out.println(" post construct loaded!!!!");

		List list = new ArrayList<>();

		list.add(nseDtoMoneyControl.stream().mapToDouble(mapper -> Double.parseDouble(mapper.getChange())).sum());
		list.add(nseDtoMoneyControl.stream().mapToDouble(mapper -> Double.parseDouble(mapper.getChangeInPercentage()))
				.sum());
		Map map = disburitionOfSectorIndex.apply(nseDtoMoneyControl);

		map.put("test", list.get(0));
		map.put("test1", list.get(1));
		return map;
	}

	Function<List<NseDtoMoneyControl>, Map> disburitionOfSectorIndex = (temp) -> {
		return temp.stream().collect(Collectors.groupingBy(NseDtoMoneyControl::getIndustry,
				Collectors.summingDouble(doubleSum -> Double.valueOf(doubleSum.getChangeInPercentage()))));
	};
}
