package fr.lhous.tp4.exo8;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import fr.lhous.tp4.exo7.Marin;

public class TestMarinComparator {

	public static void main(String[] args) {
		SortedSet<Marin> marins = new TreeSet<Marin>(new MarinComparator());
		Marin marin1 = new Marin("aaa", "bbb",1000);
		Marin marin2 = new Marin("ccc", "ddd",2000);
		Marin marin3 = new Marin("eee", "fff",3000);
		marins.add(marin1);
		marins.add(marin2);
		marins.add(marin3);
		MarinComparator marinComparator = new MarinComparator();
		//Comparator<Marin> marinComparator = new MarinComparator();
		System.out.println(marinComparator.compare(marin1, marin2));
		System.out.println(marinComparator.compare(marin3, marin3));
	}
}
