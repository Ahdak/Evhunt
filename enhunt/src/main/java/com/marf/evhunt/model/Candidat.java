/**
 * 
 */
package com.marf.evhunt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmeddammak
 *
 */
public class Candidat {

	private Long id;
	private String prenom;
	private String nom;
	private String mobile;
	private String mail;
	private String titre;
	private List<String> experiences = new ArrayList<>();
	private String competences;
	private String etudes;
	private String langues;
	private String controleValideRh;
	private int idSource;
	private Sources source;

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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre
	 *            the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the experiences
	 */
	public List<String> getExperiences() {
		return experiences;
	}

	/**
	 * @param experiences
	 *            the experiences to set
	 */
	public void setExperiences(List<String> experiences) {
		this.experiences = experiences;
	}

	/**
	 * @return the competences
	 */
	public String getCompetences() {
		return competences;
	}

	/**
	 * @param competences
	 *            the competences to set
	 */
	public void setCompetences(String competences) {
		this.competences = competences;
	}

	/**
	 * @return the etudes
	 */
	public String getEtudes() {
		return etudes;
	}

	/**
	 * @param etudes
	 *            the etudes to set
	 */
	public void setEtudes(String etudes) {
		this.etudes = etudes;
	}

	/**
	 * @return the langue
	 */
	public String getLangues() {
		return langues;
	}

	/**
	 * @param langue
	 *            the langues to set
	 */
	public void setLangues(String langues) {
		this.langues = langues;
	}

	/**
	 * @return the controleValideRh
	 */
	public String getControleValideRh() {
		return controleValideRh;
	}

	/**
	 * @param controleValideRh
	 *            the controleValideRh to set
	 */
	public void setControleValideRh(String controleValideRh) {
		this.controleValideRh = controleValideRh;
	}

	/**
	 * @return the source
	 */
	public Sources getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(Sources source) {
		this.source = source;
	}

	/**
	 * @return the idSource
	 */
	public int getIdSource() {
		return idSource;
	}

	/**
	 * @param idSource
	 *            the idSource to set
	 */
	public void setIdSource(int idSource) {
		this.idSource = idSource;
	}

}
