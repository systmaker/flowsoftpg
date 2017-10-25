package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.ICiudadService;

@Controller
public class CiudadController {
	
	@Autowired
	private ICiudadService ciudadService;
	
	@RequestMapping("/ciudad")
	public String ciudad(Model model){
		model.addAttribute("ciudad", ciudadService.listAll());
		return "ciudad";
	}

}
