package com.graphql.demo.graphqldemo.client;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.graphql.demo.graphqldemo.dto.TypeDto;

@Component
public class TypeRestClient {
	private static final Logger logger = Logger.getLogger(TypeRestClient.class.getName());

	@Autowired
	RestTemplate restTemplate;

	public TypeDto getTypeById(Long id) {
		logger.info("Will try to TypeRestClient.getTypeById " + id + " ...");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, Long> map = new LinkedMultiValueMap<String, Long>();
		map.add("id", id);
		HttpEntity<MultiValueMap<String, Long>> request = new HttpEntity<MultiValueMap<String, Long>>(map, headers);
		logger.info("远程调用传递参数:" + request);
		ResponseEntity<String> response = restTemplate.getForEntity("http://127.0.0.1:8099/type/" + String.valueOf(id),
				String.class);
		logger.info("远程调用传递参数:" + response.getBody());

//		JSONObject jsonObj = new JSONObject();
//		try {
//			jsonObj.put("id",id);
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//		HttpEntity<String> entity = new HttpEntity<>(jsonObj.toString(), headers);
//		ResponseEntity<JSONObject> exchange = restTemplate.exchange("http://127.0.0.1:8099/type/",HttpMethod.POST, entity, JSONObject.class);
//		logger.info("远程调用传递参数:" + exchange.getBody());

		// 将json映射为TypeDto
		// TypeDto typeDto = JSON.parseObject(response.getBody(), TypeDto.class);
		Gson gson = new Gson();
		TypeDto typeDto = gson.fromJson(response.getBody(), TypeDto.class);

		return typeDto;
	}

}
