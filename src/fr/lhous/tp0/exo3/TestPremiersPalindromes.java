package fr.lhous.tp0.exo3;

public class TestPremiersPalindromes {
	public static void main(String[] args)
	{
		System.out.println("isPrime : " + new PremiersPalindromes(9).isPrime());//false
		System.out.println("isPrime : " + new PremiersPalindromes(11).isPrime());//true
		System.out.println("isPalindrome : " + new PremiersPalindromes(221).isPalindrome());//false
		System.out.println("isPalindrome : " + new PremiersPalindromes(111).isPalindrome());//true
		new PremiersPalindromes(99999).generateurPremiersPalindromes();
	}  
}