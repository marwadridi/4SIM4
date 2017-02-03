package edu.esprit.test;

import edu.esprit.persistance.Competence;
import edu.esprit.persistance.Technicien;
import edu.esprit.services.CompetenceServiceRemote;
import edu.esprit.services.UtilisateurServiceRemote;
import edu.esprit.utils.GetProxy;

public class CompetenceService {

	public static void main(String[] args) {

		
		UtilisateurServiceRemote proxy=(UtilisateurServiceRemote) 
				GetProxy.getProxy
				("gestionlaboratoire-ear/gestionlaboratoire-ejb"
						+ "/UtilisateurService!edu.esprit.services.UtilisateurServiceRemote");
		
		
		CompetenceServiceRemote proxyComp= (CompetenceServiceRemote)
				GetProxy.getProxy
				("gestionlaboratoire-ear/gestionlaboratoire-ejb"
						+ "/CompetenceService!edu.esprit.services.CompetenceServiceRemote");
		
		Technicien tech = (Technicien) proxy.chercherParId(1);
		Competence comp = new Competence();
		
		
		comp.setId(2);
		comp.setNom("android");
		
		proxyComp.ajouterCompetence(comp);
		
		proxyComp.affecterCompetenceTechnicien(comp, tech);
		
		
		
	}
	
	
	

}
