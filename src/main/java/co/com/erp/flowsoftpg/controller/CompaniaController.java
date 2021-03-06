package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Compania;
import co.com.erp.flowsoftpg.service.ICompaniaService;

@Controller
public class CompaniaController {

	@Autowired
	private ICompaniaService companiaService;
	
	@RequestMapping("/compania")
	public String compania (@ModelAttribute ("compania") Compania compania, Model model){
		model.addAttribute("companias", companiaService.listAll());
		return "compania";
	}
	
}