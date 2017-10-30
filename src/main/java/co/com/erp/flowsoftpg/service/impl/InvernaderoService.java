package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Invernadero;
import co.com.erp.flowsoftpg.repository.InvernaderoRepository;
import co.com.erp.flowsoftpg.service.IInvernaderoService;

@Service
public class InvernaderoService implements IInvernaderoService {
	
	@Autowired
	private InvernaderoRepository invernaderoRepository;

	@Override
	public Invernadero findById(Integer id) {
		return invernaderoRepository.findOne(id);
	}

	@Override
	public List<Invernadero> listAll() {
		return invernaderoRepository.findAll();
	}

	@Override
	public void update(Invernadero invernadero) {
		invernaderoRepository.save(invernadero);
	}

	@Override
	public void insert(Invernadero invernadero) {
		invernaderoRepository.save(invernadero);
	}

	@Override
	public void delete(Integer id) {
		invernaderoRepository.delete(id);
	}

	@Override
	public List<Invernadero> findInvernaderosByLocalizacion(Integer id) {
		return invernaderoRepository.findInvernaderosByLocalizacion(id);
	}

}