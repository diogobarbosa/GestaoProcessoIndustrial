package org.indtexbr.gestaoprocessoindustrial.adapters.controllers.soap;

import org.indtexbr.gestaoprocessoindustrial.adapters.mappers.CompraMapper;
import org.indtexbr.gestaoprocessoindustrial.ports.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.InserirCompraRequest;
import io.spring.guides.gs_producing_web_service.InserirCompraResponse;

@Endpoint
public class CompraEndpointSOAP {
	
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	private CompraRepository compraRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inserirCompraRequest")
	@ResponsePayload
	public InserirCompraResponse getCountry(@RequestPayload InserirCompraRequest request) {
		
		compraRepository.save(CompraMapper.compraDTOToCompraEntity(request.getCompra()));
		
		InserirCompraResponse response = new InserirCompraResponse();
		response.setStatus("200");
		response.setMensagem("Compra recebida com sucesso.");

		return response;
	}
}
