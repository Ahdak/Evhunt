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
import com.marf.evhunt.model.Candidatures;

/**
 * @author ahmeddammak
 *
 */
@Repository
public class CandidaturesRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Candidatures> findByIdCandidat(long id) {
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from candidatures where id_candidat=?", new Object[] { id });
		return buildCandidatures(rows);
	}

	private List<Candidatures> buildCandidatures(List<Map<String, Object>> rows) {
		List<Candidatures> resut = Lists.newArrayList();
		for (Map<String, Object> row : rows) {
			Candidatures cand = new Candidatures();
			cand.setId((int) row.get("id"));
			cand.setIdCandidat((int) row.get("id_candidat"));
			cand.setIdPoste((int) row.get("id_poste"));
			cand.setEtat((String) row.get("etat"));
			resut.add(cand);
		}
		return resut;
	}

	public List<Candidatures> findByIdPoste(long id) {
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from candidatures where id_poste=?", new Object[] { id });
		return buildCandidatures(rows);
	}

	public void ajouterCandidature(long idCandidat, long idPoste, String statut) {
		jdbcTemplate.update("insert into candidatures (id_candidat,id_poste,etat) values(?,?,?);", idCandidat, idPoste, statut);
	}
}
