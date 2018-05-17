/**
 * 
 */
package com.marf.evhunt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marf.evhunt.model.AvisRh;
import com.marf.evhunt.model.Candidatures;
import com.marf.evhunt.model.Postes;

/**
 * @author ahmeddammak
 *
 */
@RestController
public class PostesController {

	@Autowired
	PostesRepository posteRepository;

	@Autowired
	CandidaturesRepository candidaturesRepository;

	@Autowired
	AvisRhRepository avisRhRepository;

	@RequestMapping(value = "/findAllPostes", method = RequestMethod.GET, produces = "application/json")
	public List<Postes> findAllPostes() {
		return posteRepository.findAll();
	}

	@RequestMapping(value = "/findCandidatureByPosteId", method = RequestMethod.GET, produces = "application/json")
	public List<Candidatures> findCandidatureByPosteId(@RequestParam(name = "id", required = true) long id) {
		return candidaturesRepository.findByIdPoste(id);
	}

	@RequestMapping(value = "/findCandidatureByCandidatId", method = RequestMethod.GET, produces = "application/json")
	public List<Candidatures> findCandidatureByCandidatId(@RequestParam(name = "id", required = true) long id) {
		return candidaturesRepository.findByIdCandidat(id);
	}

	@RequestMapping(value = "/findAvisRhByCandidatId", method = RequestMethod.GET, produces = "application/json")
	public List<AvisRh> findAvisRhByCandidatId(@RequestParam(name = "id", required = true) long id) {
		return avisRhRepository.findByIdCandidat(id);
	}

	@RequestMapping(value = "/addAvisRh", method = RequestMethod.GET, produces = "application/json")
	public String addAvisRh(@RequestParam(name = "avisRh", required = true) String avisRh, @RequestParam(name = "idCandidat", required = true) long idCandidat,
			@RequestParam(name = "nomRH", required = true) String nomRH) {
		return avisRhRepository.storeAvisRh(avisRh, idCandidat, nomRH);
	}
}
