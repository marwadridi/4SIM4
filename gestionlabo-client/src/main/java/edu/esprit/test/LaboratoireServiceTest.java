package edu.esprit.test;

import edu.esprit.persistance.Laboratoire;
import edu.esprit.persistance.Technicien;
import edu.esprit.services.UtilisateurServiceRemote;
import edu.esprit.utils.GetProxy;

public class LaboratoireServiceTest {

	public static void main(String[] args) {
		
		

		UtilisateurServiceRemote proxy=(UtilisateurServiceRemote) 
				GetProxy.getProxy
				("gestionlaboratoire-ear/gestionlaboratoire-ejb"
						+ "/UtilisateurService!edu.esprit.services.UtilisateurServiceRemote");
		
		
		Laboratoire labo = new Laboratoire();
		labo.setNom("labo");
		labo.setAdresse("esprit");
		labo.setId(1);
		
		proxy.ajouterLaboratroire(labo);
		
		/*
		 * affectation technicien labo 
		 */

		Technicien technicien = (Technicien) proxy.chercherParId(1);
		proxy.affecterLaboUtilisateur(labo, technicien);
	}

}
