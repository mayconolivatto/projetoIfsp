package br.com.projeto.confeccao.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String nome;
	private BigDecimal valorCompra;
	private BigDecimal ValorVende;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
