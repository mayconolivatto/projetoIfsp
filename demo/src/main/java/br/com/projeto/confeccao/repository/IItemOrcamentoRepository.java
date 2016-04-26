package br.com.projeto.confeccao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.confeccao.model.ItemOrcamento;
import br.com.projeto.confeccao.model.Orcamento;

public interface IItemOrcamentoRepository extends JpaRepository<ItemOrcamento, Long>{
	
	List<ItemOrcamento> findByOrcamento(Orcamento orcamento);
	

}
