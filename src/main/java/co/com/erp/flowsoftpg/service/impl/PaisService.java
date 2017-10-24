package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Pais;
import co.com.erp.flowsoftpg.repository.PaisRepository;
import co.com.erp.flowsoftpg.service.IPaisService;

@Service
public class PaisService implements IPaisService{

	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public Pais findById(Integer id) {
		return paisRepository.findOne(id);
	}

	@Override
	public List<Pais> listAll() {
		return paisRepository.findAll();
	}

	@Override
	public void update(Pais pais) {
		paisRepository.save(pais);
	}

	@Override
	public void insert(Pais pais) {
		paisRepository.save(pais);		
	}

	@Override
	public void delete(Integer id) {
		paisRepository.delete(id);
	}

}