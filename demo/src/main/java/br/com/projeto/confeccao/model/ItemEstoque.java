package br.com.projeto.confeccao.model;

public class ItemEstoque extends GenericModel {
	

	private Produto produto;
	private Long quantidade;
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
