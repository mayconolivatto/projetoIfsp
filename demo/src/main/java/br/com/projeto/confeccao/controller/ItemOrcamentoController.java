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
import br.com.projeto.confeccao.model.ItemOrcamento;
import br.com.projeto.confeccao.repository.IItemOrcamentoRepository;

@RestController
@CrossOrigin(maxAge=3600)
public class ItemOrcamentoController implements IBaseController<ItemOrcamento>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -951545269616547832L;

	
	@Autowired
	private IItemOrcamentoRepository itemOrcamentoRepository;

	@RequestMapping(value = "/itemOrcamento", method = RequestMethod.GET)
	public Object get(@RequestParam(value = "id", required = false) Long id) {
		if (id != null) {
			
			return itemOrcamentoRepository.buscaPorIdOrcamento(id);
		} else {
			return itemOrcamentoRepository.findAll();
		}
	}

	
	@RequestMapping(value = "/itemOrcamento", method = RequestMethod.POST)
	public Object salvar(@RequestBody() ItemOrcamento itemOrcamento) {
		return itemOrcamentoRepository.saveAndFlush(itemOrcamento);
	}

	@RequestMapping(value = "/itemOrcamento/{id}", method = RequestMethod.DELETE)
	public Object deletar(@PathVariable("id") Long id) {
		int i = 1;
		try {
			itemOrcamentoRepository.delete(id);
			
		} catch (Exception e) {
			i = 0;
		}
		
		return i;
	}


}
