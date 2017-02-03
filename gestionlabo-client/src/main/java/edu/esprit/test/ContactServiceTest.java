package edu.esprit.test;

import edu.esprit.persistance.Contact;
import edu.esprit.persistance.Technicien;
import edu.esprit.services.ContactServiceRemote;
import edu.esprit.services.UtilisateurServiceRemote;
import edu.esprit.utils.GetProxy;

public class ContactServiceTest {

	public static void main(String[] args) {

		
		ContactServiceRemote proxyContact = (ContactServiceRemote) GetProxy.getProxy
				("gestionlaboratoire-ear/gestionlaboratoire-ejb/"
				+ "ContactService!edu.esprit.services.ContactServiceRemote");
		
		
		UtilisateurServiceRemote proxyUser=(UtilisateurServiceRemote) 
				GetProxy.getProxy
				("gestionlaboratoire-ear/gestionlaboratoire-ejb"
						+ "/UtilisateurService!edu.esprit.services.UtilisateurServiceRemote");

		Contact  contact = new Contact();
		contact.setEmail("contact@esprit.tn");
		contact.setAdresse("ariana");
		//proxyContact.ajouterContact(contact);
		
		
		Technicien technicien = new Technicien();
		technicien.setLogin("log");
		technicien.setNom("x");
		technicien.setSpecialite("dev");
		
		//proxyUser.ajouterUtilisateur(technicien);
		
		/*
		 * affecter contact à utilisateur 
		 */
		
		technicien= (Technicien) proxyUser.chercherParId(1);
		contact=proxyContact.chercherContact(1);
		
		proxyContact.affecterContactUtilisateur(contact, technicien);
		
		
	}

}
