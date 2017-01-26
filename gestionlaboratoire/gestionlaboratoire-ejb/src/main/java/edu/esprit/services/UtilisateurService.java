package edu.esprit.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.persistance.Utilisateur;

/**
 * Session Bean implementation class UtilisateurService
 */
@Stateless
@LocalBean
public class UtilisateurService implements UtilisateurServiceRemote {

    /**
     * Default constructor. 
     */
    public UtilisateurService() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext
    EntityManager em;
    
	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) {
			em.persist(utilisateur);
	}

	@Override
	public void supprimerUtilisateur(Utilisateur utilisateur) {
		em.remove(utilisateur);
	}

	@Override
	public Utilisateur chercherParId(int id) {
		return em.find(Utilisateur.class, id);
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
		
		 return em.merge(utilisateur);
	}

}
