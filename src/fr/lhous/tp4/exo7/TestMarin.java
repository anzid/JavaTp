package fr.lhous.tp4.exo7;

import java.util.HashSet;
import java.util.Set;

public class TestMarin {
	
	public static void main(String[] args) {
		Set<Marin> marins = new HashSet<Marin>();
		Marin marin1 = new Marin("aaa","bbb",1000);
		Marin marin2 = new Marin("aaa","bbb",1000);
		Marin marin3 = new Marin("ccc","ddd",2000);
		marins.add(marin1);
		marins.add(marin2);
		marins.add(marin3);
		System.out.println(marins);	
		System.out.println(marin1.hashCode());
		System.out.println(marin2.hashCode());
		System.out.println(marin3.hashCode());
		/*quand on surcharge equals et hashcode, le marins2 ne s'ajoute pas dans la liste parce qu'elle accepte pas les doublants*/
	}
}