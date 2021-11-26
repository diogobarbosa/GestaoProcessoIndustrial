package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.VendaDTO;
import org.springframework.http.ResponseEntity;

public interface VendaAdapter{

	public ResponseEntity<Void> inserirVenda(VendaDTO venda);
	
	public ResponseEntity<List<VendaDTO>> consultarVendas();

	public ResponseEntity<VendaDTO> consultarVenda(UUID idVenda);
	
	public ResponseEntity<Void> alterarVenda(VendaDTO venda);
	
	public ResponseEntity<Void> deletarVenda(UUID idVenda);
}
