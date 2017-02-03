package edu.esprit.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import edu.esprit.persistance.Laboratoire;
import edu.esprit.persistance.Technicien;
import edu.esprit.persistance.Utilisateur;

/**
 * Session Bean implementation class UserService
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
		em.remove(em.find(Utilisateur.class, utilisateur.getId()));
		// em.remove(em.merge(utilisateur));
	}

	@Override
	public Utilisateur chercherParId(int id) {
		return em.find(Utilisateur.class, id);

	}

	@Override
	public Utilisateur modifierUtilisateu(Utilisateur utilisateur) {
		return em.merge(utilisateur);
	}

	@Override
	public List<Technicien> retournerTousLesTechniciens() {

		String requete = "select t from Technicien t";

		return em.createQuery(requete, Technicien.class).getResultList();

	}

	@Override
	public Utilisateur identifierUtilisateur(String login, String password) {

		Utilisateur utilisateur = null;
		String requete = "select u from Utilisateur u where u.login=:x and u.password=:y";
		try {
			utilisateur = em.createQuery(requete, Utilisateur.class).setParameter("x", login)
					.setParameter("y", password).getSingleResult();

		} catch (NoResultException ex) {
			System.out.println("pas de résultat");
		}
		return utilisateur;
	}

	@Override
	public void ajouterLaboratroire(Laboratoire laboratoire) {
		em.persist(laboratoire);

	}

	@Override
	public Laboratoire chercherLaboParId(int id) {
		return em.find(Laboratoire.class, id);
	}

	@Override
	public void affecterLaboUtilisateur(Laboratoire laboratoire, Utilisateur utilisateur) {
		utilisateur.setLaboratoire(laboratoire);
		em.merge(utilisateur);

	}

}
