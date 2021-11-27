package org.indtexbr.gestaoprocessoindustrial.adapters.mappers;

import org.indtexbr.gestaoprocessoindustrial.adapters.dto.CompraDTO;
import org.indtexbr.gestaoprocessoindustrial.application.entities.CompraEntity;

import io.spring.guides.gs_producing_web_service.Compra;

public class CompraMapper {

	public static CompraEntity compraDTOToCompraEntity(CompraDTO compraDTO) {
		
		CompraEntity compraEntity = new CompraEntity();
		if(compraDTO != null) {
			compraEntity.setIdCompra(compraDTO.getIdCompra());
			compraEntity.setNumeroNotaFiscal(compraDTO.getNumeroNotaFiscal());
			compraEntity.setNomeProduto(compraDTO.getNomeProduto());
			compraEntity.setQuantidadeProduto(compraDTO.getQuantidadeProduto());
			compraEntity.setValorCompra(compraDTO.getValorCompra());
		}
		return compraEntity;
	}
	
	public static CompraEntity compraDTOToCompraEntity(Compra compra) {
		
		CompraEntity compraEntity = new CompraEntity();
		if(compra != null) {
			compraEntity.setNumeroNotaFiscal(compra.getNumeroNotaFiscal());
			compraEntity.setNomeProduto(compra.getNomeProduto());
			compraEntity.setQuantidadeProduto(Long.valueOf(compra.getQuantidadeProduto()));
			compraEntity.setValorCompra(compra.getValorCompra());
		}
		return compraEntity;
	}
	
	public static CompraDTO compraEntityToCompraDTO(CompraEntity compraEntity) {
		
		CompraDTO compraDTO = new CompraDTO();
		if(compraEntity != null) {
			compraDTO.setIdCompra(compraEntity.getIdCompra());
			compraDTO.setNumeroNotaFiscal(compraEntity.getNumeroNotaFiscal());
			compraDTO.setNomeProduto(compraEntity.getNomeProduto());
			compraDTO.setQuantidadeProduto(compraEntity.getQuantidadeProduto());
			compraDTO.setValorCompra(compraEntity.getValorCompra());
		}
		return compraDTO;
	}
}
