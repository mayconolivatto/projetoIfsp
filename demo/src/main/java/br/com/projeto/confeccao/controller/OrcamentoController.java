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
import br.com.projeto.confeccao.model.Orcamento;
import br.com.projeto.confeccao.repository.IItemOrcamentoRepository;
import br.com.projeto.confeccao.repository.IOrcamentoRepository;

@RestController
@CrossOrigin(maxAge = 3600)
public class OrcamentoController implements IBaseController<Orcamento> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6586055342244961550L;
	@Autowired
	private IOrcamentoRepository orcamentoRepository;
	@Autowired
	private IItemOrcamentoRepository itemOrcamentoRepository;
	
	

	@RequestMapping(value = "/orcamento", method = RequestMethod.GET)
	public Object get(@RequestParam(value = "id", required = false) Long id) {
		if (id != null) {
			
			Orcamento o = orcamentoRepository.buscaOrcamentoCompleto(id);
			//itemOrcamentoRepository.findByOrcamento(o);
		//	Hibernate.initialize(o.getListaItemOrcamento());
			o.setListaItemOrcamento(itemOrcamentoRepository.buscaPorIdOrcamento(id));
			return o;
		} else {
			return orcamentoRepository.findAll();
		}
	}

	
	@RequestMapping(value = "/orcamento", method = RequestMethod.POST)
	public Object salvar(@RequestBody() Orcamento orcamento) {
		 orcamentoRepository.saveAndFlush(orcamento);
		 for(ItemOrcamento item : orcamento.getListaItemOrcamento())
		 itemOrcamentoRepository.saveAndFlush(item);
		 
		 return orcamento;
		
	}

	@RequestMapping(value = "/orcamento/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {	
		orcamentoRepository.delete(id);
	}

}
