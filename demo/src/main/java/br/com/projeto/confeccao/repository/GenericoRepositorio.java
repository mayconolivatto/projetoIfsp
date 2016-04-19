package br.com.projeto.confeccao.repository;

import java.util.List;

public class GenericoRepositorio<E> implements IBaseRepository<E> {

	private List<E> listaTipoE;

	@Override
	public Object findOne(E e) {

		if (listaTipoE.contains(e)) {
			return listaTipoE.get(listaTipoE.indexOf(e));
		}

		return null;
	}

	@Override
	public Object findAll() {		
		return listaTipoE;
	}

	@Override
	public Object saveAndFlush(E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub

	}

}
