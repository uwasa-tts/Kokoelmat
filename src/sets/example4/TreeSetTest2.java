package sets.example4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

class TreeSetTest2
{
	public static void main(String[] args)
	{
		String[] värit = {"musta", "punainen", "sininen", "valkoinen", "keltainen"};
		
		TreeSet<String> variPuuJoukko = new TreeSet<String>(Arrays.asList(värit));
		variPuuJoukko.add("vihreä");
		variPuuJoukko.add("oranssi");
		
		System.out.println("Järjestetty TreeSet-joukko");
		Iterator<String> i = variPuuJoukko.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Aakkosissa ennen punaista " + variPuuJoukko.headSet("punainen"));
		System.out.println("Aakkosissa punaisen jälkeen " + variPuuJoukko.tailSet("punainen"));
		
		System.out.println("Joukon ensimmäinen " + variPuuJoukko.first());
		System.out.println("Joukon viimeinen " + variPuuJoukko.last());
		
	}
}
