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
	private String typeContrat;
	private String metier;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidat other = (Candidat) obj;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

}
