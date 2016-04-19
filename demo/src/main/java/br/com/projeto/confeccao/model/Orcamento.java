package br.com.projeto.confeccao.model;

import java.util.Map;

public class Orcamento {
	
	private Map<Produto,Long> mapProduto;
	private Cliente cliente;
	public Map<Produto, Long> getMapProduto() {
		return mapProduto;
	}
	public void setMapProduto(Map<Produto, Long> mapProduto) {
		this.mapProduto = mapProduto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
