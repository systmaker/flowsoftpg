package co.com.erp.flowsoftpg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.erp.flowsoftpg.entity.Color;
import co.com.erp.flowsoftpg.repository.ColorRepository;
import co.com.erp.flowsoftpg.service.IColorService;

@Service
public class ColorService implements IColorService {
	
	@Autowired
	private ColorRepository colorRepository;

	@Override
	public Color findById(Integer id) {
		return colorRepository.findOne(id);
	}

	@Override
	public List<Color> listAll() {
		return colorRepository.findAll();
	}

	@Override
	public void update(Color color) {
		colorRepository.save(color);	
	}

	@Override
	public void insert(Color color) {
		colorRepository.save(color);	
	}

	@Override
	public void delete(Integer id) {
		colorRepository.delete(id);
	}
	
}
