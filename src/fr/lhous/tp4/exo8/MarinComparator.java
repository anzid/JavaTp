package fr.lhous.tp4.exo8;

import java.util.Comparator;
import fr.lhous.tp4.exo7.Marin;

public class MarinComparator implements Comparator<Marin>  {
	//constructeur vide
	MarinComparator(){
	}

	//comparer deux marins
	@Override
	public int compare(Marin m1, Marin m2) {
		if(m1.getNom().equals(m2.getNom())){
			return m1.getPrenom().compareTo(m2.getPrenom());
		}
		else{
			return m1.getNom().compareTo(m2.getNom());
		}
	}
}