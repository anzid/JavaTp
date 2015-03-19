package fr.lhous.tp0.exo2;

public class TestFactorielle {
	public static void main(String[] args) throws FactorielleException //pour gerer l'exeption
	{
		Factorielle fact = new Factorielle();//création d'un objet factorielle
		//test de la methode factorielle
		System.out.println("Factorielle est = " + fact.factorielle(0)); 
		System.out.println("Factorielle est = " + fact.factorielle(3));
		//System.out.println("Factorielle est = " + fact.factorielle(-1));// test de FactorielleException
		//teste de la methode factorielle_double
		System.out.println("Factorielle est = " + fact.factorielleDouble(0));
		System.out.println("Factorielle est = " + fact.factorielleDouble(3.2));
		//System.out.println("Factorielle est = " + fact.factorielle_double(-3.2));// test de FactorielleException
		//test de la methode factorielle_BI
		System.out.println("Factorielle est = " + fact.factorielleBi(0));
		System.out.println("Factorielle est = " + fact.factorielleBi(20));
		//System.out.println("Factorielle est = " + fact.factorielle_BI(-20));// test de FactorielleException
	}
}