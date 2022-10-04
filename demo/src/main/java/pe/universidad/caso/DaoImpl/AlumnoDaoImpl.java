package pe.universidad.caso.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.universidad.caso.Dao.Operaciones;
import pe.universidad.caso.Entity.Alumno_Matricula;
@Component
public class AlumnoDaoImpl implements Operaciones<Alumno_Matricula>{
	
   @Autowired
   private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Alumno_Matricula t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO detalle (idprestamo, idlibro) VALUES (?,?)",
				new Object[] {t.getId_alumno(),t.getId_asignatura(),t.getId_curso_escolar()});
	}

	@Override
	public int update(Alumno_Matricula t, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE detalle SET idprestamo=?, idlibro=? where iddetalle=?",
				new Object[] {t.getId_asignatura(), t.getId_curso_escolar(), t.getId_alumno()});
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM detalle WHERE iddetalle=?", id);
	}

	@Override
	public Alumno_Matricula read(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("SELECT * FROM DETALLE WHERE iddetalle=?",
				new BeanPropertyRowMapper<Alumno_Matricula>(Alumno_Matricula.class), id);
	}


	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select p.nombre \"NOMBRE\" , concat(p.apellido1 , p.apellido2)  \"APELLIDOS\",G.nombre  \"GRADO\", A.curso  \"CURSO\", p.sexo   \"SEXO\" \r\n"
				+ "from alumno_se_matricula_asignatura AL inner join asignatura A \r\n"
				+ "on AL.id_asignatura = A.id inner join grado G on \r\n"
				+ "A.id_grado = G.id inner join curso_escolar C on \r\n"
				+ "AL.id_curso_escolar = C.id inner join persona p on\r\n"
				+ "AL.id_alumno = p.id");
	}
	
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select p.nombre \"NOMBRE\" , concat(p.apellido1 , p.apellido2)  \"APELLIDOS\", c.anyo_inicio \"ANO DE INICIO\",G.nombre\r\n"
				+ "from alumno_se_matricula_asignatura AL  inner join  curso_escolar C \r\n"
				+ "on AL.id_curso_escolar = c.id inner join persona p on\r\n"
				+ "AL.id_alumno = p.id inner join asignatura A \r\n"
				+ "on AL.id_asignatura = A.id inner join grado G on \r\n"
				+ "A.id_grado = G.id\r\n"
				+ "order by 3");
	}

	@Override
	public List<Alumno_Matricula> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
