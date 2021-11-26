package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.CompraDTO;
import org.indtexbr.gestaoprocessoindustrial.adapters.mappers.CompraMapper;
import org.indtexbr.gestaoprocessoindustrial.ports.CompraPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class CompraAdapterImpl implements CompraAdapter{

	@Autowired
	private CompraPort compraUseCase;
	
	@GetMapping("/consultorias")
	public ResponseEntity<List<CompraDTO>> consultarCompras() {

		List<CompraDTO> listaCompraDTO = new ArrayList<CompraDTO>();
		compraUseCase.consultarCompras().forEach( compraEntity -> {
						CompraDTO compraDTO = CompraMapper.compraEntityToCompraDTO(compraEntity);
						listaCompraDTO.add(compraDTO);
					});
		
		return ResponseEntity.ok(listaCompraDTO);
	}
	
	@GetMapping("/compras/{idCompra}")
	public ResponseEntity<CompraDTO> consultarCompra(@PathVariable UUID idCompra) {

		return ResponseEntity.ok(CompraMapper.compraEntityToCompraDTO(compraUseCase.consultarCompra(idCompra)));
	}

	@PostMapping("/compras")
	public ResponseEntity<Void> inserirCompra(@RequestBody CompraDTO compra) {
		
		compraUseCase.inserirConsultoria(CompraMapper.compraDTOToCompraEntity(compra));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/compras")
	public ResponseEntity<Void> alterarCompra(@RequestBody CompraDTO compra) {
		compraUseCase.alterarCompra(CompraMapper.compraDTOToCompraEntity(compra));
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/compras/{idCompra}")
	public ResponseEntity<Void> deletarCompra(@PathVariable UUID idCompra) {

		compraUseCase.deletarCompra(idCompra);
		return  ResponseEntity.noContent().build();
	}
	
}
