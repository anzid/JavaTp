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
import java.util.regex.Pattern;

public class LireFichier {

	// constructeur vide
	public LireFichier(){

	}

	public SortedSet<String> LisFichierTexte() {
		SortedSet<String> names = new TreeSet<String>();
		FileReader fr = null;
		try{
			fr = new FileReader("files/names.txt");
			LineNumberReader lnr = new LineNumberReader(fr);
			String line = null;
			do{
				line = lnr.readLine();
				if(line != null){
					System.out.println(line);
					StringTokenizer st = new StringTokenizer(line,"\",\"");
					while(st.hasMoreTokens()){
						names.add(st.nextToken());
					}
				}
			}while(line != null);
			System.out.println(names);


		}	catch (FileNotFoundException e) { 

			// gestion de l'erreur

		}  catch (IOException e) {

			// gestion de l'erreur

		}  finally {

			// pattern de fermeture d'un flux
			if (fr != null) {

				try {

					fr.close() ;

				}  catch (IOException e) {

					// gestion de l'erreur
				}
			}
		}
		return names;

	}

	//retourne le score d'un nom
	public static int scoreName(String name){
		int score = 0;
		for(int i=0; i < name.length(); i++){
			//on convertit les lettre an ascii et on translate les valeurs en ascii vers les scores
			score = score + (int) name.charAt(i) - 64;
		}
		return score;
	}

	public static int scoreNames(SortedSet<String> names){
		List <Integer> scores = new ArrayList<>();
		int position = 1;
		int totalScore = 0;
		for(String n : names){
			scores.add( scoreName(n));
			System.out.println(position * scoreName(n));
		}
		for(Integer i : scores){
			totalScore = totalScore + position * i;
		}
		return totalScore;
	}

}
