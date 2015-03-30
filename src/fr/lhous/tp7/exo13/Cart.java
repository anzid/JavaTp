package fr.lhous.tp7.exo13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	//private List<Movie> movies= new ArrayList<Movie>();
	private Map <Movie, Integer> movies = new HashMap<Movie, Integer>();

	public Cart(){
	}

	public void addMovie(Movie movie, int nbreJours){
		if(this.movies.containsKey(movie)){
			movies.put(movie, movies.get(movie)+ nbreJours);
		}
		else{
			movies.put(movie, nbreJours);
		}
	}

	public void removeMovie(Movie movie){
		this.movies.remove(movie);
	}

	public double getPrice(){
		double totalPrice = 0;
		Collection<Movie> movies = this.movies.keySet();
		for(Movie m : movies){
			totalPrice = Double.sum(totalPrice, Double.valueOf(m.getPrice(this.movies.get(m))));
		}
		return totalPrice;
	}
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
