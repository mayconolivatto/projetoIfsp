package br.com.projeto.confeccao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.confeccao.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
