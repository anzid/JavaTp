package fr.lhous.tp4.exo8;

import fr.lhous.tp4.exo7.Marin;

public class ComparableMarin implements Comparable<Marin>{
	private String nom,prenom;

	//constructeur vide
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
		if(this.getNom().equals(m.getNom())){ //les noms sont egaux on compare les prenoms
			return this.getPrenom().compareTo(m.getPrenom());
		}
		else{
			return this.getNom().compareTo(m.getNom());
		}
	}
}