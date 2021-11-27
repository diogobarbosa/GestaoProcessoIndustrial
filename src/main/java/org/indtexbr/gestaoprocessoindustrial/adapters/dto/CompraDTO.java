package org.indtexbr.gestaoprocessoindustrial.adapters.dto;

import java.time.LocalDate;
import java.util.UUID;

public class CompraDTO {

	private UUID idCompra;
	private String numeroNotaFiscal;
	private String nomeProduto;
	private Long quantidadeProduto;
	private String valorCompra;
	
	public UUID getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(UUID idCompra) {
		this.idCompra = idCompra;
	}
	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}
	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Long getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(Long quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public String getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
}
