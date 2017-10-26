package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Siembra;
import co.com.erp.flowsoftpg.entity.Variedad;
import co.com.erp.flowsoftpg.service.ICompaniaService;
import co.com.erp.flowsoftpg.service.ISiembraService;

@Controller
public class SiembraController {
	
	@Autowired
	private ISiembraService siembraService;
	
	@Autowired
	private ICompaniaService companiaService;
	
	@RequestMapping("/siembra")
	public String siembra(@ModelAttribute ("siembra") Siembra siembra, Model model){
		model.addAttribute("companias", companiaService.listAll());
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