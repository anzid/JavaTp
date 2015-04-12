package fr.lhous.tp5a.exo13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class LitFichierTexte {
	
	public LitFichierTexte(){
		
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

}
