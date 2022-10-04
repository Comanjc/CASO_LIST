package pe.universidad.caso.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import pe.universidad.caso.Dao.Todo;
import pe.universidad.caso.Entity.Persona;

@Component
public class PersonaDaoImpl  implements Todo<Persona>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

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
		return jdbcTemplate.query("select *from persona", new BeanPropertyRowMapper<Persona>(Persona.class));
	}

}
