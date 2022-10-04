package pe.universidad.caso.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.universidad.caso.Dao.Operaciones;
import pe.universidad.caso.DaoImpl.AlumnoDaoImpl;
import pe.universidad.caso.Entity.Alumno_Matricula;
@Service
public class AlumnoService implements Operaciones<Alumno_Matricula>{
	@Autowired
	private AlumnoDaoImpl DaoIml;

	@Override
	public int create(Alumno_Matricula t) {
		// TODO Auto-generated method stub
		return DaoIml.create(t);
	}

	@Override
	public int update(Alumno_Matricula t, int id) {
		// TODO Auto-generated method stub
		return DaoIml.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return DaoIml.delete(id);
	}

	@Override
	public Alumno_Matricula read(int id) {
		// TODO Auto-generated method stub
		return DaoIml.read(id);
	}


	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DaoIml.readAll2();
	}
	
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return DaoIml.readAll3();
	}

	@Override
	public List<Alumno_Matricula> readAll() {
		// TODO Auto-generated method stub
		return 	null;
	}

}
