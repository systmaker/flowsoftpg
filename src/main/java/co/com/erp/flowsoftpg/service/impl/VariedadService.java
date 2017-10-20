package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*import co.com.erp.flowsoftpg.entity.Producto;*/
import co.com.erp.flowsoftpg.entity.Variedad;
/*import co.com.erp.flowsoftpg.repository.ProductoRepository;*/
import co.com.erp.flowsoftpg.repository.VariedadRepository;
import co.com.erp.flowsoftpg.service.IVariedadService;

@Service
public class VariedadService implements IVariedadService {
	
	@Autowired
	private VariedadRepository variedadRepository;
	
	/*
	@Autowired
	private ProductoRepository productoRepository;
	*/
	
	@Override
	public Variedad findById(Integer id) {
		return variedadRepository.findOne(id);
	}

	@Override
	public List<Variedad> listAll() {
		return variedadRepository.findAll();
	}

	@Override
	public void update(Variedad variedad) {
		variedadRepository.save(variedad);
	}

	@Override
	public void insert(Variedad variedad) {
		
		/*
		if(variedad.getProducto().getId() >0){
			Producto p = productoRepository.findOne(variedad.getProducto().getId());
			variedad.setProducto(p);
		}
		*/
		
		variedadRepository.save(variedad);
	}

	@Override
	public void delete(Integer id) {
		variedadRepository.delete(id);
	}

}
