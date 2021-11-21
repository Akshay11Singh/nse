package com.mycart.controller.login;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycart.entity.NseDtoArray;
import com.mycart.entity.NseDtoMoneyArray;
import com.mycart.entity.NseDtoMoneyControl;
import com.mycart.service.util.MoneyControlNiftyIndex;
import com.mycart.service.util.NseServiceUtil;

@RestController
@RequestMapping("/nsecontroller")
public class MoneyControllerNiftyIndex {
	ObjectMapper mapper;
	JSONObject jsonObject;

	@Autowired
	NseDtoMoneyControl nsedto;

	@Autowired
	MoneyControlNiftyIndex nseServiceUtil;

	@Value("${moneyControlNifty}")
	String url;

	@PostMapping(value = "/moneyControlNifty50", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getNse() throws Exception {

		try {
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> data = restTemplate.getForEntity(url, String.class);
			
			System.out.println("Controller start");
			mapper = new ObjectMapper();
		    //mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			System.out.println(data.getBody().toString());
			
		    List<NseDtoMoneyControl> nseDTOList = mapper.readValue(data.getBody().toString(),  new TypeReference<List<NseDtoMoneyControl>>(){});
			System.out.println(nseDTOList.toString());
			  
			return ResponseEntity.ok(mapper.writeValueAsString(nseServiceUtil.calCulateNiftyWithIndexOnlyPercentageChange(nseDTOList)));
			
		} catch (Exception e) {
			System.out.println(e);
		}
		 return ResponseEntity.ok("try after fe minutes");
	}
}
