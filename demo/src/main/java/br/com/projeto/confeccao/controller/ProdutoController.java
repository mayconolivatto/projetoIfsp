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
import br.com.projeto.confeccao.model.Produto;
import br.com.projeto.confeccao.repository.IProdutoRepository;

@RestController
@CrossOrigin(maxAge = 3600)
public class ProdutoController implements IBaseController<Produto> {

	@Autowired
	private IProdutoRepository produtoRepository;

	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public Object get(@RequestParam(value = "id", required = false) Long id) {
		if (id != null) {
			return produtoRepository.findOne(id);
		} else {
			return produtoRepository.findAll();
		}
	}

	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public Object salvar(@RequestBody() Produto produto) {
		return produtoRepository.saveAndFlush(produto);
	}

	@RequestMapping(value = "/produto/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {
		produtoRepository.delete(id);
	}

}
