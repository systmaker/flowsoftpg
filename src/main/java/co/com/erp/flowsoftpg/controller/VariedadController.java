package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Variedad;
import co.com.erp.flowsoftpg.service.IColorService;
import co.com.erp.flowsoftpg.service.IProductoService;
import co.com.erp.flowsoftpg.service.IVariedadService;

@Controller
public class VariedadController {
	
	@Autowired
	private IVariedadService variedadService;
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IColorService colorService;
	
    @RequestMapping("/variedad")
    public String variedad(@ModelAttribute ("variedad") Variedad variedad, Model model) {
    	model.addAttribute("productos", productoService.listAll());
    	model.addAttribute("colores", colorService.listAll());
        model.addAttribute("variedades", variedadService.listAll());
        return "variedad";
    }
    
	@PostMapping("/addVariedad")
	public String addVariedad (@ModelAttribute ("variedad") Variedad variedad){
		/*System.out.println(variedad);*/
		variedadService.insert(variedad);
		/*return "redirect:/";*/
		return "redirect:/variedad";
	}    
	
}
