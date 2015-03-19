package fr.lhous.tp0.exo2;

//classe qui entende la classe Exception pour gerer le cas ou l'utilisateur essaye de calculer le factorielle d'un nombre negatif
public class FactorielleException extends Exception{
	public FactorielleException(String s){
		super(s);	//variable de la superclass Exception
	}
}  
