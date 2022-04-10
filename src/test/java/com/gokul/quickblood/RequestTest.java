package com.gokul.quickblood;


import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.gokul.quickblood.repo.DonarRepository;

import junit.framework.Assert;





@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RequestTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	@Autowired
	 private DonarRepository repo;
	
	@SuppressWarnings("deprecation")
	@Test
	public void checkresponse() throws URISyntaxException {
		final String baseUrl = "http://localhost:" + port + "/alldonar";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		Assert.assertEquals(true, result.getBody().contains();
		
	}

}
