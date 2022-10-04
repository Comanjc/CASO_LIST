package pe.universidad.caso.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.universidad.caso.Entity.Profesor;
import pe.universidad.caso.Service.ProfesorService;
	
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	
	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll2(){
		return profesorService.readAll2();
	}
	

	

	}
	

