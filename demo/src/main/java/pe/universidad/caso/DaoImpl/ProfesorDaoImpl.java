package pe.universidad.caso.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.universidad.caso.Dao.Operaciones;
import pe.universidad.caso.Entity.Profesor;
@Component
public class ProfesorDaoImpl implements Operaciones<Profesor>{
	
   @Autowired
   private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Profesor t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO detalle (idprestamo, idlibro) VALUES (?,?)",
				new Object[] {t.getId_profesor(),t.getId_departamento()});
	}

	@Override
	public int update(Profesor t, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE detalle SET idprestamo=?, idlibro=? where iddetalle=?",
				new Object[] {t.getId_profesor(),t.getId_departamento()});
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM detalle WHERE iddetalle=?", id);
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("SELECT * FROM DETALLE WHERE iddetalle=?",
				new BeanPropertyRowMapper<Profesor>(Profesor.class), id);
	}


	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select pe.nombre as \"Profesor\",concat(pe.apellido1 ,' , ', pe.apellido2)  \"APELLIDOS\", d.nombre as \"Departamento\" \r\n"
				+ "from profesor p inner join departamento d on \r\n"
				+ "p.id_departamento = d.id inner join persona pe on \r\n"
				+ "p.id_profesor = pe.id");
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from persona;", new BeanPropertyRowMapper<Profesor>(Profesor.class));
	}
	
	


}
