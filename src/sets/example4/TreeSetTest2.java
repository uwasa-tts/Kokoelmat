package sets.example4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

class TreeSetTest2
{
	public static void main(String[] args)
	{
		String[] v�rit = {"musta", "punainen", "sininen", "valkoinen", "keltainen"};
		
		TreeSet<String> variPuuJoukko = new TreeSet<String>(Arrays.asList(v�rit));
		variPuuJoukko.add("vihre�");
		variPuuJoukko.add("oranssi");
		
		System.out.println("J�rjestetty TreeSet-joukko");
		Iterator<String> i = variPuuJoukko.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Aakkosissa ennen punaista " + variPuuJoukko.headSet("punainen"));
		System.out.println("Aakkosissa punaisen j�lkeen " + variPuuJoukko.tailSet("punainen"));
		
		System.out.println("Joukon ensimm�inen " + variPuuJoukko.first());
		System.out.println("Joukon viimeinen " + variPuuJoukko.last());
		
	}
}
