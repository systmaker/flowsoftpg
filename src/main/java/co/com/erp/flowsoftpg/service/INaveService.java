package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Nave;

public interface INaveService {
	
	Nave findById (Integer id);
	
	List <Nave> listAll ();
	
	void update (Nave nave);
	
	void insert (Nave nave);
	
	void delete (Integer id);		

}