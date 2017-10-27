package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.service.IUsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/usuario")
	public String usuario(Model model){
		model.addAttribute("usuario", usuarioService.listAll());
		return "usuario";
	}

}