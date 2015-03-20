package fr.lhous.tp3.exo5;

import fr.lhous.tp3.exo4.EquipageCommande;

public class Croisseur extends Bateau{
private TypeBateau typeBteau;
	
	public Croisseur(String nom, int tonnage, EquipageCommande equipageCommande) {
		super(nom, tonnage, equipageCommande);
		this.typeBteau = TypeBateau.Croisseur;
	}
	
	public String getTypeBateau(){
		return TypeBateau.Croisseur.toString();
	}
}
