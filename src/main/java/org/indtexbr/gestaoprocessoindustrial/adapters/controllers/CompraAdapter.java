package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.CompraDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface CompraAdapter{

	public ResponseEntity<Void> inserirCompra(CompraDTO compra);
	
	public ResponseEntity<List<CompraDTO>> consultarCompras();

	public ResponseEntity<CompraDTO> consultarCompra(UUID idCompra);
	
	public ResponseEntity<Void> alterarCompra(@PathVariable UUID idCompra, CompraDTO compra);
	
	public ResponseEntity<Void> deletarCompra(UUID idCompra);
}
