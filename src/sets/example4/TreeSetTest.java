package sets.example4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;

class TreeSetTest
{
	public static void main(String[] args)
	{
		Integer[] luvut = {1,4,2,3,5,8,6};
		
		SortedSet<Integer> lukuPuuJoukko = new TreeSet<Integer>(Arrays.asList(luvut));
		lukuPuuJoukko.add(7);
		
		System.out.println("Järjestetty TreeSet-joukko");
		Iterator<Integer> i = lukuPuuJoukko.iterator();
		while(i.hasNext())
			System.out.print(i.next() + " ");
			
		System.out.println();
		System.out.println("Pienempiä kuin nelonen " + lukuPuuJoukko.headSet(4));
		System.out.println("Vähintään nelonen " + lukuPuuJoukko.tailSet(4));
		
		System.out.println("Joukon ensimmäinen " + lukuPuuJoukko.first());
		System.out.println("Joukon viimeinen " + lukuPuuJoukko.last());
		
	}
}
