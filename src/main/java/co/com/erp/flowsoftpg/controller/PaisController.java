package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.erp.flowsoftpg.entity.Pais;
import co.com.erp.flowsoftpg.service.IPaisService;

@Controller
public class PaisController {
	
	@Autowired
	private IPaisService paisService;
	
	@RequestMapping("/pais")
	public String pais(@ModelAttribute ("pais") Pais pais, Model model){
		model.addAttribute("paises", paisService.listAll());
		return "pais";
	}
	
	@PostMapping("/addPais")
	public String addPais (@ModelAttribute ("pais") Pais pais){
		paisService.insert(pais);
		return "redirect:/pais";
	}	
	
    @RequestMapping("/delPais")
    public String delPais(@RequestParam Integer id) {
    	paisService.delete(id);
        return "redirect:/pais";
    }

}