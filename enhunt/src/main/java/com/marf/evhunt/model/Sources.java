/**
 * 
 */
package com.marf.evhunt.model;

/**
 * @author ahmeddammak
 *
 */
public class Sources {

	public static final Sources DEFAULT = new Sources("RECOMMANDATION") ;

	private Long id;
	private String nom;
	private String dateSource;

	public Sources() {
		super();
	}

	public Sources(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the dateSource
	 */
	public String getDateSource() {
		return dateSource;
	}

	/**
	 * @param dateSource
	 *            the dateSource to set
	 */
	public void setDateSource(String dateSource) {
		this.dateSource = dateSource;
	}

}
