package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.IPaisService;

@Controller
public class PaisController {
	
	@Autowired
	private IPaisService paisService;
	
	@RequestMapping("/pais")
	public String pais(Model model){
		model.addAttribute("pais", paisService.listAll());
		return "pais";
	}

}