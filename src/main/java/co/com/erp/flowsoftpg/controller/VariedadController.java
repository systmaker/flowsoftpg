package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.IVariedadService;

@Controller
public class VariedadController {
	
	@Autowired
	private IVariedadService variedadService;
	
    @RequestMapping("/variedad")
    public String variedad(Model model) {
        model.addAttribute("variedades", variedadService.listAll());
        return "variedad";
    }
	
}
