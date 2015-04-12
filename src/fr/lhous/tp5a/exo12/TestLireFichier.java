package fr.lhous.tp5a.exo12;

import java.io.IOException;

public class TestLireFichier {

	public static void main(String[] args) throws IOException {
		//toute les methodes sont statique, donc on appell les methodes par une facon statique
		LireFichier.LisFichierTexte();
		System.out.println("PREMIERscORE"+LireFichier.scoreName("AARON"));
		System.out.println(LireFichier.totalScore(LireFichier.LisFichierTexte()));
	}
}
