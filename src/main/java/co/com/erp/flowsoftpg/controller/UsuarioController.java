package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.com.erp.flowsoftpg.service.IUsuarioService;

@Controller
public class UsuarioController {
	
	private static final String INDEX_VIEW = "login";
		
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping ("/")
	public ModelAndView init (){
		ModelAndView view = new ModelAndView (INDEX_VIEW);
		return view;
	}
	
	@RequestMapping("/usuario")
	public String usuario(Model model){
		model.addAttribute("usuario", usuarioService.listAll());
		return "usuario";
	}

}