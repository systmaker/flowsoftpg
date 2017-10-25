package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.IDepartamentoService;

@Controller
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService departamentoService;
	
	@RequestMapping("/departamento")
	public String departamento(Model model){
		model.addAttribute("departamentos", departamentoService.listAll());
		return "departamento";
	}

}