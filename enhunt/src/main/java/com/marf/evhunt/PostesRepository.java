/**
 * 
 */
package com.marf.evhunt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.marf.evhunt.model.Postes;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class PostesRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Postes findById(long id) {
		return jdbcTemplate.queryForObject("select * from postes where id=?", new Object[] { id }, new BeanPropertyRowMapper<Postes>(Postes.class));
	}

	public List<Postes> findAll() {
		String sql = "SELECT * FROM Postes";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Postes>(Postes.class));
	}
}
