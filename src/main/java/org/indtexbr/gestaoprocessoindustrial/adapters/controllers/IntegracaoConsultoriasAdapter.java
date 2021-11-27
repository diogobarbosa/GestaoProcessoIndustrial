package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IntegracaoConsultoriasAdapter {

	@Value("${consultorias.assessorias.endpoint}")
	private String consultoriasEndpoint;
	
	@GetMapping("/integracao_consultorias")
	public ResponseEntity<Object[]> obterConsultorias(){
		
		RestTemplate restTemplate = new RestTemplate();
		Object[] response  = restTemplate.getForObject(consultoriasEndpoint, Object[].class);
		return ResponseEntity.ok(response);
	}
}
