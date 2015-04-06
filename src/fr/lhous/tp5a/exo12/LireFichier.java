package fr.lhous.tp5a.exo12;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.SortedSet;
import java.util.TreeSet;


public class LireFichier {
	
	public LireFichier(){
		
	}
	
	public void LisFichierTexte() throws IOException{
		SortedSet<String> names = new TreeSet<String>();
		FileReader fr = new FileReader("files/names.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		int n =0;
		String line = null;
		while(line != null){
			line = lnr.readLine();
			System.out.println("aaa");
			System.out.println(lnr);
		}
		fr.close();
		
	}
}
