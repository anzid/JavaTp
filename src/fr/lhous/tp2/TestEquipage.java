package fr.lhous.tp2;
import fr.lhous.tp3.exo3.Capitaine;
/*import fr.lhous.tp1.Marin; source d'un erreur pas facile à dibuger: Capitaine etend marin du tp3 et j'importe un autre marin de tp1, 
*donc impssible d'ajouter un capitaine dans un equipage*/
import fr.lhous.tp3.exo3.Marin;	//la bonne class Marin à importer

public class TestEquipage {
	public static void main(String[] args)
	{
		Equipage m = new Equipage(5);
		m.addMarin(new Marin("aaa","bbb"));
		m.addMarin(new Marin("ccc","ddd"));
		m.addMarin(new Marin("eee","fff"));
		System.out.println(m.addMarin(new Marin("eee","fff")));//retourne false on peut pas ajouter un marin deja existant
		m.addMarin(new Marin("ggg","hhh"));
		Marin mu =new Marin("ccc","ddd");
		System.out.println(m.addMarin(new Marin("iii","jjj")));//retourne true
		System.out.println(m.addMarin(new Marin("kkk","lll")));//retourne false, il y'a plus de place disponible
		//afichier les marins de l'equipage
		System.out.println(m.marins[0]);
		System.out.println(m.marins[1]);
		System.out.println(m.marins[2]);
		System.out.println(m.marins[3]);
		System.out.println(m.marins[4]);
		System.out.println(m);// teste de la methode toString();
		//System.out.println(m.removeMarin(mu));// retourne true
		//System.out.println(m.marins[1]);// retourne null donc le marin a bien ete retire
		//m.clear();
		//System.out.println(m);null
		Equipage equipage1 = new Equipage(5);
		equipage1.addMarin(new Marin("aaa","bbb"));
		equipage1.addMarin(new Marin("ccc","ddd"));
		equipage1.addMarin(new Marin("eee","fff"));
		equipage1.addMarin(new Marin("ggg","hhh"));
		equipage1.removeMarin(mu);// test removeMarin
		System.out.println("equipage1" + equipage1);
		Equipage equipage2 = new Equipage(6);
		equipage2.addMarin(new Marin("sfgd","hjkf"));
		System.out.println("equipage2" + equipage2);
		equipage1.addAllEquipage(equipage2);
		System.out.println("equipage1" + equipage1);
		System.out.println("equipage1 etendu "  + equipage1.etendEquipage(2));
		equipage1.clear();
		equipage2.clear();
		
		//test du hashCode
		Equipage equipage10 = new Equipage(5);
		equipage1.addMarin(new Marin("aaa","bbb"));
		equipage1.addMarin(new Marin("ccc","ddd"));
		equipage1.addMarin(new Marin("eee","fff"));
		equipage1.addMarin(new Marin("ggg","hhh"));
		Equipage equipage11 = new Equipage(5);
		equipage2.addMarin(new Marin("aaa","bbb"));
		equipage2.addMarin(new Marin("eee","fff"));
		equipage2.addMarin(new Marin("ccc","ddd"));
		equipage2.addMarin(new Marin("ggg","hhh"));
		System.out.println(equipage10.hashCode()); //resultat = 1
		System.out.println(equipage11.hashCode()); //resultat = 1
		System.out.println(equipage1.hashCode());  //resultat = -1036097919
		System.out.println(equipage2.hashCode());  //resultat = -1036097919
		
		// test ajout d'un capitaine dans un equipage
		Equipage equipage20 = new Equipage(5);
		Capitaine capitaine = new Capitaine("aaa","bbb",1000,"COMMANDANT");
		System.out.println(equipage20.addMarin(new Marin("aaa","bbb")));
		System.out.println(equipage20.addMarin(new Marin("ccc","bbb")));
		System.out.println(equipage20.addMarin(capitaine));
	}
}
