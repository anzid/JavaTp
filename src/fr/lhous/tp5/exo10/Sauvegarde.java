package fr.lhous.tp5.exo10;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import fr.lhous.tp3.exo3.Marin;

public class Sauvegarde {
	public Sauvegarde(){
	};

	public static void sauveFichierTexte(String nomFichier, Marin marin){
		File fichier = new File(nomFichier);
		Writer write =null;
		try{
			write = new FileWriter(fichier, true);
			String buffer = marin.getNom()+"|"+marin.getPrenom()+"|"+marin.getSalaire()+"\n";
			write.write(buffer);
		}	catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(write != null){
				try{
					write.close();
				} catch(IOException e){
					e.printStackTrace();

				}
			}
		}
	}

	public static Marin[] lisFichierTexte(String nomFichier) throws IOException{
		int i =0;
		Marin[] marins = new Marin[50];
		FileReader fr= new FileReader("marins");
		@SuppressWarnings("resource")
		LineNumberReader lnr = new LineNumberReader(fr);
		String line = null;
		do {
			line = lnr.readLine();
			if(lnr != null){
				String nom = line.substring(0, line.indexOf("|", 0));
				String prenom = line.substring(line.indexOf("|",0)+1,line.indexOf("|", line.indexOf("|",0)+1));
				String salaire = line.substring(line.indexOf("|", line.indexOf("|",0)+1)+1);
				marins[i] = new Marin(nom, prenom, Integer.parseInt(salaire)); 
				System.out.println(marins[i]);
				i++;
			}
		}
		while(line != null);
		return marins;
	}

	public static void sauveFichierBinaire(String nomFichier, Marin marin){
		try{
			File file = new File(nomFichier);
			FileOutputStream fos = new FileOutputStream(file,true);
			DataOutputStream dos = new  DataOutputStream(fos);
			dos.writeUTF(marin.getNom());
			dos.writeUTF(marin.getPrenom());
			dos.writeUTF(String.valueOf(marin.getSalaire()));
			dos.close();

		}	catch (IOException e) {
			e.printStackTrace();
		}
		finally{
		}
	}

	public static List<Marin> lisFichierBinaire(String nomFichier) throws IOException{
		List<Marin> marins = new ArrayList<Marin> ();
		FileInputStream fis = new FileInputStream("marins.txt");
		DataInputStream dis = new DataInputStream(fis);
		while(dis.available()>0)
		{
			String nom = dis.readUTF();
			String prenom = dis.readUTF();
			int salaire = Integer.parseInt(dis.readUTF());
			marins.add(new Marin(nom, prenom, salaire));
		}
		dis.close();
		return marins;
	}

	/*	public static void sauveObjet(String nomFichier, Marin marin){
		File fichier = new File("marins.txt");
		try {
			@SuppressWarnings("resource")
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier));
			oos.writeObject(marin);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	public static void sauveObjet(String nomFichier, List<Marin> marin){
		File fichier = new File("marins.txt");
		try {
			@SuppressWarnings("resource")
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier));
			oos.writeObject(marin);

			/*for(Marin i:marin){
				oos.writeObject(i);
			}*/
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Marin> lisObjet(String nomFichier) throws FileNotFoundException, IOException, ClassNotFoundException{
		//List<Marin> marins = new ArrayList<Marin> ();
		File fichier = new File("marins.txt");
		FileInputStream is = new FileInputStream(fichier);
		ObjectInputStream ois = new ObjectInputStream(is);
		List<Marin> l = (List<Marin>) ois.readObject();
		/*while(is.available()>0)
		{
			Marin m =(Marin) ois.readObject();
			marins.add(m);
		}*/
		ois.close();
		return l;
	}
}