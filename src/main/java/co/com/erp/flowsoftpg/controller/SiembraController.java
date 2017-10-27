package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Siembra;
import co.com.erp.flowsoftpg.service.ICompaniaService;
import co.com.erp.flowsoftpg.service.IInvernaderoService;
import co.com.erp.flowsoftpg.service.ILocalizacionService;
/*import co.com.erp.flowsoftpg.service.ISiembraService;*/

@Controller
public class SiembraController {
	
	/*
	@Autowired
	private ISiembraService siembraService;
	*/
	@Autowired
	private ICompaniaService companiaService;
	
	@Autowired
	private ILocalizacionService localizacionService;
	
	@Autowired
	private IInvernaderoService invernaderoService;	
	
	@RequestMapping("/siembra")
	public String siembra(@ModelAttribute ("siembra") Siembra siembra, Model model){
		model.addAttribute("companias", companiaService.listAll());
		model.addAttribute("localizaciones", localizacionService.listAll());
		model.addAttribute("invernaderos", invernaderoService.listAll());
		return "siembra";
	}
	
	/*
	@PostMapping("/addSiembra")
	public String addSiembra (@ModelAttribute ("siembra") Siembra siembra){
		siembraService.insert(siembra);
		return "redirect:/variedad";
	}
	*/

}