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
    
    @RequestMapping("/producto_edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoService.findById(id));
        /*return "edit";*/
        /*return "redirect:/";*/
        return "producto_edit";
    }   
    
    @RequestMapping("/producto_delete/{id}")
    public String producto_delete(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoService.findById(id));
        /*return "edit";*/
        /*return "redirect:/";*/
        return "producto_delete";
    }
    
    @RequestMapping("/update")
    public String update(@RequestParam Integer id, @RequestParam String descripcion, @RequestParam String estado) {
        Producto producto = productoService.findById(id);
        producto.setDescripcion(descripcion);
        producto.setEstado(estado);
        productoService.insert(producto);

        /*return "redirect:/show/" + product.getId();*/
        return "redirect:/";
    }
    
}
