package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Ciudad;

public interface ICiudadService {
	
	Ciudad findById (Integer id);
	
	List <Ciudad> listAll ();
	
	void update (Ciudad ciudad);
	
	void insert (Ciudad ciudad);
	
	void delete (Integer id);

}