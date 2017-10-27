package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.INaveService;

@Controller
public class NaveController {
	
	@Autowired
	private INaveService naveService;
	
	@RequestMapping("/nave")
	public String nave (Model model){
		model.addAttribute("naves", naveService.listAll());
		return "nave";
	}

}