/**
 * 
 */
package com.marf.evhunt;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marf.evhunt.model.Candidat;
import com.marf.evhunt.model.Experience;
import com.marf.evhunt.model.Sources;
import com.marf.evhunt.service.helper.FileterCandidatHelper;
import com.marf.evhunt.service.helper.WatsonServiceHelper;
import com.marf.evhunt.workflow.model.StoreCandidatResponse;
import com.marf.evhunt.workflow.service.StoreCandidatService;

/**
 * @author ahmeddammak
 *
 */
@RestController
public class CandidatController {

	private WatsonServiceHelper watsonServiceHelper = new WatsonServiceHelper();

	@Autowired
	CandidatRepository candidatRepository;

	@Autowired
	ExperienceRepository experienceRepository;

	@Autowired
	SourcesRepository sourcesRepository;

	@Autowired
	AvisRhRepository avisRHRepository;

	@RequestMapping(value = "/parseCv", method = RequestMethod.GET, produces = "application/json")
	public Candidat parseCv(@RequestParam(name = "cv", required = true) String cv) {
		return watsonServiceHelper.parseCv(cv);
	}

	@RequestMapping(value = "/findCandidatById", method = RequestMethod.GET, produces = "application/json")
	public Candidat findCandidatById(@RequestParam(name = "id", required = true) long id) {
		Candidat candidat = candidatRepository.findById(id);
		updateCandidat(candidat);
		return candidat;
	}

	private void updateExperiences(Candidat candidat) {
		List<Experience> exp = experienceRepository.findByIdCandidat(candidat.getId());
		candidat.setExperiences(exp.stream().map(Experience::getDescription).collect(Collectors.toList()));
	}

	@RequestMapping(value = "/findAllCandidats", method = RequestMethod.GET, produces = "application/json")
	public List<Candidat> findAllCandidats() {
		List<Candidat> result = candidatRepository.findAll();
		result.forEach(c -> updateCandidat(c));
		return result;
	}

	private void updateCandidat(Candidat candidat) {
		updateExperiences(candidat);
		updateSource(candidat);
	}

	private void updateSource(Candidat candidat) {
		List<Sources> sources = sourcesRepository.findAll();
		candidat.setSource(sources.stream().filter(s -> s.getId() == candidat.getIdSource()).findFirst().orElse(Sources.DEFAULT));
	}

	@RequestMapping(value = "/storeCandidat", method = RequestMethod.GET, produces = "application/json")
	public StoreCandidatResponse storeCandidat(@RequestParam(name = "id_source", required = true) int idSource, @RequestParam(name = "cv", required = true) String cv,
			@RequestParam(name = "avisRh", required = false) String avisRh, @RequestParam(name = "nomRh", required = false) String nomRH) {
		Candidat candidat = watsonServiceHelper.parseCv(cv);
		candidatRepository.store(candidat, idSource);
		experienceRepository.store(candidat);
		if (avisRh != null) {
			avisRHRepository.storeAvisRh(avisRh, candidat.getId(), nomRH);
		}
		return StoreCandidatService.getInstance().buildResponse(candidat);
	}

	@RequestMapping(value = "/filterCandidats", method = RequestMethod.GET, produces = "application/json")
	public List<Candidat> findAllCandidats(@RequestParam(name = "keywords", required = true) String keywords) {
		return FileterCandidatHelper.getInstance().filter(findAllCandidats(), keywords);
	}

	@RequestMapping(value = "/updateSouhait", method = RequestMethod.GET, produces = "application/json")
	public String updateSouhait(@RequestParam(name = "id_candidat", required = true) long idCanddiat, @RequestParam(name = "type_contrat", required = true) String typeContrat,
			@RequestParam(name = "metier", required = true) String metier) {
		return candidatRepository.updateSouhait(idCanddiat, typeContrat, metier);
	}

}
