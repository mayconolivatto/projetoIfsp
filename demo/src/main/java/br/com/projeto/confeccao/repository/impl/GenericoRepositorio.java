package br.com.projeto.confeccao.repository.impl;

import java.util.List;

import br.com.projeto.confeccao.model.GenericModel;
import br.com.projeto.confeccao.repository.IBaseRepository;

public class GenericoRepositorio<E extends GenericModel> implements IBaseRepository<E> {

	private List<E> listaTipoE;
	private static Long id = 1l;

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
		if(listaTipoE.contains(obj)){
			listaTipoE.remove(obj);
		}else{
			obj.setId(id++);		
		}
		listaTipoE.add(obj);
		
	  return obj;
	}

	@Override
	public void deletar(E obj) {
		listaTipoE.remove(obj);

	}

}
