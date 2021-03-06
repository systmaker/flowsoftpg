package co.com.erp.flowsoftpg.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
	
    @RequestMapping("/siembra_query")
    public String siembra_query(@ModelAttribute ("siembra") Siembra siembra, Model model) {
        model.addAttribute("siembras", siembraService.listAll());
        return "siembra_query";
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
    	
    	Variedad variedad;
    	variedad = variedadService.findById(siembra.getVariedad().getId());
    	
    	Cama cama;
    	cama = camaService.findById(siembra.getCama().getId());
    	
    	if (variedad.getPlantasm2() != null && variedad.getPlantasm2() != 0){
    		if (cama.getMetros_dis() >= (siembra.getNroplantas() / variedad.getPlantasm2())){    			    		
    			/*Insertar Siembra*/
    			siembra.setEstado(Constantes.SIEMBRA_ACTIVA);        	
        	
    			BigDecimal bd = new BigDecimal(siembra.getNroplantas() / variedad.getPlantasm2());
    			bd = bd.setScale(2, RoundingMode.HALF_UP);
        	
    			siembra.setMetros_sem(bd.doubleValue());
        	
    			/*siembra.setMetros_sem(siembra.getNroplantas() / variedad.getPlantasm2());*/
        	    	
    			siembraService.insert(siembra);
        	
    			/*Actualizar Cama*/    	
    			cama.setMetros_ocu(cama.getMetros_ocu() + siembra.getMetros_sem());
    			cama.setEstado(Constantes.CAMA_SEMIOCUPADA);
        	
    			camaService.update(cama);
        	    	
    			return siembra(siembra, model); /*"siembra";*/
    		} else{
    			model.addAttribute("msgvariedad", "M2 a Sembrar Excede La Capacidad");
        		return siembraFind(siembra.getCama().getId(), model, siembra); /*"siembra_find/"+siembra.getCama().getId();*/        	
    		}
    	} else {
    		model.addAttribute("msgvariedad", "Variedad Sin Plantas x M2");
    		return siembraFind(siembra.getCama().getId(), model, siembra); /*"siembra_find/"+siembra.getCama().getId();*/
    	}    	    	
    }
	

	@PostMapping("/addSiembra")
	public String addSiembra(@ModelAttribute("siembra") Siembra siembra, Model model) {
		if (siembra.getCama() != null) {
			model.addAttribute("localizaciones", localizacionService.findLocalizacionesByCompania(siembra.getCama().getNave().getInvernadero().getLocalizacion().getCompania().getId()));
		}
		return "redirect:/siembra";
	}

}