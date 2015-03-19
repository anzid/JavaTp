package fr.lhous.tp2;
import fr.lhous.tp1.Marin;

public class TestEquipage {
	public static void main(String[] args)
	{
		Equipage m = new Equipage(5);
		m.addMarin(new Marin("aaa","bbb"));
		m.addMarin(new Marin("ccc","ddd"));
		m.addMarin(new Marin("eee","fff"));
		System.out.println(m.addMarin(new Marin("eee","fff")));
		m.addMarin(new Marin("ggg","hhh"));
		Marin mu =new Marin("ccc","ddd");
		System.out.println(m.addMarin(new Marin("iii","jjj")));//retourne true
		System.out.println(m.addMarin(new Marin("kkk","lll")));//retourne false
		System.out.println(m.marins[0]);
		System.out.println(m.marins[1]);
		System.out.println(m.marins[2]);
		System.out.println(m.marins[3]);
		System.out.println(m.marins[4]);
		System.out.println(m);// teste de la methode toString();
		//System.out.println(m.removeMarin(mu));// retourne true
		//System.out.println(m.marins[1]);// retourne null donc le marin a bien ete retire
		/*m.clear();
		System.out.println(m.marins[0]);//null
		System.out.println(m.marins[1]);//null
		System.out.println(m.marins[2]);//null
		System.out.println(m.marins[3]);//null
		System.out.println(m.marins[4]);//null*/
		Equipage equipage1 = new Equipage(5);
		equipage1.addMarin(new Marin("aaa","bbb"));
		equipage1.addMarin(new Marin("ccc","ddd"));
		equipage1.addMarin(new Marin("eee","fff"));
		equipage1.addMarin(new Marin("ggg","hhh"));
		equipage1.removeMarin(mu);
		System.out.println("equipage1" + equipage1);
		Equipage equipage2 = new Equipage(6);
		equipage2.addMarin(new Marin("sfgd","hjkf"));
		System.out.println("equipage2" + equipage2);
		equipage1.addAllEquipage(equipage2);
		System.out.println("equipage1" + equipage1);
		System.out.println("equipage1 etendu "  + equipage1.etendEquipage(2));
		//test du hashCode
		Equipage equipage10 = new Equipage(5);
		equipage1.addMarin(new Marin("aaa","bbb"));
		equipage1.addMarin(new Marin("ccc","ddd"));
		equipage1.addMarin(new Marin("eee","fff"));
		equipage1.addMarin(new Marin("ggg","hhh"));
		Equipage equipage11 = new Equipage(5);
		equipage1.addMarin(new Marin("aaa","bbb"));
		equipage1.addMarin(new Marin("eee","fff"));
		equipage1.addMarin(new Marin("ccc","ddd"));
		equipage1.addMarin(new Marin("ggg","hhh"));
		System.out.println(equipage10.hashCode()); //resultat = 1
		System.out.println(equipage11.hashCode()); //resultat = 1
		System.out.println(equipage1.hashCode());  //resultat = -895842099
		System.out.println(equipage2.hashCode());  //resultat = 112550221

	}
}
