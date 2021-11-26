package org.indtexbr.gestaoprocessoindustrial.ports;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;

public interface VendaPort {

	public void inserirConsultoria(VendaEntity consultoriaEntity);
	public List<VendaEntity> consultarConsultorias();
	public VendaEntity consultarConsultoria(UUID idConsultoria);
	public void alterarConsultoria(VendaEntity consultoriaEntity);
	public void deletarConsultoria(UUID idConsultoria);
}
