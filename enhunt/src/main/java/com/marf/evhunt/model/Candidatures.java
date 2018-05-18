/**
 * 
 */
package com.marf.evhunt.model;

/**
 * @author ahmeddammak
 *
 */
public class Candidatures {

	private int id;
	private long idCandidat;
	private long idPoste;
	private String etat;
	private String nomPoste;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idCandidat
	 */
	public long getIdCandidat() {
		return idCandidat;
	}

	/**
	 * @param idCandidat
	 *            the idCandidat to set
	 */
	public void setIdCandidat(long idCandidat) {
		this.idCandidat = idCandidat;
	}

	/**
	 * @return the idPoste
	 */
	public long getIdPoste() {
		return idPoste;
	}

	/**
	 * @param idPoste
	 *            the idPoste to set
	 */
	public void setIdPoste(long idPoste) {
		this.idPoste = idPoste;
	}

	/**
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * @param etat
	 *            the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	 * @return the nomPoste
	 */
	public String getNomPoste() {
		return nomPoste;
	}

	/**
	 * @param nomPoste
	 *            the nomPoste to set
	 */
	public void setNomPoste(String nomPoste) {
		this.nomPoste = nomPoste;
	}

}
