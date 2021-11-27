package org.indtexbr.gestaoprocessoindustrial.application.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.CompraEntity;
import org.indtexbr.gestaoprocessoindustrial.ports.CompraPort;
import org.indtexbr.gestaoprocessoindustrial.ports.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraUserCase implements CompraPort{

	@Autowired
	private CompraRepository compraRepository;
	
	@Override
	public void inserirConsultoria(CompraEntity consultoriaEntity) {
		
		compraRepository.save(consultoriaEntity);
	}

	@Override
	public List<CompraEntity> consultarCompras() {
		
		List<CompraEntity> listaCompra = new ArrayList<>();
		compraRepository.findAll().forEach(listaCompra::add);
		
		return listaCompra;
	}
	
	@Override
	public CompraEntity consultarCompra(UUID idCompra) {
	
		return compraRepository.findById(idCompra).orElse(null);
	}

	@Override
	public void alterarCompra(CompraEntity compraEntity) {
		
		compraRepository.save(compraEntity);
	}

	@Override
	public void deletarCompra(UUID idCompra) {
		
		compraRepository.deleteById(idCompra);
	}

}
