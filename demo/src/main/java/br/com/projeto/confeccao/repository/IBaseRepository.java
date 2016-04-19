package br.com.projeto.confeccao.repository;

public interface IBaseRepository<E> {
	
	Object findOne(E id);
	Object findAll();
	Object saveAndFlush(E obj);
	void deletar(Long id);

}
