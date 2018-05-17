/**
 * 
 */
package com.marf.evhunt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.marf.evhunt.model.Sources;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class SourcesRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Sources findById(long id) {
		return jdbcTemplate.queryForObject("select * from Sources where id=?", new Object[] { id }, new BeanPropertyRowMapper<Sources>(Sources.class));
	}

	public List<Sources> findAll() {
		String sql = "SELECT * FROM Sources";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Sources>(Sources.class));
	}
}
