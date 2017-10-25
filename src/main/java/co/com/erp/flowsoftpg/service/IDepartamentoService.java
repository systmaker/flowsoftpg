package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Departamento;

public interface IDepartamentoService {
	
	Departamento findById (Integer id);
	
	List <Departamento> listAll ();
	
	void update (Departamento departamento);
	
	void insert (Departamento departamento);
	
	void delete (Integer id);

}