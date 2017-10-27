package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.ICamaService;

@Controller
public class CamaController {
	
	@Autowired
	private ICamaService camaService;
	
	@RequestMapping("/cama")
	public String cama(Model model){
		model.addAttribute("cama", camaService.listAll());
		return "cama";
	}

}