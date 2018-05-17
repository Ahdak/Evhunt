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
import com.marf.evhunt.model.AvisRh;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class AvisRhRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<AvisRh> findByIdCandidat(long id) {
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from avis_rh where id_candidat=?", new Object[] { id });
		return buildAvisRh(rows);
	}

	private List<AvisRh> buildAvisRh(List<Map<String, Object>> rows) {
		List<AvisRh> resut = Lists.newArrayList();
		for (Map<String, Object> row : rows) {
			AvisRh avisR = new AvisRh();
			avisR.setId((int) row.get("id"));
			avisR.setIdCandidat((int) row.get("id_candidat"));
			avisR.setAvis((String) row.get("avis"));
			avisR.setDateAvis((String) row.get("date_Avis"));
			avisR.setRhName((String) row.get("rh_name"));
			resut.add(avisR);
		}
		return resut;
	}
}
