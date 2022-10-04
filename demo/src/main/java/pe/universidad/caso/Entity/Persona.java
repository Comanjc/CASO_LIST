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

public class Persona implements Serializable {
	
	private static final long serialVersionUID= 1L ;
	private int id;
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String fecha_nacimiento;
	private String sexo;
	private String tipo;
	                                                                                                                                                       
	
}
