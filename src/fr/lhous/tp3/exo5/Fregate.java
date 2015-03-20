package fr.lhous.tp3.exo5;

import fr.lhous.tp3.exo4.EquipageCommande;

public class Fregate extends Bateau{
private TypeBateau typeBteau;  
	
	public Fregate(String nom, int tonnage, EquipageCommande equipageCommande) {
		super(nom, tonnage, equipageCommande);
		this.typeBteau = TypeBateau.Fregate;
	}
	
	public String getTypeBateau(){
		return TypeBateau.Fregate.toString();
	}
}
