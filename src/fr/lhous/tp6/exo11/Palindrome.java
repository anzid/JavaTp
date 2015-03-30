package fr.lhous.tp6.exo11;

public class Palindrome {
	
	public Palindrome(){
	}
	
	//rechrche du plus grand nombre palindrome produit de deux nombres à 3 chiffres
	public int produitPalindrome(){
		int i =999*999;
			while( isProduit(i)!= true || isPalindrome(i) != true ){
				i--;
			}
			return i;
		}
	
	// test de produit de deux nombres à 3 chiffres
		public boolean isProduit (int nbre){
			for (int i=100; i<=999; i++){
				if(nbre%i==0){ // test de la divisibilité
					if(nbre/i>99 && nbre/i<=999){
						System.out.println("premier diviseur"+i);
						System.out.println("deuxieme diviseur"+nbre/i);
						return true;
					}
				}
			}
			return false;
		}

		// test si un nombre est palindrome
		public boolean isPalindrome (int nbre){
			String s=Integer.toString(nbre);	//convertir un int en String on utilisant la class wrapper Integer
			for(int i=0; i<s.length()/2; i++){
				if(s.charAt(i) != s.charAt(s.length()-i-1)){	// test de l'egalite de deux caractere avec symbole = (char est un type primitif)
					return false;
				}
			}
			return true; 
		}
}
