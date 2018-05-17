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
	private String typeContrat;
	private String metier;

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
	 * @return the typeContrat
	 */
	public String getTypeContrat() {
		return typeContrat;
	}

	/**
	 * @param typeContrat
	 *            the typeContrat to set
	 */
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	/**
	 * @return the metier
	 */
	public String getMetier() {
		return metier;
	}

	/**
	 * @param metier
	 *            the metier to set
	 */
	public void setMetier(String metier) {
		this.metier = metier;
	}

}
