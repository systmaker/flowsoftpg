package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.com.erp.flowsoftpg.entity.Producto;
import co.com.erp.flowsoftpg.service.IProductoService;

@Controller
public class ProductoController {
	
	private static final String INDEX_VIEW = "producto";
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping ("/")
	public ModelAndView init (){
		ModelAndView view = new ModelAndView (INDEX_VIEW);
		view.addObject("productos", productoService.listAll());
		view.addObject("producto", new Producto());
		return view;
	}
	
	@PostMapping("/addProducto")
	public String addProducto (@ModelAttribute ("producto") Producto producto){
		productoService.insert(producto);
		return "redirect:/";
	}	
	
    @RequestMapping("/show/{id}")
    public String show(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoService.findById(id));
        return "show";
    }
	
    @RequestMapping("/delete")
    public String delete(@RequestParam Integer id) {
        productoService.delete(id);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoService.findById(id));
        return "edit";
    }    
    
}
