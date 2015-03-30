package fr.lhous.tp7.exo13;

public class TestCart {

	public static void main(String[] args) {
		Cart panier = new Cart();
		Movie m1 = new Movie("le parrain", Categorie.DRAME, PriceCode.NORMAL);
		Movie m2 = new Movie("malefique", Categorie.AVENTURE, PriceCode.ENFANT);
		Movie m3 = new Movie("SpiderMan", Categorie.AVENTURE, PriceCode.NORMAL);
		Movie m4 = new Movie("VeryBadTrip", Categorie.COMEDIE, PriceCode.NOUVEAU);
		System.out.println(m1.getPrice(4));
		System.out.println(m2.getPrice(3));
		System.out.println(m3.getPrice(2));
		System.out.println(m4.getPrice(5));
		panier.addMovie(m1, 4);
		panier.addMovie(m1, 1);
		panier.addMovie(m2, 3);
		panier.addMovie(m3, 2);
		panier.addMovie(m4, 5);
		System.out.println(panier);
		System.out.println(panier.getPrice());
	}

}
