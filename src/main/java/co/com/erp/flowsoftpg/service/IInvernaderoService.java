package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Invernadero;

public interface IInvernaderoService {
	
	Invernadero findById (Integer id);
	
	List <Invernadero> listAll ();
	
	void update (Invernadero invernadero);
	
	void insert (Invernadero invernadero);
	
	void delete (Integer id);

}