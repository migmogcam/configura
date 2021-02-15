package project.configura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import project.configura.entites.Configuracion;
import project.configura.service.Configura;

@Controller
public class MainController {
	
	@Autowired
	private Configura configura;
	
	@GetMapping("/configura/index")
	public String infoProteccionDatos(Model model) {
		configura.populate();
		model.addAttribute("listado", configura.findAll());
		return "listado";
	}

}
