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
	private VendaRepository consultoriaRepository;
	
	@Override
	public void inserirConsultoria(VendaEntity consultoriaEntity) {
		
		consultoriaRepository.save(consultoriaEntity);
	}

	@Override
	public List<VendaEntity> consultarConsultorias() {
		
		List<VendaEntity> listaConsultoria = new ArrayList<>();
		consultoriaRepository.findAll().forEach(listaConsultoria::add);
		
		return listaConsultoria;
	}
	
	@Override
	public VendaEntity consultarConsultoria(UUID idConsultoria) {
	
		return consultoriaRepository.findById(idConsultoria).orElse(null);
	}

	@Override
	public void alterarConsultoria(VendaEntity consultoriaEntity) {
		
		consultoriaRepository.save(consultoriaEntity);
	}

	@Override
	public void deletarConsultoria(UUID idConsultoria) {
		
		consultoriaRepository.deleteById(idConsultoria);
	}

}
