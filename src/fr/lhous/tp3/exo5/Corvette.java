package fr.lhous.tp3.exo5;
import fr.lhous.tp3.exo4.EquipageCommande;

public class Corvette extends Bateau{
	private TypeBateau typeBteau;
	
	public Corvette(String nom, int tonnage, EquipageCommande equipageCommande) {
		super(nom, tonnage, equipageCommande);
		this.typeBteau = TypeBateau.Corvette;
	}
	
	public String getTypeBateau(){
		return TypeBateau.Corvette.toString();
		
	}
}
