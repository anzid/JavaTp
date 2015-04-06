package fr.lhous.tp4.exo6;

import java.util.ArrayList;
import java.util.List;


//import fr.lhous.tp1.Marin;//importer la classe Marin
import fr.lhous.tp3.exo3.*;

public class Equipage {
	public List<Marin> marins = new ArrayList<Marin>();

	public Equipage(){
	}

	//ajouter un marin parceuqe List autorise les doublants
	public boolean addMarin(Marin nouveauMarin){
		if(this.marins.contains(nouveauMarin) == true){
			return false;
		}
		else{
			this.marins.add(nouveauMarin);
			return true;
		}
	}

	@Override
	public String toString() {
		return "Equipage [marins=" + marins + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marins == null) ? 0 : marins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipage other = (Equipage) obj;
		if (marins == null) {
			if (other.marins != null)
				return false;
		} else if (!marins.equals(other.marins))
			return false;
		return true;
	}
}