package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Ciudad;
import co.com.erp.flowsoftpg.repository.CiudadRepository;
import co.com.erp.flowsoftpg.service.ICiudadService;

@Service
public class CiudadService implements ICiudadService {
	
	@Autowired
	private CiudadRepository ciudadRepository;

	@Override
	public Ciudad findById(Integer id) {
		return ciudadRepository.findOne(id);
	}

	@Override
	public List<Ciudad> listAll() {
		return ciudadRepository.findAll();
	}

	@Override
	public void update(Ciudad ciudad) {
		ciudadRepository.save(ciudad);		
	}

	@Override
	public void insert(Ciudad ciudad) {
		ciudadRepository.save(ciudad);		
	}

	@Override
	public void delete(Integer id) {
		ciudadRepository.delete(id);		
	}

}