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
import br.com.projeto.confeccao.model.Usuario;
import br.com.projeto.confeccao.repository.IUsuarioRepository;

@RestController
@CrossOrigin(maxAge = 3600)
public class UsuarioController implements IBaseController<Usuario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4181224475814971897L;
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public Object get(@RequestParam(value = "id", required = false) Long id) {
		if (id != null) {
			return usuarioRepository.findOne(id);
		} else {
			return usuarioRepository.findAll();
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Object getLogin(@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "senha", required = false) String senha) {

		Usuario u = usuarioRepository.findOne(id);
		if (u != null && u.getSenha().equals(senha)) {
			return u;
		} else {
			return null;
		}

	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public Object salvar(@RequestBody() Usuario usuario) {
		return usuarioRepository.saveAndFlush(usuario);
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {
		usuarioRepository.delete(id);
	}

}
