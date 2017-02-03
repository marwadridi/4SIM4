package edu.esprit.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.persistance.Laboratoire;
import edu.esprit.persistance.Technicien;
import edu.esprit.persistance.Utilisateur;

@Remote
public interface UtilisateurServiceRemote {

	void ajouterUtilisateur(Utilisateur utilisateur);

	void supprimerUtilisateur(Utilisateur utilisateur);

	Utilisateur chercherParId(int id);

	Utilisateur modifierUtilisateu(Utilisateur utilisateur);

	List<Technicien> retournerTousLesTechniciens();

	Utilisateur identifierUtilisateur(String login, String password);

	void ajouterLaboratroire(Laboratoire laboratoire);

	Laboratoire chercherLaboParId(int id);

	void affecterLaboUtilisateur(Laboratoire laboratoire, Utilisateur utilisateur);

}
