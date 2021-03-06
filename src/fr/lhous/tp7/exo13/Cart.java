package fr.lhous.tp7.exo13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	//interface map pour utiliser les couple clé valeur
	private Map <Movie, Integer> movies = new HashMap<Movie, Integer>();

	//constructeur vide
	public Cart(){
	}

	//ajouter un film dans le paner
	public void addMovie(Movie movie, int nbreJours){
		if(this.movies.containsKey(movie)){	//verifier si l'article existe deja dans le panier
			movies.put(movie, movies.get(movie)+ nbreJours);	//on ecrase l'article present par le meme article avec nbreJours met à jour
		}
		else{
			movies.put(movie, nbreJours); //on ajoute l'article
		}
	}

	//retirer un article dans le panier
	public void removeMovie(Movie movie){
		this.movies.remove(movie);
	}

	//retourne le prix total d'un panier
	public double getPrice(){
		double totalPrice = 0;
		Collection<Movie> movies = this.movies.keySet();	//liste des articles
		for(Movie m : movies){	//parcour tout les articles
			//
			totalPrice = Double.sum(totalPrice, Double.valueOf(m.getPrice(this.movies.get(m))));
		}
		return totalPrice;
	}
	
	//retourne les points de fidelite d'un panier
	public double getFidelityPoints(){
		double fedilityPoints = 0;
		Collection<Movie> movies = this.movies.keySet();
		for(Movie m : movies){
			if(m.getPriceCode() == PriceCode.NORMAL){
				if( this.movies.get(m)<=2){
					fedilityPoints = 1 + 1.5*this.movies.get(m);
				}
				else{
					fedilityPoints = 1;
				}
			}
			if(m.getPriceCode() == PriceCode.NOUVEAU){
				fedilityPoints = 3*this.movies.get(m);
			}
			if(m.getPriceCode() == PriceCode.ENFANT){
				if(this.movies.get(m)<=3){
					fedilityPoints = 1.5;
				}
				else{
					fedilityPoints = 1.5 + 1.5*this.movies.get(m);
				}
			}
		}
		return fedilityPoints;
	}

	@Override
	public String toString() {
		return "Cart [movies=" + movies + "]";
	}
}
