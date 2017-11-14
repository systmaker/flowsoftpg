package co.com.erp.flowsoftpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.erp.flowsoftpg.entity.Cama;
import co.com.erp.flowsoftpg.entity.Siembra;
import co.com.erp.flowsoftpg.entity.Variedad;
import co.com.erp.flowsoftpg.service.ICamaService;
import co.com.erp.flowsoftpg.service.IColorService;
import co.com.erp.flowsoftpg.service.ICompaniaService;
import co.com.erp.flowsoftpg.service.IInvernaderoService;
import co.com.erp.flowsoftpg.service.ILocalizacionService;
import co.com.erp.flowsoftpg.service.IProductoService;
import co.com.erp.flowsoftpg.service.ISiembraService;
import co.com.erp.flowsoftpg.service.IVariedadService;

import co.com.erp.flowsoftpg.util.Constantes;

@Controller
public class SiembraController {

	
	@Autowired 
	private ISiembraService siembraService;
	 
	@Autowired
	private ICompaniaService companiaService;

	@Autowired
	private ILocalizacionService localizacionService;

	@Autowired
	private IInvernaderoService invernaderoService;
		
	@Autowired
	private ICamaService camaService;
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IColorService colorService;
	
	@Autowired
	private IVariedadService variedadService;
	
	@RequestMapping("/siembra")
	public String siembra(@ModelAttribute("siembra") Siembra siembra, Model model) {
		model.addAttribute("companias", companiaService.listAll());
		if (siembra.getCama() != null) {
			model.addAttribute("localizaciones", localizacionService.findLocalizacionesByCompania(siembra.getCama().getNave().getInvernadero().getLocalizacion().getCompania().getId()));
			model.addAttribute("invernaderos", invernaderoService.findInvernaderosByLocalizacion(siembra.getCama().getNave().getInvernadero().getLocalizacion().getId()));
			model.addAttribute("camas", camaService.findCamasByInvernadero(siembra.getCama().getNave().getInvernadero().getId()));
		}
						
		/*model.addAttribute("invernaderos", invernaderoService.listAll());*/
		/*model.addAttribute("camas", camaService.listAll());*/
				
		return "siembra";
	}
	
	@PostMapping("/createSiembra")
	public String createSiembra(@ModelAttribute("siembra") Siembra siembra, Model model){
		siembraService.insert(siembra);
		return "redirect:/siembra";		
	}	
	
    @RequestMapping("/siembra_find/{id}")
    public String siembraFind(@PathVariable Integer id, Model model, @ModelAttribute("siembra") Siembra siembra) {
    	model.addAttribute("productos", productoService.listAll());
    	model.addAttribute("colores", colorService.listAll());
        model.addAttribute("variedades", variedadService.listAll());
        model.addAttribute("cama", camaService.findById(id));
        /*return "edit";*/
        /*return "redirect:/";*/
        return "siembra_find";
    } 	
    
    /*
    @PostMapping("/siembra_add")
    public String siembra_add (@ModelAttribute ("siembra") Siembra siembra){
    	siembra.setEstado(Constantes.SIEMBRA_ACTIVA);
    	siembraService.insert(siembra);
    	return "siembra";
    }
     */
    
    @RequestMapping("/siembra_add")
    public String siembra_add (@ModelAttribute ("siembra") Siembra siembra, Model model){
    	/*Insertar Siembra*/
    	siembra.setEstado(Constantes.SIEMBRA_ACTIVA);
    	    	
    	Variedad variedad;
    	variedad = variedadService.findById(siembra.getVariedad().getId());
    	    	   	
    	siembra.setMetros_sem(siembra.getNroplantas() / variedad.getPlantasm2());
    	    	
    	siembraService.insert(siembra);
    	
    	/*Actualizar Cama*/
    	
    	
    	Cama cama;
    	cama = camaService.findById(siembra.getCama().getId());
    	
    	cama.setMetros_ocu(cama.getMetros_ocu() + siembra.getMetros_sem());
    	cama.setEstado(Constantes.CAMA_SEMIOCUPADA);
    	
    	camaService.update(cama);
    	    	
    	return "siembra";
    }
	

	@PostMapping("/addSiembra")
	public String addSiembra(@ModelAttribute("siembra") Siembra siembra, Model model) {
		if (siembra.getCama() != null) {
			model.addAttribute("localizaciones", localizacionService.findLocalizacionesByCompania(siembra.getCama().getNave().getInvernadero().getLocalizacion().getCompania().getId()));
		}
		return "redirect:/siembra";
	}

}