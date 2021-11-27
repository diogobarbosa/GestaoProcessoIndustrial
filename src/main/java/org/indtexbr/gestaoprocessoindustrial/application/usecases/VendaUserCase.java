package org.indtexbr.gestaoprocessoindustrial.application.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;
import org.indtexbr.gestaoprocessoindustrial.ports.VendaPort;
import org.indtexbr.gestaoprocessoindustrial.ports.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendaUserCase implements VendaPort{

	@Autowired
	private VendaRepository vendaRepository;
	
	@Override
	public void inserirVenda(VendaEntity vendaEntity) {
		
		vendaRepository.save(vendaEntity);
	}

	@Override
	public List<VendaEntity> consultarVendas() {
		
		List<VendaEntity> listaVenda = new ArrayList<>();
		vendaRepository.findAll().forEach(listaVenda::add);
		
		return listaVenda;
	}
	
	@Override
	public VendaEntity consultarVenda(UUID idVenda) {
	
		return vendaRepository.findById(idVenda).orElse(null);
	}

	@Override
	public void alterarVenda(VendaEntity vendaEntity) {
		
		vendaRepository.save(vendaEntity);
	}

	@Override
	public void deletarVenda(UUID idVenda) {
		
		vendaRepository.deleteById(idVenda);
	}

}
