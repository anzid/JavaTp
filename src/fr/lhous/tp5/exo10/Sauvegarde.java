package fr.lhous.tp5.exo10;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import fr.lhous.tp3.exo3.Marin;

public class Sauvegarde {
	public Sauvegarde(){
	};
	
	public static void sauveFichierTexte(String nomFichier, Marin marin){
		File fichier = new File(nomFichier);
		try{
			Writer write = new FileWriter(fichier, true);
			String buffer = marin.getNom()+"|"+marin.getPrenom()+"|"+marin.getSalaire()+"\n";
			write.write(buffer);
			write.close();
		}	catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Marin[] lisFichierTexte(String nomFichier){
		Marin[] marins;
		FileReader fr= new FileReader("marin.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		String line = null;
		while(line != null){
			int number =lnr.getLineNumber();
			line = lnr.readLine();
			if(lnr != null){
				String nom = line.substring(0, line.indexOf("|", 0));
				String prenom = line.substring(line.indexOf("|",0),line.indexOf("|", line.indexOf("|",0))+1);
				String prennom = line.su

			}
			
		}
		
		
	}
	
	public static void sauveFichierBinaire(String nomFichier, Marin marin) throws UnsupportedEncodingException{
		try {
			FileOutputStream fos = new FileOutputStream(new File(nomFichier + ".txt"));
			@SuppressWarnings("resource")
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			DataOutputStream dos = new DataOutputStream(fos);
			String buffer = marin.getNom()+"|"+marin.getPrenom()+"|"+marin.getSalaire();
			System.out.println(buffer);
			try {
				osr.write(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}