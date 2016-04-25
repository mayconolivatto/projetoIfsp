package br.com.projeto.confeccao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.confeccao.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long>{

}
