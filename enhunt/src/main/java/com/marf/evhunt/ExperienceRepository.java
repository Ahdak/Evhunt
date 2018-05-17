/**
 * 
 */
package com.marf.evhunt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.common.collect.Lists;
import com.marf.evhunt.model.Candidat;
import com.marf.evhunt.model.Experience;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class ExperienceRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Experience> findByIdCandidat(long id) {
		// return jdbcTemplate.query("select * from experiences where
		// id_candidat=?", new Object[] { id }, new
		// BeanPropertyRowMapper<Experience>(Experience.class));

		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from experiences where id_candidat=?", new Object[] { id });
		List<Experience> resut = Lists.newArrayList();
		for (Map<String, Object> row : rows) {
			Experience exp = new Experience();
			exp.setDescription((String) row.get("description"));
			resut.add(exp);
		}
		return resut;
	}

	public void store(Candidat candidat) {
		candidat.getExperiences().forEach(exp -> jdbcTemplate.update("insert into experiences (id_candidat,description) values(?,?)", candidat.getId(), exp));
	}

}
