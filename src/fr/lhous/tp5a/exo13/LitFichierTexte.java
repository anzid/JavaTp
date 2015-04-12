package fr.lhous.tp5a.exo13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class LitFichierTexte {
	
	public LitFichierTexte(){
		
	}
	
	
	public static List<String> LisFichierTexte() {
		FileReader fr = null;
		int numberLine = 0;
		int nombreTerer = 0;
		int nombreIlYa = 0;
		int nombreMots = 0;
		
		
		List <String> texte = new ArrayList<>();
		try{
			fr = new FileReader("files/germinal.txt");
			LineNumberReader lnr = new LineNumberReader(fr);
			String line = null;
			StringTokenizer st = new StringTokenizer(line.toString());//definir la separation entre les mots
			do{
				line = lnr.readLine();
				if(line != null){
					texte.add(line);
					numberLine ++; //nombre de ligne est : 19615
					if(line.startsWith("-")){
						nombreTerer ++;
					}
					
					while(st.hasMoreTokens()){//tant que y'a d'autre mots a lire
						nombreMots ++;
					}
					
					if (line.contains("il y a ") || line.contains(" il y a ")){
						nombreIlYa++;
					}
				}
			}while(line != null);
			System.out.println("le nombre de lignes est : " + numberLine);//resultat : 19615
			System.out.println("le nombre de terer est : " + nombreTerer);//resultat : 1356
			System.out.println("le nombre de il y a est : " + nombreIlYa);//resultat : 18

		}	catch (FileNotFoundException e) { 

			System.out.println("Erreur " + e.getMessage()) ;

		}  catch (IOException e) {

			System.out.println("Erreur " + e.getMessage()) ;

		}  finally {

			// pattern de fermeture d'un flux
			if (fr != null) {

				try {

					fr.close() ;

				}  catch (IOException e) {

					System.out.println("Erreur " + e.getMessage()) ;
				}
			}
		}
		return texte;
	}
	
	public static int nombreMotsDansFichier(List<String> lines){
		StringTokenizer st = new StringTokenizer(lines.toString());//definir la separation entre les mots
		int nombreMots = 0;
		for(String s : lines){
			while(st.hasMoreTokens()){//tant que y'a d'autre mots a lire
				nombreMots ++;
			}
		}
		return nombreMots;
	}

	
}
