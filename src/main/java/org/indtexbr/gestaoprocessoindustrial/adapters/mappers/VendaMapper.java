package org.indtexbr.gestaoprocessoindustrial.adapters.mappers;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.VendaDTO;
import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;

import io.spring.guides.gs_producing_web_service.Venda;

public class VendaMapper {

	public static VendaEntity vendaDTOToVendaEntity(VendaDTO vendaDTO) {
		
		VendaEntity vendaEntity = new VendaEntity();
		if(vendaDTO != null) {
			vendaEntity.setIdVenda(vendaDTO.getIdVenda());
			vendaEntity.setNumeroNotaFiscal(vendaDTO.getNumeroNotaFiscal());
			vendaEntity.setNomeProduto(vendaDTO.getNomeProduto());
			vendaEntity.setQuantidadeProduto(vendaDTO.getQuantidadeProduto());
			vendaEntity.setValorVenda(vendaDTO.getValorVenda());
		}
		return vendaEntity;
	}
	
	public static VendaEntity compraDTOToCompraEntity(Venda venda) {
		
		VendaEntity vendaEntity = new VendaEntity();
		if(venda != null) {
			vendaEntity.setNumeroNotaFiscal(venda.getNumeroNotaFiscal());
			vendaEntity.setNomeProduto(venda.getNomeProduto());
			vendaEntity.setQuantidadeProduto(Long.valueOf(venda.getQuantidadeProduto()));
			vendaEntity.setValorVenda(venda.getValorVenda());
		}
		return vendaEntity;
	}
	
	public static VendaDTO vendaEntityToVendaDTO(VendaEntity vendaEntity) {
		
		VendaDTO vendaDTO = new VendaDTO();
		if(vendaEntity != null) {
			vendaDTO.setIdVenda(vendaEntity.getIdVenda());
			vendaDTO.setNumeroNotaFiscal(vendaEntity.getNumeroNotaFiscal());
			vendaDTO.setNomeProduto(vendaEntity.getNomeProduto());
			vendaDTO.setQuantidadeProduto(vendaEntity.getQuantidadeProduto());
			vendaDTO.setValorVenda(vendaEntity.getValorVenda());
		}
		return vendaDTO;
	}
}
