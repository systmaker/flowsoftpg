package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Siembra;

public interface ISiembraService {
	
	Siembra findById (Integer id);
	
	List <Siembra> listAll ();
	
	void update (Siembra departamento);
	
	void insert (Siembra departamento);
	
	void delete (Integer id);	

}