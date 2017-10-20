package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Variedad;
import co.com.erp.flowsoftpg.repository.VariedadRepository;
import co.com.erp.flowsoftpg.service.IVariedadService;

@Service
public class VariedadService implements IVariedadService {
	
	@Autowired
	private VariedadRepository variedadRepository;

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
		variedadRepository.save(variedad);
	}

	@Override
	public void delete(Integer id) {
		variedadRepository.delete(id);
	}

}
