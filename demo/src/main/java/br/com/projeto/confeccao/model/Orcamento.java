package br.com.projeto.confeccao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Orcamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
	
	
	@OneToMany(mappedBy = "orcamento", targetEntity = ItemOrcamento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)	
	private List<ItemOrcamento> listaOrcamento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<ItemOrcamento> getListaOrcamento() {
		return listaOrcamento;
	}
	public void setListaOrcamento(List<ItemOrcamento> listaOrcamento) {
		this.listaOrcamento = listaOrcamento;
	}
	
	
	
	

}
