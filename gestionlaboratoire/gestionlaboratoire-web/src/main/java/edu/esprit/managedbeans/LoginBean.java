package edu.esprit.managedbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.esprit.persistance.Chercheur;
import edu.esprit.persistance.Technicien;
import edu.esprit.persistance.Utilisateur;
import edu.esprit.services.UtilisateurService;

@ManagedBean(name="lbean")
@SessionScoped
public class LoginBean {
	private String login;
	private String password;
	
	private Utilisateur utilisateur;
	
	@EJB
	UtilisateurService service;
	
	public LoginBean() {
		super();
	}
	
	public String doAuthentifier(){
		
		String navigateTo = null;
		utilisateur = service.identifierUtilisateur(login, password);
		
		if (utilisateur!=null){
			if (utilisateur instanceof Chercheur)
				navigateTo = "/chercheur/welcome";
			if (utilisateur instanceof Technicien)
				navigateTo = "/technicien/welcome?faces-redirect=true";
			
		}else{
			//navigateTo = "erreur";
			FacesContext.getCurrentInstance().addMessage("formId:buttonId", new FacesMessage("Erreur identification"));
		}
		
		return navigateTo;
	}
	
	public String doLogout(){
		
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
}
