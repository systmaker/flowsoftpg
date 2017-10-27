package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Usuario;
import co.com.erp.flowsoftpg.repository.UsuarioRepository;
import co.com.erp.flowsoftpg.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario findById(Integer id) {
		return usuarioRepository.findOne(id);
	}

	@Override
	public List<Usuario> listAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public void update(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void insert(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		usuarioRepository.delete(id);
	}

}