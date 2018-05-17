/**
 * 
 */
package com.marf.evhunt.workflow.service;

import com.marf.evhunt.model.Candidat;
import com.marf.evhunt.workflow.model.StoreCandidatResponse;

/**
 * @author ahmeddammak
 *
 */
public class StoreCandidatService {

	private static StoreCandidatService instance;

	public static StoreCandidatService getInstance() {
		if (instance == null) {
			instance = new StoreCandidatService();
		}
		return instance;
	}

	public StoreCandidatResponse buildResponse(Candidat candidat) {
		String status = "POSTULE";
		String message = "Votre candidature a ete enregistree. Votre id est " + candidat.getId() + ". Un mail est envoye au mail " + candidat.getMail();
		return new StoreCandidatResponse(status, message, candidat);
	}

}
