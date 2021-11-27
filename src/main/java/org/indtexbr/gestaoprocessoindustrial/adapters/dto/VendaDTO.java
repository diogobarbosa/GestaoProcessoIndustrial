package org.indtexbr.gestaoprocessoindustrial.adapters.dto;

import java.time.LocalDate;
import java.util.UUID;

public class VendaDTO {

	private UUID idVenda;
	private String numeroNotaFiscal;
	private String nomeProduto;
	private Long quantidadeProduto;
	private String valorVenda;
	
	public UUID getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(UUID idVenda) {
		this.idVenda = idVenda;
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
	public String getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}
