package co.com.erp.flowsoftpg.service;

import java.util.List;

import co.com.erp.flowsoftpg.entity.Producto;

public interface IProductoService {
	
	Producto findById (Integer id);
	
	List<Producto> listAll ();
	
	void update (Producto producto);
	
	void insert (Producto producto);
	
	void delete (Integer id);

}