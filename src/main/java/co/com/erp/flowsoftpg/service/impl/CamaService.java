package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Cama;
import co.com.erp.flowsoftpg.repository.CamaRepository;
import co.com.erp.flowsoftpg.service.ICamaService;

@Service
public class CamaService implements ICamaService {
	
	@Autowired
	private CamaRepository camaRepository;

	@Override
	public Cama findById(Integer id) {
		return camaRepository.findOne(id);
	}

	@Override
	public List<Cama> listAll() {
		return camaRepository.findAll();
	}

	@Override
	public void update(Cama cama) {
		camaRepository.save(cama);
	}

	@Override
	public void insert(Cama cama) {
		camaRepository.save(cama);
	}

	@Override
	public void delete(Integer id) {
		camaRepository.delete(id);
	}

}