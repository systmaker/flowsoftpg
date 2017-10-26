package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.erp.flowsoftpg.entity.Usuario;
import co.com.erp.flowsoftpg.repository.UsuarioRepository;
import co.com.erp.flowsoftpg.service.IUsuarioService;

public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario findById(Integer id) {
		return null;
	}

	@Override
	public List<Usuario> listAll() {
		return null;
	}

	@Override
	public void update(Usuario usuario) {
		
	}

	@Override
	public void insert(Usuario usuario) {
		
	}

	@Override
	public void delete(Integer id) {
		
	}

}