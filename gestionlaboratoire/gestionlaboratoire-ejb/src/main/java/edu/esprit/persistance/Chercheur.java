package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Chercheur
 *
 */
@Entity
//@DiscriminatorValue(value="ch")
public class Chercheur extends Utilisateur implements Serializable {

	private String grade;
	private static final long serialVersionUID = 1L;

	public Chercheur() {
		super();
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
