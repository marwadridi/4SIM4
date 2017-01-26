package edu.esprit.services;

import javax.ejb.Remote;

import edu.esprit.persistance.Utilisateur;

@Remote
public interface UtilisateurServiceRemote {

	void ajouterUtilisateur(Utilisateur utilisateur);

	void supprimerUtilisateur(Utilisateur utilisateur);

	Utilisateur chercherParId(int id);

	Utilisateur modifierUtilisateur(Utilisateur utilisateur);

}
