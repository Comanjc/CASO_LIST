package pe.universidad.caso.Entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Alumno_Matricula implements Serializable{
	
	
	private static final long serialVersionUID= 1L ;
	private int id_alumno;
	private int id_asignatura;
	private int id_curso_escolar;	

}

