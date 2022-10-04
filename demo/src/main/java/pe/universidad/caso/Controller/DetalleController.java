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

import pe.universidad.caso.Entity.Alumno_Matricula;
import pe.universidad.caso.Service.AlumnoService;

@RestController
@RequestMapping("/api/alumno")
public class DetalleController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){
		return alumnoService.readAll2();
	}
	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll3(){
		return alumnoService.readAll3();
	}
	
	

	}
	

