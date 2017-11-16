package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.com.erp.flowsoftpg.entity.Usuario;
import co.com.erp.flowsoftpg.service.IUsuarioService;

@Controller
public class UsuarioController {
	
	private static final String INDEX_VIEW = "login";
		
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping ("/")
	public ModelAndView init (@ModelAttribute("usuario") Usuario usuario){
		ModelAndView view = new ModelAndView (INDEX_VIEW);
		return view;
	}
	
	@RequestMapping("/usuario")
	public String usuario(@ModelAttribute("usuario") Usuario usuario, Model model){
		model.addAttribute("usuarios", usuarioService.listAll());
		return "usuario";
	}
	
	@RequestMapping("/")
	public String validarUsuario(@ModelAttribute("usuario") Usuario usuario, Model model){
		String retorno = INDEX_VIEW;
		usuario = usuarioService.findUsuarioByCodigoAndClave(usuario.getCodigo(), usuario.getClave());
		if(usuario!=null){
			retorno = "redirect:/producto";
		}else{
			model.addAttribute("msg","Usuario o clave incorrectos.");
		}
		return retorno;
	}	
}