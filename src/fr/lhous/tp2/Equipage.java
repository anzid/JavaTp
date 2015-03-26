package fr.lhous.tp2;

import java.util.Arrays;
//import fr.lhous.tp1.Marin;//importer la classe Marin
import fr.lhous.tp3.exo3.*;

public class Equipage {		
	public Marin[] marins;

	public Equipage(){		//constructeur vide 
	}

	public Equipage(int taille){	//constructeur d'un tableau de marins
		marins = new Marin[taille];
	}

	//ajouter un marin
	public boolean addMarin(Marin nouveauMarin){
		if(nouveauMarin == null){
			return false;
		}
		if(this.isMarinPresent(nouveauMarin) == true){	//test si le marin est deja present
			return false;
		}
		if(this.getNombreMarins() == this.marins.length){	//test si le tableau de marins et plein
			Equipage nouveauEquipage = this.etendEquipage(this.marins.length*(1+1/2));	// on etend le tableau de 50%
			for(int i=0; i<nouveauEquipage.marins.length; i++){
				if(nouveauEquipage.marins[i] == null){ //on checrche la premiere case vide du tableau
					nouveauEquipage.marins[i] = nouveauMarin;	// on ajoute le nouveau marin dans la case vide
					return true;
				}
			}
		}
		else{	//il y'a de la place pour le nouveau marin
			for(int i=0;i< marins.length; i++){
				if(marins[i] == null){
					marins[i] = nouveauMarin;	//ajout du nouveau marin
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

	//test si le marin est present dans l'equipage
	public boolean isMarinPresent(Marin m){
		for(int i=0; i<this.marins.length; i++){
			if(m==null){
				return false;
			}
			else if(m.equals(this.marins[i])==true){
				return true;
			}
		}
		return false; 	//si le deux premiers test ont echoué
	}

	//retirer un marin de l'equipage
	public boolean removeMarin(Marin m){
		if(isMarinPresent(m)== true){	//test si le marin est present
			for(int i=0; i<marins.length; i++){	//on parcour le tableau d'equipage
				if(m.equals(marins[i])==true){	// on retrouve la marin a retirer
					marins[i] = null;
					return true;
				}
			}
		}
		return false;	//si le marin a retirer n'est pas present
	}

	//effacer le contenue de l'equipage
	public void clear(){
		for(int i=0; i<this.marins.length; i++)
			this.marins[i] = null;
	}

	//ajouter un equipage de marins dans un autre 
	public boolean addAllEquipage(Equipage equipe){
		int nbreDoublants = 0;	// nombre de marins doublants dans les deux equipage
		for(int i=0; i<equipe.marins.length; i++){
			if(this.isMarinPresent(equipe.marins[i]) == true){
				nbreDoublants++;
			}
		}
		if(this.getNombreMarins()+equipe.getNombreMarins()-nbreDoublants>this.marins.length){
			return false;
		}
		else{
			for(int i=0; i<equipe.marins.length;i++){
				this.addMarin(equipe.marins[i]);
			}
			return true;
		}
	}

	//ajouter des places dans l'equipage
	public Equipage etendEquipage(int places){
		Equipage nouveauEquipage = new Equipage(this.marins.length+places);	//creation d'un nouveau equipage
		for(int i=0; i<this.marins.length; i++){
			nouveauEquipage.marins[i] = this.marins[i];
		}
		return nouveauEquipage;
	}
	//ici on prend en compte que deux equipages sont egaux meme si leurs equipage ne sont pas dans le meme ordre
	@Override
	public int hashCode() {
		int j =0;
		int [] result = new int [this.getNombreMarins()];// tableau de hashcode des marins
		for(int i=0; i<this.marins.length; i++){
			if (this.marins[i] != null) {
				result[j] = marins[i].hashCode();
				j++;
			}
		}
		Arrays.sort(result);	//trier le tableau d'hashcode
		return Arrays.hashCode(result);	//hashcode du tableau result
	}

	//generer par eclipse
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

	@Override
	public String toString() {
		return "Equipage [marins=" + Arrays.toString(marins) + "]";
	}
}
