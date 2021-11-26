package org.indtexbr.gestaoprocessoindustrial.ports;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.CompraEntity;

public interface CompraPort {

	public void inserirConsultoria(CompraEntity compraEntity);
	public List<CompraEntity> consultarCompras();
	public CompraEntity consultarCompra(UUID idCompra);
	public void alterarCompra(CompraEntity compraEntity);
	public void deletarCompra(UUID idCompra);
}
