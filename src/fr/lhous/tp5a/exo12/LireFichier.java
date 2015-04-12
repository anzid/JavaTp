package fr.lhous.tp5a.exo12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class LireFichier {

	// constructeur vide
	public LireFichier(){

	}
	//lit le fichier texte et retourne une liste des noms
	public static SortedSet<String> LisFichierTexte() {
		//une liste avec tri
		SortedSet<String> names = new TreeSet<String>();
		FileReader fr = null;
		try{
			fr = new FileReader("files/names.txt");
			LineNumberReader lnr = new LineNumberReader(fr);
			String line = null;
			do{
				line = lnr.readLine();//lecture d'une ligne
				if(line != null){
					StringTokenizer st = new StringTokenizer(line,"\",\"");//definir la separation entre les mots
					while(st.hasMoreTokens()){//tant que y'a d'autre mots a lire
						names.add(st.nextToken());//ajouter le mot suivant dans la liste
					}
				}
			}while(line != null);//detecter la fin de la lecture

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
		return names;
	}

	//retourne le score d'un nom
	public static int scoreName(String name){
		int score = 0;
		for(int i=0; i < name.length(); i++){	//parcourir les lettres d'un nom
			//on convertit les lettre an ascii et on translate les valeurs en ascii vers les scores
			score = score + (int) name.charAt(i) - 64;
		}
		return score;
	}

	//prend en argument la liste des noms recuperé est retourne le score totale du fichier
	public static int totalScore(SortedSet<String> names){
		List <Integer> scores = new ArrayList<>();	//liste qui contiendra les scores de chaque nom
		int position = 1;
		int totalScore = 0;
		for(String n : names){	//parcourir tout les noms
			scores.add( scoreName(n));	//ajouter le score dans la list des scores
		}
		for(Integer i : scores){	//parcourir la liste des scores
			totalScore = totalScore + position * i;	//multiplier chaque score par son index correspaondant
			position++;
		}
		return totalScore;	//resultat : 871198282
	}
}