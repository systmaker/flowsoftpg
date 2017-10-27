package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Cama;

public interface ICamaService {
	
	Cama findById (Integer id);
	
	List <Cama> listAll ();
	
	void update (Cama cama);
	
	void insert (Cama cama);
	
	void delete (Integer id);		

}