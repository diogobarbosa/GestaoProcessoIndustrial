package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.CompraDTO;
import org.springframework.http.ResponseEntity;

public interface CompraAdapter{

	public ResponseEntity<Void> inserirCompra(CompraDTO compra);
	
	public ResponseEntity<List<CompraDTO>> consultarCompras();

	public ResponseEntity<CompraDTO> consultarCompra(UUID idCompra);
	
	public ResponseEntity<Void> alterarCompra(CompraDTO compra);
	
	public ResponseEntity<Void> deletarCompra(UUID idCompra);
}
