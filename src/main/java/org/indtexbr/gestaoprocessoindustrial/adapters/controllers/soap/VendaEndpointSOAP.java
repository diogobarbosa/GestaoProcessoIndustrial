package org.indtexbr.gestaoprocessoindustrial.adapters.controllers.soap;

import org.indtexbr.gestaoprocessoindustrial.adapters.mappers.VendaMapper;
import org.indtexbr.gestaoprocessoindustrial.ports.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.InserirVendaRequest;
import io.spring.guides.gs_producing_web_service.InserirVendaResponse;

@Endpoint
public class VendaEndpointSOAP {
	
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	private VendaRepository vendaRepository;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inserirVendaRequest")
	@ResponsePayload
	public InserirVendaResponse getCountry(@RequestPayload InserirVendaRequest request) {
		
		vendaRepository.save(VendaMapper.compraDTOToCompraEntity(request.getVenda()));

		InserirVendaResponse response = new InserirVendaResponse();
		response.setStatus("200");
		response.setMensagem("Venda recebida com sucesso.");

		return response;
	}
}
