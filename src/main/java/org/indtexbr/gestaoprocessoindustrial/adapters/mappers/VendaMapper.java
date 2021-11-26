package org.indtexbr.gestaoprocessoindustrial.adapters.mappers;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.VendaDTO;
import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;

public class VendaMapper {

	public static VendaEntity vendaDTOToVendaEntity(VendaDTO vendaDTO) {
		
		VendaEntity vendaEntity = new VendaEntity();
		if(vendaDTO != null) {
			vendaEntity.setIdConsultoria(vendaDTO.getIdConsultoria());
			vendaEntity.setNomeConsultoria(vendaDTO.getNomeConsultoria());
			vendaEntity.setCnpjConsultoria(vendaDTO.getCnpjConsultoria());
			vendaEntity.setDataContratacao(vendaDTO.getDataContratacao());
			vendaEntity.setFlagAtiva(vendaDTO.getFlagAtiva());
		}
		return vendaEntity;
	}
	
	public static VendaDTO vendaEntityToVendaDTO(VendaEntity vendaEntity) {
		
		VendaDTO vendaDTO = new VendaDTO();
		if(vendaEntity != null) {
			vendaDTO.setIdConsultoria(vendaEntity.getIdConsultoria());
			vendaDTO.setNomeConsultoria(vendaEntity.getNomeConsultoria());
			vendaDTO.setCnpjConsultoria(vendaEntity.getCnpjConsultoria());
			vendaDTO.setDataContratacao(vendaEntity.getDataContratacao());
			vendaDTO.setFlagAtiva(vendaEntity.getFlagAtiva());
		}
		return vendaDTO;
	}
}
