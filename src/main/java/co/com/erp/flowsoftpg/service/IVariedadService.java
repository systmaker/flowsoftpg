package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Variedad;

public interface IVariedadService {
	
	Variedad findById (Integer id);
	
	List <Variedad> listAll ();
	
	void update (Variedad variedad);
	
	void insert (Variedad variedad);
	
	void delete (Integer id);
	
}
