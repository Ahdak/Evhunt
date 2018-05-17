/**
 * 
 */
package com.marf.evhunt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.marf.evhunt.model.Candidat;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class CandidatRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Candidat findById(long id) {
		return jdbcTemplate.queryForObject("select * from candidat where id=?", new Object[] { id }, new BeanPropertyRowMapper<Candidat>(Candidat.class));
	}

	public List<Candidat> findAll() {
		String sql = "SELECT * FROM candidat";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Candidat>(Candidat.class));
	}
}
