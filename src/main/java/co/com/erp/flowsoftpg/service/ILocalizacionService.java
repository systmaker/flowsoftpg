package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Localizacion;

public interface ILocalizacionService {
	
	Localizacion findById (Integer id);
	
	List<Localizacion> listAll();
	
	void update (Localizacion localizacion);
	
	void insert (Localizacion localizacion);
	
	void delete (Integer id);

}