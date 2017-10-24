package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Producto;
import co.com.erp.flowsoftpg.repository.ProductoRepository;
import co.com.erp.flowsoftpg.service.IProductoService;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto findById(Integer id){
		return productoRepository.findOne(id);
	}
	
	@Override
	public List<Producto> listAll(){
		return productoRepository.findAll();
	}
	
	@Override
	public void update (Producto producto){
		productoRepository.save(producto);
	}
	
	@Override
	public void insert (Producto producto){
		productoRepository.save(producto);
	}	
	
	@Override
	public void delete (Integer id){
		productoRepository.delete(id);
	}
	
}