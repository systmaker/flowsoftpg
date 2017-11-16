package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Color;
import co.com.erp.flowsoftpg.entity.Producto;
import co.com.erp.flowsoftpg.service.IColorService;

@Controller
public class ColorController {
	
	@Autowired
	private IColorService colorService;
	
	/*Forma 1 de Listar*/
	/*
	@GetMapping ("/color")
	public ModelAndView init (){
		ModelAndView view = new ModelAndView ();
		view.addObject("colores", colorService.listAll());
		view.addObject("color", new Color());
		return view;
	}
	*/
	
	/*Forma 2 de Listar*/
    @RequestMapping("/color")
    public String color(@ModelAttribute ("color") Color color, Model model) {
        model.addAttribute("colores", colorService.listAll());
        return "color";
    }
	
	@PostMapping("/addColor")
	public String addColor (@ModelAttribute ("color") Color color){
		colorService.insert(color);
		return "redirect:/color";
	}	
    
    
}