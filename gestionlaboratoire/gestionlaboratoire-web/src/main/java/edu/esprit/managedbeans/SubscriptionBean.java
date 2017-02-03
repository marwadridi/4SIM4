package edu.esprit.managedbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.esprit.persistance.Contact;
import edu.esprit.persistance.Technicien;
import edu.esprit.services.UtilisateurService;

@ManagedBean (name="sbean")
@SessionScoped
public class SubscriptionBean {
	
	
	private Technicien technicien = new Technicien();
	
	private Contact contact = new Contact();
	
	@EJB
	UtilisateurService utilisateurService ;
	
	
	public String doCancel(){
		
		technicien = new Technicien();
		contact = new Contact();
		
//		FacesContext.getCurrentInstance().getExternalContext()
//		.invalidateSession();
		
		return "step1?faces-redirect=true";
	}
	public void doAdd(){
		
		technicien.setContact(contact);
		utilisateurService.ajouterUtilisateur(technicien);
		
		FacesContext.getCurrentInstance().addMessage
		("form:btn", new FacesMessage("utilisateur ajouté avec succés"));
		
	}

	public Technicien getTechnicien() {
		return technicien;
	}

	public void setTechnicien(Technicien technicien) {
		this.technicien = technicien;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
