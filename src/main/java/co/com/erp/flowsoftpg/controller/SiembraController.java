package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Siembra;
import co.com.erp.flowsoftpg.service.ICamaService;
import co.com.erp.flowsoftpg.service.ICompaniaService;
import co.com.erp.flowsoftpg.service.IInvernaderoService;
import co.com.erp.flowsoftpg.service.ILocalizacionService;
/*import co.com.erp.flowsoftpg.service.ISiembraService;*/

@Controller
public class SiembraController {

	/*
	 * @Autowired private ISiembraService siembraService;
	 */
	@Autowired
	private ICompaniaService companiaService;

	@Autowired
	private ILocalizacionService localizacionService;

	@Autowired
	private IInvernaderoService invernaderoService;
	
	/*
	@Autowired
	private ICamaService camaService;
	*/
	
	@RequestMapping("/siembra")
	public String siembra(@ModelAttribute("siembra") Siembra siembra, Model model) {
		model.addAttribute("companias", companiaService.listAll());
		if (siembra.getCama() != null) {
			model.addAttribute("localizaciones", localizacionService.findLocalizacionesByCompania(siembra.getCama().getNave().getInvernadero().getLocalizacion().getCompania().getId()));
			model.addAttribute("invernaderos", invernaderoService.findInvernaderosByLocalizacion(siembra.getCama().getNave().getInvernadero().getLocalizacion().getId()));
		}
						
		/*model.addAttribute("invernaderos", invernaderoService.listAll());*/
		/*model.addAttribute("camas", camaService.listAll());*/
		return "siembra";
	}

	@PostMapping("/addSiembra")
	public String addSiembra(@ModelAttribute("siembra") Siembra siembra, Model model) {
		if (siembra.getCama() != null) {
			model.addAttribute("localizaciones", localizacionService.findLocalizacionesByCompania(
					siembra.getCama().getNave().getInvernadero().getLocalizacion().getCompania().getId()));
		}
		return "redirect:/siembra";
	}

}