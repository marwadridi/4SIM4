package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competence
 *
 */
@Entity

public class Competence implements Serializable {

	   
	@Id
	private int id;
	private String nom;
	private static final long serialVersionUID = 1L;

	public Competence() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}
