package pe.universidad.caso.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.universidad.caso.Dao.Todo;
import pe.universidad.caso.DaoImpl.PersonaDaoImpl;
import pe.universidad.caso.Entity.Persona;
@Service
public class PersonaService implements Todo<Persona> {
	
	@Autowired
	private  PersonaDaoImpl DaoImpl;

	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll();
	}
	


}
