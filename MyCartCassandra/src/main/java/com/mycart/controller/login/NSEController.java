package com.mycart.controller.login;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycart.entity.NseDTO;
import com.mycart.entity.NseDtoArray;
import com.mycart.service.util.NseServiceUtil;

@RestController
@RequestMapping("/nsecontroller")
public class NSEController {
	ObjectMapper mapper ;
	JSONObject jsonObject;

	@Autowired
	NseDTO nsedto;
	
	@Autowired
	NseServiceUtil nseServiceUtil;
	
	@Value("${nseurl}")
	String url;
	
	@PostMapping(value = "/nse", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getNse() throws Exception {

		try {
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> data = restTemplate.getForEntity(url, String.class);
			
			System.out.println("Controller start");
			mapper = new ObjectMapper();
		    mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			NseDtoArray nseDTOList = mapper.readValue(data.getBody().toString(), NseDtoArray.class);
			System.out.println(nseDTOList.toString());
			  
			return ResponseEntity.ok(mapper.writeValueAsString(nseServiceUtil.calCulateNifty(nseDTOList).toString()));
			
		} catch (Exception e) {
			System.out.println(e);
		}
		 return ResponseEntity.ok("try after fe minutes");
	}
	@PostMapping(value = "/nseindexsum", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getNseIndexSum() throws Exception {

		try {
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> data = restTemplate.getForEntity(url, String.class);
			
			System.out.println("Controller start");
			mapper = new ObjectMapper();
		    mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			NseDtoArray nseDTOList = mapper.readValue(data.getBody().toString(), NseDtoArray.class);
			System.out.println(nseDTOList.toString());
			  
			System.out.println(nseServiceUtil.calCulateNiftyWithIndexOnly(nseDTOList));
			return ResponseEntity.ok(new JSONObject()
					.put("niftyIndexSum", nseServiceUtil.calCulateNiftyWithIndexOnly(nseDTOList))
					.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		 return ResponseEntity.ok("try after few minutes");
	}
	
	/*@PostMapping(value = "/nseindex")
	public ResponseEntity<Object> getNifty50Index(@RequestParam("nifty50Index") String nifty50Index) throws Exception {

		try {
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> data = restTemplate.getForEntity(url, String.class);
			
			System.out.println("Controller start");
			mapper = new ObjectMapper();
		    mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			NseDtoArray nseDTOList = mapper.readValue(data.getBody().toString(), NseDtoArray.class);
			System.out.println(nseDTOList.toString());
			  
			return ResponseEntity.ok(mapper.writeValueAsString(nseServiceUtil.calCulateNiftyWithIndexOnly(nseDTOList)));
			
		} catch (Exception e) {
			System.out.println(e);
		}
		 return ResponseEntity.ok("try after few minutes");
	}*/
}
