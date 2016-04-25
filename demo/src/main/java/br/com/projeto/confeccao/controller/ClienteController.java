package br.com.projeto.confeccao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.confeccao.controller.base.IBaseController;
import br.com.projeto.confeccao.model.Cliente;
import br.com.projeto.confeccao.repository.impl.ClienteRepository;
import br.com.projeto.confeccao.repository.impl.GenericoRepositorio;

@RestController
public class ClienteController implements IBaseController<Cliente> {

	@Autowired
	private ClienteRepository clienteRepository;
	
	//private GenericoRepositorio<Cliente> cliente2;

	@Override
	public Object get(Long id) {

		Cliente c = new Cliente();
		c.setId(id);
		return clienteRepository.findOne(c);

	}

	@Override
	public Object salvar(Cliente obj) {
		return clienteRepository.saveAndFlush(obj);

	}

	@Override
	public void deletar(Long id) {
		Cliente c = new Cliente();
		c.setId(id);
		clienteRepository.deletar(c);

	}

}
