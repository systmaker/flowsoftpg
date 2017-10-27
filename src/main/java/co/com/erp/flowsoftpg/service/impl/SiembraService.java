package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Siembra;
import co.com.erp.flowsoftpg.repository.SiembraRepository;
import co.com.erp.flowsoftpg.service.ISiembraService;

@Service
public class SiembraService implements ISiembraService{
	
	@Autowired
	private SiembraRepository siembraRepository;

	@Override
	public Siembra findById(Integer id) {
		return siembraRepository.findOne(id);
	}

	@Override
	public List<Siembra> listAll() {
		return siembraRepository.findAll();
	}

	@Override
	public void update(Siembra siembra) {
		siembraRepository.save(siembra);
	}

	@Override
	public void insert(Siembra siembra) {
		siembraRepository.save(siembra);
	}

	@Override
	public void delete(Integer id) {
		siembraRepository.delete(id);
	}

}