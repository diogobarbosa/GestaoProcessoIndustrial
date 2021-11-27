package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IntegracaoNormasAdapter {

	@Value("${gestao.normas.endpoint}")
	private String normasEndpoint;
	
	@GetMapping("/integracao_normas")
	public ResponseEntity<Object[]> obterNormas(){
		
		RestTemplate restTemplate = new RestTemplate();
		Object[] response  = restTemplate.getForObject(normasEndpoint, Object[].class);
		return ResponseEntity.ok(response);
	}
}
