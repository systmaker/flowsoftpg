package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Localizacion;
import co.com.erp.flowsoftpg.repository.LocalizacionRepository;
import co.com.erp.flowsoftpg.service.ILocalizacionService;

@Service
public class LocalizacionService implements ILocalizacionService {
	
	@Autowired
	private LocalizacionRepository localizacionRepository;

	@Override
	public Localizacion findById(Integer id) {
		return localizacionRepository.findOne(id);
	}

	@Override
	public List<Localizacion> listAll() {
		return localizacionRepository.findAll();
	}

	@Override
	public void update(Localizacion localizacion) {
		localizacionRepository.save(localizacion);
	}

	@Override
	public void insert(Localizacion localizacion) {
		localizacionRepository.save(localizacion);
	}

	@Override
	public void delete(Integer id) {
		localizacionRepository.delete(id);
	}

}