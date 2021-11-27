package org.indtexbr.gestaoprocessoindustrial.adapters.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.VendaDTO;
import org.indtexbr.gestaoprocessoindustrial.adapters.mappers.VendaMapper;
import org.indtexbr.gestaoprocessoindustrial.ports.VendaPort;
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
public class VendaAdapterImpl implements VendaAdapter{

	@Autowired
	private VendaPort vendaUseCase;
	
	@GetMapping("/vendas")
	public ResponseEntity<List<VendaDTO>> consultarVendas() {

		List<VendaDTO> listaVendaDTO = new ArrayList<VendaDTO>();
		vendaUseCase.consultarVendas().forEach( vendaEntity -> {
						VendaDTO vendaDTO = VendaMapper.vendaEntityToVendaDTO(vendaEntity);
						listaVendaDTO.add(vendaDTO);
					});
		
		return ResponseEntity.ok(listaVendaDTO);
	}
	
	@GetMapping("/vendas/{idVenda}")
	public ResponseEntity<VendaDTO> consultarVenda(@PathVariable UUID idVenda) {

		return ResponseEntity.ok(VendaMapper.vendaEntityToVendaDTO(vendaUseCase.consultarVenda(idVenda)));
	}

	@PostMapping("/vendas")
	public ResponseEntity<Void> inserirVenda(@RequestBody VendaDTO venda) {
		
		vendaUseCase.inserirVenda(VendaMapper.vendaDTOToVendaEntity(venda));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/vendas")
	public ResponseEntity<Void> alterarVenda(@RequestBody VendaDTO venda) {
		vendaUseCase.alterarVenda(VendaMapper.vendaDTOToVendaEntity(venda));
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/vendas/{idVenda}")
	public ResponseEntity<Void> deletarVenda(@PathVariable UUID idVenda) {

		vendaUseCase.deletarVenda(idVenda);
		return  ResponseEntity.noContent().build();
	}
	
}
