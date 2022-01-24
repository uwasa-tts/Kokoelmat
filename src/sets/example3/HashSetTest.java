package sets.example3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		/*
		 * Olio voi tallentua vain kerran
		 * Olioiden tallennus luonnollisessa j‰rjestyksess‰ tai luontivaiheessa m‰‰ritellyn vertailijan mukaan j‰rjestettyn‰
		 */
		
		Set<String> variJoukko = new HashSet<String>();
		variJoukko.add("valkoinen");
		variJoukko.add("punainen");
		variJoukko.add("musta");
		variJoukko.add("sininen");
		variJoukko.add("keltainen");
		
		System.out.println("HashSet - v‰rit: " + variJoukko);
		
		Set<Integer> lukuJoukko = new HashSet<Integer>();
		lukuJoukko.add(1);
		lukuJoukko.add(3);
		lukuJoukko.add(8);
		lukuJoukko.add(6);
		lukuJoukko.add(5);
		lukuJoukko.add(5);
		lukuJoukko.add(5);
		
		System.out.println("HashSet - luvut : " + lukuJoukko);
		
		/*
		 * Oliot sijoitusj‰rjestyksess‰‰n
		 */
		LinkedHashSet<Integer> lukuJoukko2 = new LinkedHashSet<Integer>();
		lukuJoukko2.add(2);
		lukuJoukko2.add(9);
		lukuJoukko2.add(7);
		lukuJoukko2.add(3);
		lukuJoukko2.add(6);
		lukuJoukko2.add(5);
		lukuJoukko2.add(5);
		
		System.out.println("LinkedHashSet - luvut : " + lukuJoukko2);
		
		lukuJoukko2.remove(2);

		System.out.println("LinkedHashSet - luvut : " + lukuJoukko2);
	}

}

