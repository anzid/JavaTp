package fr.lhous.tp3.exo4;
import fr.lhous.tp2.Equipage;
import fr.lhous.tp3.exo3.Capitaine;

public class EquipageCommande extends Equipage{
	Capitaine commandant;
	
	public EquipageCommande() {
		super();
	}

	public EquipageCommande(int taille,Capitaine commandant) {
		super(taille);
		this.commandant=commandant;
	}
}
