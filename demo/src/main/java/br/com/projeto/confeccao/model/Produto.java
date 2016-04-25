package br.com.projeto.confeccao.model;

import java.math.BigDecimal;




public class Produto extends GenericModel {


	
	private String descricao;
	private String nome;
	private BigDecimal valorCompra;
	private BigDecimal ValorVende;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}
	public BigDecimal getValorVende() {
		return ValorVende;
	}
	public void setValorVende(BigDecimal valorVende) {
		ValorVende = valorVende;
	}
	
	
}
