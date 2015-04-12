package fr.lhous.tp5a.exo12;

import java.io.IOException;

public class TestLireFichier {

	public static void main(String[] args) throws IOException {
		LireFichier lireFichier = new LireFichier();
		lireFichier.LisFichierTexte();
		System.out.println("PREMIERscORE"+LireFichier.scoreName("AARON"));
		System.out.println(LireFichier.scoreNames(lireFichier.LisFichierTexte()));

	}

}
