package edu.esprit.test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.persistance.Technicien;
import edu.esprit.persistance.Utilisateur;
import edu.esprit.services.UtilisateurServiceRemote;

public class UtilisateurServiceTest {

	public static void main(String[] args) throws NamingException {

		Context context = new InitialContext();

		UtilisateurServiceRemote proxy = (UtilisateurServiceRemote) context.lookup(
				"gestionlaboratoire-ear/gestionlaboratoire-ejb/UtilisateurService!edu.esprit.services.UtilisateurServiceRemote");

		
		//ajout d'un utilisateur : 
		
		Technicien technicien  = new Technicien();
		
		technicien.setNom("user1");
		technicien.setLogin("user1");
		technicien.setPassword("pass");
		technicien.setSpecialite("dev");
		
		//proxy.ajouterUtilisateur(technicien);
		
		// test recherche par id :
		
		//technicien = (Technicien) proxy.chercherParId(1);
		System.out.println(technicien);
		
		// test supprimer utilisateur :
		
		//proxy.supprimerUtilisateur(technicien);
		
		// test modifier utilisateur 
		
		technicien.setSpecialite("x");
		//proxy.modifierUtilisateu(technicien);
		
		//tous les techniciens:
		
		List<Technicien> techs= proxy.retournerTousLesTechniciens();
		
		for (Technicien technicien2 : techs) {
			System.out.println(technicien2.getNom());
		}
		
		// test identifier Utilisateur 
		
		Utilisateur x = proxy.identifierUtilisateur("user1", "pass");
		//System.out.println(x.getNom());
	}

}
