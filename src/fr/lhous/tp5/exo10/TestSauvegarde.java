package fr.lhous.tp5.exo10;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import fr.lhous.tp3.exo3.Marin;

public class TestSauvegarde {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Sauvegarde sauvegarde = new Sauvegarde();
		Marin marin = new Marin("aaaa", "bbbb", 10);
		//Sauvegarde.sauveFichierTexte("marins", marin);
		//Sauvegarde.sauveFichierBinaire("marins.txt", marin);
		//System.out.println(Sauvegarde.lisFichierBinaire("marins.txt"));
		Marin marin1 = new Marin("cccc", "dddd", 1);
		//Sauvegarde.sauveFichierTexte("marins", marin1);
		//Sauvegarde.lisFichierTexte("marins");
		//System.out.println(Sauvegarde.lisFichierTexte("marins"));
		List<Marin> marins = new ArrayList<Marin> ();
		marins.add(marin);
		marins.add(marin1);
		marins.add(marin);
		Sauvegarde.sauveObjet("marins.txt", marins);
		System.out.println(Sauvegarde.lisObjet("marins.txt"));
		
	}
}
