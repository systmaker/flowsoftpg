package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.ILocalizacionService;

@Controller
public class LocalizacionController {
	
	@Autowired
	private ILocalizacionService localizacionService;
	
	@RequestMapping("/localizacion")
	public String localizacion (Model model){
		model.addAttribute("localizacion", localizacionService.listAll());
		return "localizacion";
	}

}