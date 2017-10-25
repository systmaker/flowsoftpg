package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Departamento;
import co.com.erp.flowsoftpg.repository.DepartamentoRepository;
import co.com.erp.flowsoftpg.service.IDepartamentoService;

@Service
public class DepartamentoService implements IDepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public Departamento findById(Integer id) {
		return departamentoRepository.findOne(id);
	}

	@Override
	public List<Departamento> listAll() {
		return departamentoRepository.findAll();
	}

	@Override
	public void update(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	@Override
	public void insert(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	@Override
	public void delete(Integer id) {
		departamentoRepository.delete(id);		
	}

}
