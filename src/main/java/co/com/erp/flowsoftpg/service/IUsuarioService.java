package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Usuario;

public interface IUsuarioService {
	
	Usuario findById (Integer id);
	
	List <Usuario> listAll ();
	
	void update (Usuario usuario);
	
	void insert (Usuario usuario);
	
	void delete (Integer id);

}