package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.IInvernaderoService;

@Controller
public class InvernaderoController {
	
	@Autowired
	private IInvernaderoService invernaderoService;
	
	@RequestMapping("/invernadero")
	public String invernadero(Model model){
		model.addAttribute("invernaderos", invernaderoService.listAll());
		return "invernadero";
	}

}