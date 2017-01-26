package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "t_user")
// @DiscriminatorColumn(name="type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1555555555L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@Column(name = "c_nom")
	private String nom;
	
	private String login;
	private String password;

	@ManyToOne
	private Laboratoire laboratoire ;
	
	@OneToOne
	private Contact contact;
	
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

}
