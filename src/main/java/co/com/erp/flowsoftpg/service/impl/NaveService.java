package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Nave;
import co.com.erp.flowsoftpg.repository.NaveRepository;
import co.com.erp.flowsoftpg.service.INaveService;

@Service
public class NaveService implements INaveService {
	
	@Autowired
	private NaveRepository naveRepository;

	@Override
	public Nave findById(Integer id) {
		return naveRepository.findOne(id);
	}

	@Override
	public List<Nave> listAll() {
		return naveRepository.findAll();
	}

	@Override
	public void update(Nave nave) {
		naveRepository.save(nave);
	}

	@Override
	public void insert(Nave nave) {
		naveRepository.save(nave);
	}

	@Override
	public void delete(Integer id) {
		naveRepository.delete(id);
	}

}