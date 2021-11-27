package org.indtexbr.gestaoprocessoindustrial.ports;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;

public interface VendaPort {

	public void inserirVenda(VendaEntity vendaEntity);
	public List<VendaEntity> consultarVendas();
	public VendaEntity consultarVenda(UUID idVenda);
	public void alterarVenda(VendaEntity vendaEntity);
	public void deletarVenda(UUID idVenda);
}
