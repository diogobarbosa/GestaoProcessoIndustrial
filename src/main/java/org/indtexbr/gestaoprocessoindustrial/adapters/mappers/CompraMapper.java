package org.indtexbr.gestaoprocessoindustrial.adapters.mappers;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.CompraDTO;
import org.indtexbr.gestaoprocessoindustrial.application.entities.CompraEntity;

public class CompraMapper {

	public static CompraEntity compraDTOToCompraEntity(CompraDTO compraDTO) {
		
		CompraEntity compraEntity = new CompraEntity();
		if(compraDTO != null) {
			compraEntity.setIdConsultoria(compraDTO.getIdConsultoria());
			compraEntity.setNomeConsultoria(compraDTO.getNomeConsultoria());
			compraEntity.setCnpjConsultoria(compraDTO.getCnpjConsultoria());
			compraEntity.setDataContratacao(compraDTO.getDataContratacao());
			compraEntity.setFlagAtiva(compraDTO.getFlagAtiva());
		}
		return compraEntity;
	}
	
	public static CompraDTO compraEntityToCompraDTO(CompraEntity compraEntity) {
		
		CompraDTO compraDTO = new CompraDTO();
		if(compraEntity != null) {
			compraDTO.setIdConsultoria(compraEntity.getIdConsultoria());
			compraDTO.setNomeConsultoria(compraEntity.getNomeConsultoria());
			compraDTO.setCnpjConsultoria(compraEntity.getCnpjConsultoria());
			compraDTO.setDataContratacao(compraEntity.getDataContratacao());
			compraDTO.setFlagAtiva(compraEntity.getFlagAtiva());
		}
		return compraDTO;
	}
}
