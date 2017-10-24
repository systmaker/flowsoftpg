package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Pais;

public interface IPaisService {
	
	Pais findById (Integer id);
	
	List<Pais> listAll();
	
	void update (Pais pais);
	
	void insert (Pais pais);
	
	void delete (Integer id);

}
