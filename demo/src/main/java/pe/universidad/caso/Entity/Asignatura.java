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
public class Asignatura implements Serializable{
	
	private static final long serialVersionUID= 1L ;
	private int id;
	private String nombre;
	private double creditos;
	private String tipo;
	private String curso;
	private String cuatrimestre;
	private int id_profesor;
	private int id_grado;

	

}

