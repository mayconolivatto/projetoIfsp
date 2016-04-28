package br.com.projeto.confeccao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.confeccao.controller.base.IBaseController;
import br.com.projeto.confeccao.model.Cliente;
import br.com.projeto.confeccao.repository.IClienteRepository;

@RestController
@CrossOrigin(maxAge = 3600)
public class ClienteController implements IBaseController<Cliente> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6977713342295427319L;
	@Autowired
	private IClienteRepository clienteRepository;

	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public Object get(@RequestParam(value = "id", required = false) Long id) {
		if (id != null) {
			return clienteRepository.findOne(id);
		} else {
			return clienteRepository.findAll();
		}
	}

	
	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public Object salvar(@RequestBody() Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}

	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
	public Object deletar(@PathVariable("id") Long id) {
		int i = 1;
		try {
			clienteRepository.delete(id);	
		} catch (Exception e) {
			i=0;
		}
		
		return i;
		
		
		
	}

}
