package fr.lhous.tp4.exo8;

import fr.lhous.tp4.exo7.Marin;

public class ComparableMarin implements Comparable<Marin>{
	private String nom,prenom;
	
	ComparableMarin(){
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

	@Override
	public int compareTo(Marin m) {
		if(this.getNom().equals(m.getNom())){
			return this.getNom().compareTo(m.getNom());
		}
		else{
			return this.getPrenom().compareTo(m.getPrenom());
		}
	}
}

	


