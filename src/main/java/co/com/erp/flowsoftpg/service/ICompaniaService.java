package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Compania;

public interface ICompaniaService {
	
	Compania findById (Integer id);
	
	List<Compania> listAll ();
	
	void update (Compania compania);
	
	void insert (Compania compania);
	
	void delete (Integer id);

}