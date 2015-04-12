package fr.lhous.tp7.exo13;

public class Movie {
	private String  title;
	private Categorie categorie;
	private PriceCode priceCode;
	
	public Movie(String title, Categorie categorie, PriceCode priceCode){
		this.title = title;
		this.categorie = categorie;
		this.priceCode = priceCode;
	}
	
	//retourne le prix d'un article, on peut le faire avec swich case
	public double getPrice(int nbreJours){
		double price = 0;
		if(this.priceCode == PriceCode.NORMAL){
			if(nbreJours <=2){
				price = 2;
			}
			else{
				price = 2 + 1.5*(nbreJours - 2);
			}
		}
		if(this.priceCode == PriceCode.NOUVEAU){
			price = 1*nbreJours;
		}
		if(this.priceCode == PriceCode.ENFANT){
			if(nbreJours <= 3){
				price = 1.5;
			}
			else{
				price = 1.5 + 1.5*(nbreJours - 3);
			}
		}
		return price;
	}

	public PriceCode getPriceCode() {
		return priceCode;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", categorie=" + categorie
				+ ", priceCode=" + priceCode + "]";
	}
	
}

