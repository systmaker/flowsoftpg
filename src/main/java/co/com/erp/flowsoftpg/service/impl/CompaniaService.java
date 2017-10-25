package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Compania;
import co.com.erp.flowsoftpg.repository.CompaniaRepository;
import co.com.erp.flowsoftpg.service.ICompaniaService;

@Service
public class CompaniaService implements ICompaniaService {
	
	@Autowired
	private CompaniaRepository companiaRepository;

	@Override
	public Compania findById(Integer id) {
		return companiaRepository.findOne(id);
	}

	@Override
	public List<Compania> listAll() {
		return companiaRepository.findAll();
	}

	@Override
	public void update(Compania compania) {
		companiaRepository.save(compania);
	}

	@Override
	public void insert(Compania compania) {
		companiaRepository.save(compania);
	}

	@Override
	public void delete(Integer id) {
		companiaRepository.delete(id);
	}

}