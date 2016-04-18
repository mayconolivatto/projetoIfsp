package br.com.projeto.confeccao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.confeccao.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	


}
