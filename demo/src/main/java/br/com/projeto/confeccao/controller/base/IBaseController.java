package br.com.projeto.confeccao.controller.base;

import java.io.Serializable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IBaseController<E> extends Serializable{

	
	Object get(@RequestParam(value="id", required=false) Long id);		
		
	
	Object salvar(@RequestBody() E obj);	
	Object deletar(@PathVariable("id") Long id) throws Exception;
	
}
