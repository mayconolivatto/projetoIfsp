package br.com.projeto.confeccao.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.confeccao.controller.base.IBaseController;
import br.com.projeto.confeccao.model.Cliente;

@RestController
public class ClienteController implements IBaseController<Cliente>{

	@Override
	public Object get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object salvar(Cliente obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
