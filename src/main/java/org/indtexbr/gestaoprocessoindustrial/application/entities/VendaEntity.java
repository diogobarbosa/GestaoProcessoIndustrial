package org.indtexbr.gestaoprocessoindustrial.application.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class VendaEntity {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Type(type="uuid-char")
	@GeneratedValue(generator = "uuid2")
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
