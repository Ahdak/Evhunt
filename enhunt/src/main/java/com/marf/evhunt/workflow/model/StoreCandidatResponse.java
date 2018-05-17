/**
 * 
 */
package com.marf.evhunt.workflow.model;

import com.marf.evhunt.model.Candidat;

/**
 * @author ahmeddammak
 *
 */
public class StoreCandidatResponse {

	private String status;
	private String message;
	private Candidat candidat;

	public StoreCandidatResponse(String status, String message, Candidat candidat) {
		super();
		this.status = status;
		this.message = message;
		this.candidat = candidat;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the candidat
	 */
	public Candidat getCandidat() {
		return candidat;
	}

	/**
	 * @param candidat
	 *            the candidat to set
	 */
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

}
