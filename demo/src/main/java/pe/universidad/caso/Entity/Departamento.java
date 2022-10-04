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
public class Departamento  implements Serializable{
    
	private static final long serialVersionUID= 1L ;
	private int id;
	private String nombre;
	
}
