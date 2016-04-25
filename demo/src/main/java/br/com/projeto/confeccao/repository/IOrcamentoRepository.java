package br.com.projeto.confeccao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.confeccao.model.Orcamento;

public interface IOrcamentoRepository extends JpaRepository<Orcamento, Long>{

}
