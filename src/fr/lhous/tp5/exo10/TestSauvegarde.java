package fr.lhous.tp5.exo10;
import java.io.UnsupportedEncodingException;

import fr.lhous.tp3.exo3.Marin;

public class TestSauvegarde {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//Sauvegarde sauvegarde = new Sauvegarde();
		Marin marin = new Marin("aaaa", "bbbb", 1000);
		Sauvegarde.sauveFichierTexte("marins", marin);
		Marin marin1 = new Marin("cccc", "bbbb", 2000);
		Sauvegarde.sauveFichierTexte("marins", marin1);
	}
}
