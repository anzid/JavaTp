package fr.lhous.tp5.exo10;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import fr.lhous.tp3.exo3.Marin;

public class Sauvegarde {
	private Sauvegarde(){
		
	};
	
	public static void sauveFichierTexte(String nomFichier, Marin marin){
		try {
			FileOutputStream fos = new FileOutputStream(new File(nomFichier + ".txt"));
			DataOutputStream dos = new DataOutputStream(fos);
			String buffer = marin.getNom()+"|"+marin.getPrenom()+"|"+marin.getSalaire();
			dos.writeByte();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
