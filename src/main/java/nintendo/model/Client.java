package nintendo.model;

import java.util.ArrayList;

public class Client 
{
	private String nom;
	private String prenom;
	private ArrayList<String> listeAchats = new ArrayList();
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public ArrayList<String> getListeAchats() {
		return listeAchats;
	}
	public void setListeAchats(ArrayList<String> listeAchats) {
		this.listeAchats = listeAchats;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}
	
}
