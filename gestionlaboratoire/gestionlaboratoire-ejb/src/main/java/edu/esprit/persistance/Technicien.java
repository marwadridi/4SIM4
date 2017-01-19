package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Technicien
 *
 */
@Entity

public class Technicien extends Utilisateur implements Serializable {

	private String specialite;
	private static final long serialVersionUID = 1L;

	public Technicien() {
		super();
	}

	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}
