package fr.lhous.tp2;

import java.util.Arrays;
import fr.lhous.tp1.Marin;

public class Equipage {
	public Marin[] marins;

	public Equipage(int taille){
		marins = new Marin[taille];
	}

	//ajouter un marin
	public boolean addMarin(Marin nouveauMarin){
		if(this.isMarinPresent(nouveauMarin) == true){
			return false;
		}
		else if(this.getNombreMarins() == this.marins.length){
			Equipage nouveauEquipage = this.etendEquipage(this.marins.length*(1+1/2));
			for(int i=0; i<nouveauEquipage.marins.length; i++){
				if(nouveauEquipage.marins[i] == null){
					nouveauEquipage.marins[i] = nouveauMarin;
					return true;
				}
			}
		}
		else{
			for(int i=0;i< marins.length; i++){
				if(marins[i] == null){
					marins[i] = nouveauMarin;
					return true;
				}
			}
		}
		return false;
	}

	// retourne le nombres des Marins dans l'equipage
	public int getNombreMarins(){
		int nbreMarins = 0;	// initialisation de nombre des Marins
		for(int i=0; i<marins.length; i++){	//on parcoure le tableau des Marins
			if(marins[i]!=null){	
				nbreMarins++;	
			}
		}
		return nbreMarins;
	}

	public boolean isMarinPresent(Marin m){
		for(int i=0; i<this.marins.length; i++){
			if(m==null){
			}
			else if(m.equals(this.marins[i])==true){
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "Equipage [marins=" + Arrays.toString(marins) + "]";
	}

	public boolean removeMarin(Marin m){
		if(isMarinPresent(m)== true){
			for(int i=0; i<marins.length; i++){
				if(m.equals(marins[i])==true){
					marins[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void clear(){
		for(int i=0; i<this.marins.length; i++)
			this.marins[i] = null;
	}

	public boolean addAllEquipage(Equipage equipe){
		int nbreDoublants = 0;
		for(int i=0; i<equipe.marins.length; i++){
			if(this.isMarinPresent(equipe.marins[i]) == true){
				nbreDoublants++;
			}
		}
		if(this.getNombreMarins()+equipe.getNombreMarins()-nbreDoublants>5){
			return false;
		}
		else{
			for(int i=0; i<this.getNombreMarins();i++){
				this.addMarin(equipe.marins[i]);
			}
			return true;
		}
	}

	public Equipage etendEquipage(int places){
		Equipage nouveauEquipage = new Equipage(this.marins.length+places);
		for(int i=0; i<this.getNombreMarins(); i++){
			nouveauEquipage.marins[i] = this.marins[i];
		}
		return nouveauEquipage;
	}

	@Override
	public int hashCode() {
		int j =0;
		int [] result = new int [this.getNombreMarins()];
		for(int i=0; i<this.marins.length; i++){
			if (this.marins[i] != null) {
				result[j] = marins[i].hashCode();
				j++;
			}
		}
		Arrays.sort(result);
		return Arrays.hashCode(result);
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
		if (!Arrays.equals(marins, other.marins))
			return false;
		return true;
	}
}
