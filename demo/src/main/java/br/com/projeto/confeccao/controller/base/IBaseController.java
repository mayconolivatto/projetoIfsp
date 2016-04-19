package br.com.projeto.confeccao.controller.base;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IBaseController<E> {

	
	Object get(@RequestParam(value="id", required=false) Long id);		
		
	
	Object salvar(@RequestBody() E obj);	
	void deletar(@PathVariable("id") Long id);
	
}
