package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Color;

public interface IColorService {
	
	Color findById (Integer id);
	
	List<Color> listAll ();
	
	void update (Color color);
	
	void insert (Color color);
	
	void delete (Integer id);	

}