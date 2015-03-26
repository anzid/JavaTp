package fr.lhous.tp3.exo4;

import fr.lhous.tp3.exo3.Capitaine;
import fr.lhous.tp3.exo3.Marin;

public class TestEquipageCommande {

	public static void main(String[] args) {
		Capitaine capitaine = new Capitaine();
		Marin marin = new Marin();
		EquipageCommande equipadeCommonde = new EquipageCommande(5,capitaine);
		//EquipageCommande equipadeCommonde1 = new EquipageCommande(5,marin);
		/*impossible de mettre un marin à la place d'un capitaine
		 * parceque un marin n'est pas capitaine*/
	}
}