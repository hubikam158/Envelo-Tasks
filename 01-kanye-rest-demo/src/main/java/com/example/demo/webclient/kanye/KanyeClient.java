package com.example.demo.webclient.kanye;

import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.KanyeEntity;

public class KanyeClient {

	private static final String KANYE_URL = "https://api.kanye.rest";
	private RestTemplate restTemplate = new RestTemplate();
	
	public KanyeEntity getKanyeQuote() {
		return restTemplate.getForObject(KANYE_URL, KanyeEntity.class);
	}
}
