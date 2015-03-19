package fr.lhous.tp0.exo2;	//définir l'arborescence de la classe
import java.math.BigInteger;	//importer la class BigInteger de java.math

public class Factorielle{
	// calcule le factorielle d'un entier, le cas ou l'utilisateur entre un bombre negatif est gere
	public int factorielle(int nbre) throws FactorielleException{	
		int resultat =1;	//initialiser la variable resultat
		if(nbre>0){
			for(int i=2; i<=nbre; i++){
				resultat = resultat * i;
			}	
		}
		else if (nbre==0){  
			return 1;
		}
		else {
			throw new FactorielleException("le factorielle n'est pas definit pour les nombres negatives");
		}

		return resultat;
	}

	// calcule le factorielle d'un double, ,le cas ou l'utilisateur entre un bombre negatif est gere
	public double factorielleDouble(double nbre) throws FactorielleException{
		double resultat = 1;
		if(nbre>0){
			for(int i=2; i<=nbre; i++){
				resultat = resultat * i;
			}
		}
		else if (nbre==0){
			return 1;
		}
		else {
			throw new FactorielleException("le factorielle n'est pas definit pour les nombres negatives");
		}

		return (int) resultat;
	}

	// calcule le factorielle d'un BigInteger, le cas ou l'utilisateur entre un bombre negatif est gere
	public BigInteger factorielleBi(int nbre) throws FactorielleException{
		BigInteger result = new BigInteger("1"); //BigInteget est une classe
		if(nbre>0){
			for(int i=2; i<=nbre; i++){
				result = result.multiply(new BigInteger(Integer.toString(i)));
			}
		}
		else if (nbre==0){
			return new BigInteger("1");
		}

		else {
			throw new FactorielleException("le factorielle n'est pas definit pour les nombres negatives");
		}
		return result;
	}
}
