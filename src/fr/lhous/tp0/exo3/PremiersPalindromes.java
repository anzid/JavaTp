package fr.lhous.tp0.exo3;

public class PremiersPalindromes {  
	int nbre;	//champ de l'objet PremiersPalindromes

	//constructeur
	public PremiersPalindromes(int i){
		this.nbre = i;
	}

	//generer les nombres premiers palindromes de 1 jusqu'a n
	public void generateurPremiersPalindromes(){
		for(int i=1; i<this.nbre; i++){
			if(new PremiersPalindromes(i).isPrime() == true && new PremiersPalindromes(i).isPalindrome() == true){
				System.out.println(i+"\n");
			}
		}
	}

	// test de primarite
	public boolean isPrime (){
		for (int i=2; i<=Math.sqrt(this.nbre); i++){
			if(this.nbre%i==0) // test de la divisibilité
				return false;
		}
		return true; //aucun nombre entre 2 et sqrt(n) divise n
	}

	// test si un nombre est palindrome
	public boolean isPalindrome (){
		String s=Integer.toString(this.nbre);	//convertir un int en String on utilisant la class wrapper Integer
		for(int i=0; i<s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)){	// test de l'egalite de deux caractere avec symbole = (char est un type primitif)
				return false;
			}
		}
		return true; 
	}
}
