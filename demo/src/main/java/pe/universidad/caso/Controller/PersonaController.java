package pe.universidad.caso.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.universidad.caso.Entity.Persona;
import pe.universidad.caso.Service.PersonaService;



@RestController
public class PersonaController {
  
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/persona")
	public List<Persona> getList(){
		return personaService.readAll();
	}
}
